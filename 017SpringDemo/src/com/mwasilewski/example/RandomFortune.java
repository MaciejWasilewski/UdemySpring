package com.mwasilewski.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService {
    private List<String> fortunes = new ArrayList<>();
    private Random random = new Random();

    public RandomFortune() {
        fortunes.add("A");
        fortunes.add("B");
        fortunes.add("C");
    }

    @Override
    public String getFortune() {

        return fortunes.get(random.nextInt(3));
    }
}
