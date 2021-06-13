package com.company.M2ChallengeNamaPallavi.controller;


import com.company.M2ChallengeNamaPallavi.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {

    Random random = new Random();

    private static List<Definition> wordList = new ArrayList<>(Arrays.asList(
            new Definition(1, "A-game", "One’s highest level of performance"),
            new Definition(2, "UFO", " UnFinished Object: In knitting, sewing, quilting, etc.: an unfinished piece of work"),
            new Definition(3, "WFH", "An abbreviation for “working from home"),
            new Definition(4, "WIP", " Work in progres"),
            new Definition(5, "theonomous", "Ruled, governed by, or subject to the authority of God"),
            new Definition(6, "zoodle", "A spiralised strand of zucchini, sometimes used as a substitute for pasta"),
            new Definition(7, "truthiness", " A seemingly truthful quality not supported by facts or evidence"),
            new Definition(8, "thirstry", "Showing a strong desire for attention, approval, or publicity."),
            new Definition(9, "shero", " A female hero; a heroine."),
            new Definition(10, "next tomorrow", "The day after tomorrow")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public Definition getWord() {
        int randomId = random.nextInt(wordList.size());
        return wordList.get(randomId);

    }
}