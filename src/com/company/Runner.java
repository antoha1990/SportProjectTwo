package com.company;

/**
 * Created by SmelayaPanda on 14.03.2016.
 */
public class Runner extends Sportsmen {


    private int o2max;

    public Runner(String name, int weight, int heigth, int edge, int o2max) {
        super(name, weight, heigth, edge);
        this.o2max = o2max;
    }

  /*  public int getO2max (int o2max) {
        this.o2max=o2max;
        return o2max;
    }*/
    public void printo(){
        System.out.println(getName() + ": " +
                getWeight() + " кг, " +
                getHeigth() + " см, " +
                getEdge() + " лет(года), " +
                 "потребление кислорода "+o2max+ " мл/кг, " + '\n' +
                getRank().getIndex()+'\n');
    }



}
