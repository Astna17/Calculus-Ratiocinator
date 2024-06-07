package com.calculus.ratiocinator.Affirmation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public abstract class AffirmationComposee {
    protected Affirmation premiereValeur;
    protected Affirmation deuxiemeValeur;

    public boolean evaluer() {
        String premiere = String.valueOf(premiereValeur.evaluer());
        String deuxieme = String.valueOf(deuxiemeValeur.evaluer());
        if (premiere.equals("jenesaispas") || deuxieme.equals("jenesaispas")) {
            return "jenesaispas";
        }
        return (premiere.equals("vrai") && deuxieme.equals("vrai")) ? "vrai" : "faux";
    }
}
