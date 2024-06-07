package com.calculus.ratiocinator.Affirmation;

import java.util.Map;

public class CaluclRatiocinateur {
    private static final Map<String, Boolean> veriteDeBase = Map.of(
            "Lou est beau", true,
            "Lou est pauvre", false,
            "Lou est généreux", null
    );
    public static Boolean obtenirValeurVerite(String affirmation) {
        return veriteDeBase.get(affirmation);
    }
}
