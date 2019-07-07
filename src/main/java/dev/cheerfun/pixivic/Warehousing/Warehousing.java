package dev.cheerfun.pixivic.Warehousing;

import dev.cheerfun.pixivic.Service.IllustsArtistService;
import dev.cheerfun.pixivic.entity.IllustsArtist;
import dev.cheerfun.pixivic.entity.IllustsArtistProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;


@Component
public class Warehousing implements CommandLineRunner {

    @Autowired
    IllustsArtistService illustsArtistService;


    @Override
    public void run(String... strings) throws Exception {

        File file = new File("G:\\pixiv\\artist\\home\\artist\\");
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            IllustsArtist illustsArtist = new IllustsArtist();
            IllustsArtistProfile illustsArtistProfile = new IllustsArtistProfile();
            String json = readTXT(tempList[i]);
            if (json != null && !"".equals(json)) {
                illustsArtistService.resolveArtistJsonAndFill(json, illustsArtist, illustsArtistProfile);
                illustsArtistProfile.setArtistId(illustsArtist.getArtistId());
                try {
                    illustsArtistService.insertIllustsArtist(illustsArtist);
                    illustsArtistService.insertIllustsArtistProfileWithoutId(illustsArtistProfile);
                } catch (Exception e) {
                    System.out.println(i);
                    e.printStackTrace();
                }
            }
        }
    }

    public String readTXT(File file) {
        StringBuilder sb = new StringBuilder();
        if (file.isFile() && file.exists()) {
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                 BufferedReader br = new BufferedReader(isr);) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
