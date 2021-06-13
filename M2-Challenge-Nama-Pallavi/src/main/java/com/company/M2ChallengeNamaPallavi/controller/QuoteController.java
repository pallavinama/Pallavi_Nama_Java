package com.company.M2ChallengeNamaPallavi.controller;


import com.company.M2ChallengeNamaPallavi.model.Definition;
import com.company.M2ChallengeNamaPallavi.model.Quote;
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
public class QuoteController {

    Random random = new Random();
    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(1,"Nelson Mandela","The greatest glory in living lies not in never falling, but in rising every time we fall"),
            new Quote(2,"Walt Disney"," The way to get started is to quit talking and begin doing"),
            new Quote(3,"John Lennon","Life is what happens when you're busy making other plans"),
            new Quote(4,"Oprah Winfrey"," If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough"),
            new Quote(5,"Franklin D. Roosevelt","When you reach the end of your rope, tie a knot in it and hang on"),
            new Quote(6,"Helen Keller","The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart"),
            new Quote(7,"Aristotle"," It is during our darkest moments that we must focus to see the light"),
            new Quote(8,"Anne Frank","Whoever is happy will make others happy too."),
            new Quote(9,"Benjamin Franklin","Tell me and I forget. Teach me and I remember. Involve me and I learn."),
            new Quote(10,"Maya Angelou","You will face many defeats in life, but never let yourself be defeated.")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)


    public Quote getQuote() {
        int randomId = random.nextInt(quoteList.size());
        return quoteList.get(randomId);

    }



}
