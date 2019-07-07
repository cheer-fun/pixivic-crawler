package dev.cheerfun.pixivic.entity;

import org.springframework.stereotype.Service;

import java.util.Date;

public class Illusts {
    private Long illustsId;
    private String title;
    private Integer type;
    private String caption;
    private Integer restrict;
    private Long artistId;
    private String tools;
    private Date createDate;
    private Long pageCount;
    private Integer width;
    private Integer height;
    private Integer sanityLevel;
    private Integer xRestrict;
    private Long totalView;
    private Long totalBookmarks;
    private Long totalComments;

    public Long getIllustsId() {
        return illustsId;
    }

    public void setIllustsId(Long illustsId) {
        this.illustsId = illustsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getRestrict() {
        return restrict;
    }

    public void setRestrict(Integer restrict) {
        this.restrict = restrict;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSanityLevel() {
        return sanityLevel;
    }

    public void setSanityLevel(Integer sanityLevel) {
        this.sanityLevel = sanityLevel;
    }

    public Integer getxRestrict() {
        return xRestrict;
    }

    public void setxRestrict(Integer xRestrict) {
        this.xRestrict = xRestrict;
    }

    public Long getTotalView() {
        return totalView;
    }

    public void setTotalView(Long totalView) {
        this.totalView = totalView;
    }

    public Long getTotalBookmarks() {
        return totalBookmarks;
    }

    public void setTotalBookmarks(Long totalBookmarks) {
        this.totalBookmarks = totalBookmarks;
    }

    public Long getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(Long totalComments) {
        this.totalComments = totalComments;
    }

    @Override
    public String toString() {
        return "Illusts{" +
                "illustsId=" + illustsId +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", caption='" + caption + '\'' +
                ", restrict=" + restrict +
                ", artistId=" + artistId +
                ", tools='" + tools + '\'' +
                ", createDate=" + createDate +
                ", pageCount=" + pageCount +
                ", width=" + width +
                ", height=" + height +
                ", sanityLevel=" + sanityLevel +
                ", xRestrict=" + xRestrict +
                ", totalView=" + totalView +
                ", totalBookmarks=" + totalBookmarks +
                ", totalComments=" + totalComments +
                '}';
    }
}
