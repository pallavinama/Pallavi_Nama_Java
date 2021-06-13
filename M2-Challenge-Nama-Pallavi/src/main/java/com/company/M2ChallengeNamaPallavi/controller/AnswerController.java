package com.company.M2ChallengeNamaPallavi.controller;

import com.company.M2ChallengeNamaPallavi.model.Answer;
import com.company.M2ChallengeNamaPallavi.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    private Random random = new Random();

    private static List<String> answerList = new ArrayList<>(Arrays.asList(
            "answer1",
            "answer2",
            "answer3",
            "answer4",
            "answer5",
            "answer6",
            "answer7",
            "answer8"));

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getAnswers(@RequestBody @Valid Answer answer) {
        int randomId = random.nextInt(answerList.size());
        answer.setId(randomId);
        answer.setAnswer(answerList.get(randomId));
        return answer;
    }
}
