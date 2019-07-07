package dev.cheerfun.pixivic.entity;

public class IllustsArtist  {

    private Long artistId;

    /**
     * 画师名字
     */
    private String name;

    /**
     * 账户
     */
    private String account;

    /**
     * 画师头像只有一张图，把URL截出来
     */
    private String profileImageUrl;

    /**
     * 个性签名
     */
    private String comment;

    private Integer isFollowed;

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(Integer isFollowed) {
        this.isFollowed = isFollowed;
    }
}
