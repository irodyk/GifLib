package com.irodyk.giflib.controller;

import com.irodyk.giflib.data.GifRepository;
import com.irodyk.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/")
    public String listGifts(ModelMap modelMap){

        List<Gif> allGifts = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifts);

        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){

        Gif gif = gifRepository.findByName(name);

        modelMap.put("gif", gif);

        return "gif-details";
    }

}
