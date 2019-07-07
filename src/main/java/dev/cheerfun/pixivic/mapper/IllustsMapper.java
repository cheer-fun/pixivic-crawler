package dev.cheerfun.pixivic.mapper;

import dev.cheerfun.pixivic.entity.Illusts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IllustsMapper {

    Illusts getIllustsById(long id);

    void insertIllusts(Illusts illusts);

    void insertIllustsWithoutId(Illusts illusts);
}
