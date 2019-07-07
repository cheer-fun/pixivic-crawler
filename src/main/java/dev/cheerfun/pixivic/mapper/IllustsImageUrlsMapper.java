package dev.cheerfun.pixivic.mapper;

import dev.cheerfun.pixivic.entity.IllustsImageUrls;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IllustsImageUrlsMapper {

    void insertIllustsImageUrls(IllustsImageUrls illustsImageUrls);

    void insertIllustsImageUrlsWithoutId(IllustsImageUrls illustsImageUrls);
}
