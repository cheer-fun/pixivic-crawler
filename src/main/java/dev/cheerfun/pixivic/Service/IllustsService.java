package dev.cheerfun.pixivic.Service;

import dev.cheerfun.pixivic.entity.Illusts;
import dev.cheerfun.pixivic.mapper.IllustsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IllustsService {
    @Autowired
    IllustsMapper illustsMapper;

    public Illusts getById(long id) {
        return illustsMapper.getIllustsById(1L);
    }

    public void insertIllusts(Illusts illusts) {
        illustsMapper.insertIllusts(illusts);
    }

    public void insertIllustsWithoutId(Illusts illusts) {
        illustsMapper.insertIllustsWithoutId(illusts);
    }

}
