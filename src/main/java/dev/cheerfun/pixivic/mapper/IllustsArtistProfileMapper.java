package dev.cheerfun.pixivic.mapper;

import dev.cheerfun.pixivic.entity.IllustsArtistProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IllustsArtistProfileMapper {
    void insertIllustsArtistProfile(IllustsArtistProfile illustsArtistProfile);

    void insertIllustsArtistProfileWithoutId(IllustsArtistProfile illustsArtistProfile);
}
