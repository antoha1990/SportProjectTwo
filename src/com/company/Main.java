package com.company;

import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {




        Runner moFarach = new Runner("MoFarach", 58, 165, 32, 82);
               moFarach.setRank(Rank.MCMK);
               moFarach.printo();

        Jumper klichina = new Jumper("Klishina", 57, 185, 25, true);
        klichina.setRank(Rank.MC);
        klichina.printo();
        klichina.getSexuallity();


    }


}
