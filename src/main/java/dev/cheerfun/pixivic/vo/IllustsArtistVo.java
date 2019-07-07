package dev.cheerfun.pixivic.vo;

import dev.cheerfun.pixivic.entity.IllustsArtist;

public class IllustsArtistVo extends IllustsArtist {
    private Long profileId;

    /**
     * 画师id 逻辑外键
     */
    private Long artistId;

    /**
     * 微博链接
     */
    private String webpage;

    /**
     * 0：男、1：女
     */
    private Integer gender;

    /**
     * 地区
     */
    private String region;

    /**
     * 推特账户
     */
    private String twitterAccount;

    /**
     * 推特链接
     */
    private String twitterUrl;

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    @Override
    public Long getArtistId() {
        return artistId;
    }

    @Override
    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }
}
