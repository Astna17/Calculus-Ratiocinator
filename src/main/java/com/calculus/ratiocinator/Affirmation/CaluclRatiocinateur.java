package com.calculus.ratiocinator.Affirmation;
public class CaluclRatiocinateur {
    public static String analyser(String affirmation) {
        if (affirmation.equals("Lou est beau")){
            return "Vrai";
        } else if (affirmation.equals("Lou est pauvre")) {
            return "Faux";
        } else if (affirmation.equals("Lou est généreux")) {
            return "jenesaispas";
        }
        else return "jenesaispas";
    }
}
