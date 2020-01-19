package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        hen2.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            return  Object hen = switch (country) {
                case Country.RUSSIA -> new RussianHen();
                case Country.BELARUS -> new BelarusianHen();
                case Country.UKRAINE -> new UkrainianHen();
                case Country.MOLDOVA -> new MoldovanHen();
                default -> new RussianHen();
            };

        }
    }


}
