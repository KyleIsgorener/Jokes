package com.example.Jokes.controller;

import com.example.Jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("quote", jokeService.getJoke());
        return "chucknorris";
    }
}
