package com.company;

/**
 * Created by SmelayaPanda on 14.03.2016.
 */
public class Jumper extends Sportsmen {

    private boolean sexuallity;

    public Jumper(String name, int weight, int heigth, int edge, boolean sexuallity) {
        super(name, weight, heigth, edge);
        this.sexuallity = sexuallity;
    }


    public void printo() {
        System.out.println(getName() + ": " +
                getWeight() + " кг, " +
                getHeigth() + " см, " +
                getEdge() + " лет(года), " + '\n'+
                getRank().getIndex());
    }

    public String sex;

    public void getSexuallity() {
        if (sexuallity == true) {
            sex = "Красава";
            System.out.print(sex + "\n");
        } else {
            sex = "Уродина";
        }
    }


    }


