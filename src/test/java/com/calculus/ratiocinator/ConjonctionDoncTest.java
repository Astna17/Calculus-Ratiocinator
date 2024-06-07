package com.calculus.ratiocinator;


import com.calculus.ratiocinator.Affirmation.Affirmation;
import com.calculus.ratiocinator.Affirmation.ConjonctionDonc;
import com.calculus.ratiocinator.Affirmation.Mensonge;
import com.calculus.ratiocinator.Affirmation.Verite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConjonctionDoncTest {

    @Test
    public void testEvaluerVraiEtFaux() {

        Affirmation premiere = new Verite("vrai");
        Affirmation deuxieme = new Mensonge("faux");


        ConjonctionDonc conjonction = new ConjonctionDonc(premiere, deuxieme);

        assertFalse(conjonction.evaluer());
    }

    @Test
    public void testEvaluerFauxEtVrai() {
        Affirmation premiere = new Mensonge("faux");
        Affirmation deuxieme = new Verite("vrai");

        ConjonctionDonc conjonction = new ConjonctionDonc(premiere, deuxieme);

        assertTrue(conjonction.evaluer());
    }


}

