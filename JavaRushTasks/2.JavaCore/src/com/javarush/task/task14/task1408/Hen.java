package com.javarush.task.task14.task1408;

public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я - курица.";
    }
}

class RussianHen extends Hen {
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - %s. Я несу %n яиц в месяц." + Country.RUSSIA + getCountOfEggsPerMonth();
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 23;

    }
}

class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - %s. Я несу %n яиц в месяц." + Country.UKRAINE + getCountOfEggsPerMonth();
    }
}

class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - %s. Я несу %n яиц в месяц." + Country.BELARUS + getCountOfEggsPerMonth();
    }
}

class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - %s. Я несу %n яиц в месяц." + Country.MOLDOVA + getCountOfEggsPerMonth();
    }
}


