package com.calculus.ratiocinator.Affirmation;

public class Mensonge implements Affirmation {
    private String affirmation;

    public Mensonge(String faux) {
    }

    public Boolean evaluer () {
        return affirmation.equals("Lou est pauvre");
    }
}
