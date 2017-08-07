package com.irodyk.giflib.data;

import com.irodyk.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", 1, LocalDate.of(2017, 8, 8), "Emma", false),
        new Gif("ben-and-mike", 2, LocalDate.of(2017, 7, 7), "Frank", true),
        new Gif("book-dominos", 3, LocalDate.of(2017, 6, 6), "Cris", false),
        new Gif("compiler-bot", 3, LocalDate.of(2017, 5, 5), "Elizabeth", true),
        new Gif("cowboy-coder", 1, LocalDate.of(2017, 4, 4), "Jack", false),
        new Gif("infinite-andrew", 2, LocalDate.of(2017, 3, 3), "Michael", true)
    );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }

        return gifs;
    }
}
