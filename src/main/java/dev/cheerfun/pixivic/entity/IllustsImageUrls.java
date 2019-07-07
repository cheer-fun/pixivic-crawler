package dev.cheerfun.pixivic.entity;

public class IllustsImageUrls {

    private Long imageUrlId;

    /**
     * 插画id
     */
    private Long illustsId;

    /**
     * 方形预览图
     */
    private String squareMedium;

    /**
     * 中图
     */
    private String medium;

    /**
     * 大图
     */
    private String large;

    /**
     * 原图
     */
    private String original;

    /**
     * 0:不是封面、1:是封面
     */
    private Integer isCover;

    public Long getImageUrlId() {
        return imageUrlId;
    }

    public void setImageUrlId(Long imageUrlId) {
        this.imageUrlId = imageUrlId;
    }

    public Long getIllustsId() {
        return illustsId;
    }

    public void setIllustsId(Long illustsId) {
        this.illustsId = illustsId;
    }

    public String getSquareMedium() {
        return squareMedium;
    }

    public void setSquareMedium(String squareMedium) {
        this.squareMedium = squareMedium;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public Integer getIsCover() {
        return isCover;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
    }
}
