package dev.cheerfun.pixivic.mapper;

import dev.cheerfun.pixivic.entity.IllustsArtist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IllustsArtistMapper {

    void insertIllustsArtist(IllustsArtist illustsArtist);

    void insertIllustsArtistWithoutId(IllustsArtist illustsArtist);
}
