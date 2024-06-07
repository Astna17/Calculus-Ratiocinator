package com.calculus.ratiocinator.Affirmation;

public class Mensonge implements Affirmation {
    private String affirmation;
    public Boolean evaluer () {
        return affirmation.equals("Lou est pauvre");
    }
}
