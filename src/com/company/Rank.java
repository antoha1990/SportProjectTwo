package com.company;

/**
 * Created by SmelayaPanda on 14.03.2016.
 */
public enum Rank {
        FIRST("Первый разряд"),
        KMC("Кандидат в мастера спорта"),
        MC("Мастер спорта"),
        MCMK("Мастер спорта международного класса");



        private String index;

        Rank(String index) {
                this.index=index;
        }

        public String getIndex() {
                return index;
        }

    }

