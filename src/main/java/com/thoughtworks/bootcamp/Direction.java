package com.thoughtworks.bootcamp;

public enum Direction {

    W    {  public Direction turnLeft() { return S; }},

    N{
        @Override
        public Direction turnLeft() { return W; }},
    S{
        @Override
        public Direction turnLeft() {
            return null;
        }


    };



    public abstract  Direction turnLeft();

}
