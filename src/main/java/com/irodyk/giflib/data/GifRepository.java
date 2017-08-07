package com.irodyk.giflib.data;

import com.irodyk.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", LocalDate.of(2017, 8, 8), "Iurii", true),
        new Gif("ben-and-mike", LocalDate.of(2017, 8, 7), "Iurii", true),
        new Gif("book-dominos", LocalDate.of(2017, 8, 6), "Iurii", true),
        new Gif("compiler-bot", LocalDate.of(2017, 8, 5), "Iurii", true),
        new Gif("cowboy-coder", LocalDate.of(2017, 8, 4), "Iurii", true),
        new Gif("infinite-andrew", LocalDate.of(2017, 8, 3), "Iurii", true)
    );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }
}
