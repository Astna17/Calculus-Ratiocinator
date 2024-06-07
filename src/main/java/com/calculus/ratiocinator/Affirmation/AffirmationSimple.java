package com.calculus.ratiocinator.Affirmation;

public class AffirmationSimple implements Affirmation {
    private String affirmation;
    private Boolean valeur;

    @Override
    public Boolean evaluer() {
        return valeur;
    }
    public String getAffirmation(){
        return CaluclRatiocinateur.analyser(affirmation);
    }
}
