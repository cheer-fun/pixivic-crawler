package dev.cheerfun.pixivic.mapper;

import dev.cheerfun.pixivic.entity.IllustsTags;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IllustsTagsMapper {

    void insertIllustsTags(IllustsTags illustsTags);

    void insertIllustsTagsWithoutId(IllustsTags illustsTags);
}
