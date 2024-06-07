package com.calculus.ratiocinator.Affirmation;

public class Verite implements Affirmation{
    private String affirmation;
    public Boolean evaluer() {
        return affirmation.equals("Lou est beau");
    }
}
