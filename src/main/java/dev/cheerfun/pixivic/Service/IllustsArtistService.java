package dev.cheerfun.pixivic.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import dev.cheerfun.pixivic.constant.IllustsConstant;
import dev.cheerfun.pixivic.entity.IllustsArtist;
import dev.cheerfun.pixivic.entity.IllustsArtistProfile;
import dev.cheerfun.pixivic.mapper.IllustsArtistMapper;
import dev.cheerfun.pixivic.mapper.IllustsArtistProfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IllustsArtistService {


    @Autowired
    private IllustsArtistMapper illustsArtistMapper;

    @Autowired
    private IllustsArtistProfileMapper illustsArtistProfileMapper;

    public void insertIllustsArtist(IllustsArtist illustsArtist) {
        illustsArtistMapper.insertIllustsArtist(illustsArtist);
    }

    public void insertIllustsArtistProfileWithoutId(IllustsArtistProfile IllustsArtistProfile) {
        illustsArtistProfileMapper.insertIllustsArtistProfileWithoutId(IllustsArtistProfile);
    }


    public void resolveArtistJsonAndFill(String json, IllustsArtist illustsArtist, IllustsArtistProfile illustsArtistProfile) {
        JSONObject jsonObject = JSON.parseObject(json);
        JSONObject user = jsonObject.getJSONObject("user");
        if (user != null) {
            illustsArtist.setArtistId(user.getLong("id"));
            String name = user.getString("name");
            if (name != null) {
                illustsArtist.setName(name);
            } else {
                illustsArtist.setName("");
            }
            String account = user.getString("account");
            if (account != null) {
                illustsArtist.setAccount(account);
            } else {
                illustsArtist.setAccount("");
            }
            String profileImageUrls = user.getJSONObject("profile_image_urls").getString("medium");
            if (profileImageUrls != null) {
                illustsArtist.setProfileImageUrl(profileImageUrls);
            } else {

                illustsArtist.setProfileImageUrl("");
            }
            String comment = user.getString("comment");
            if (comment != null) {
                illustsArtist.setComment(comment);
            } else {
                illustsArtist.setComment("");
            }


            user.getBoolean("is_followed");
            Boolean isFollowed = user.getBoolean("is_followed");
            if (isFollowed != null) {
                illustsArtist.setIsFollowed(isFollowed == false ? 0 : 1);
            }
        }

        JSONObject profile = jsonObject.getJSONObject("profile");
        if (profile != null) {
            String webpage = profile.getString("webpage");
            if (webpage == null) {
                illustsArtistProfile.setWebpage("");
            } else {
                illustsArtistProfile.setWebpage(webpage);
            }
            String gender = profile.getString("gender");
            if (gender != null && IllustsConstant.IllustsArtistGenderConstant.MALE.getGender().equals(gender)) {
                illustsArtistProfile.setGender(IllustsConstant.IllustsArtistGenderConstant.MALE.getState());
            } else if (gender != null && IllustsConstant.IllustsArtistGenderConstant.FEMALE.getGender().equals(gender)) {
                illustsArtistProfile.setGender(IllustsConstant.IllustsArtistGenderConstant.MALE.getState());
            } else {
                illustsArtistProfile.setGender(IllustsConstant.IllustsArtistGenderConstant.NULL.getState());
            }
            String region = profile.getString("region");
            if (region == null) {
                illustsArtistProfile.setRegion("");
            } else {
                illustsArtistProfile.setRegion(region);
            }

            String twitterAccount = profile.getString("twitter_account");
            if (twitterAccount == null) {
                illustsArtistProfile.setTwitterAccount("");
            } else {
                illustsArtistProfile.setTwitterAccount(twitterAccount);
            }

            String twitterUrl = profile.getString("twitter_url");
            if (twitterUrl == null) {
                illustsArtistProfile.setTwitterUrl("");
            } else {
                illustsArtistProfile.setTwitterUrl(twitterUrl);
            }
        }
    }
}
