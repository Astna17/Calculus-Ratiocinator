package com.calculus.ratiocinator.Affirmation;

public class Verite implements Affirmation{
    private String affirmation;

    public Verite(String vrai) {
    }

    public Boolean evaluer() {
        return affirmation.equals("Lou est beau");
    }
}
