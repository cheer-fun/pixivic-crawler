package dev.cheerfun.pixivic.entity;

public class IllustsTags {


    private Long tagsId;

    /**
     * 插画id
     */
    private Long illustsId;

    /**
     * 名字
     */
    private String name;

    /**
     * 中文名字
     */
    private String translatedName;

    public Long getTagsId() {
        return tagsId;
    }

    public void setTagsId(Long tagsId) {
        this.tagsId = tagsId;
    }

    public Long getIllustsId() {
        return illustsId;
    }

    public void setIllustsId(Long illustsId) {
        this.illustsId = illustsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
    }
}
