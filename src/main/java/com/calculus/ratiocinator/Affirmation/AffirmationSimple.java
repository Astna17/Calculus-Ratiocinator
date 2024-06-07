package com.calculus.ratiocinator.Affirmation;

public class AffirmationSimple implements Affirmation {
    private String text;

    @Override
    public String evaluer() {
        return CaluclRatiocinateur.analyser(text);
    }
}
