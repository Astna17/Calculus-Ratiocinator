package com.calculus.ratiocinator.Affirmation;

public class ConjonctionEt extends AffirmationComposee{
    public ConjonctionEt(Affirmation premiereValeur, Affirmation deuxiemeValeur) {
        super(premiereValeur, deuxiemeValeur);
    }

    public Object evaluerEntreDeuxAffirmation(){
     Boolean premiere = premiereValeur.evaluer();
     Boolean deuxieme = deuxiemeValeur.evaluer();
        if ( premiereValeur== null || deuxiemeValeur == null) {
            return null;
        }
        return premiere && deuxieme;
    }
}
