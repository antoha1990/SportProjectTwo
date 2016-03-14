package com.company;

/**
 * Created by SmelayaPanda on 14.03.2016.
 */
abstract class Sportsmen implements ISportsmen {

    //свойства которые будут иметь все спортсмены
    private int weight;
    private int heigth;
    private int edge;
    private String name;


    public Sportsmen(String name, int weight, int heigth, int edge) {
        this.name = name;
        this.weight = weight;
        this.heigth = heigth;
        this.edge = edge;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getHeigth() {
        return heigth;

    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public int getEdge() {
        return edge;

    }

    public void setEdge(int edge) {
        this.edge = edge;
    }



    private Rank rank;

    public Sportsmen() {
    }

    public Sportsmen(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
