package com.thoughtworks.bootcamp;

public enum Direction {

    N,
    W,
    E,
    S;

    public Direction left() {
        return S;
    }

    public  Direction right(){
        return W;
    }

}
