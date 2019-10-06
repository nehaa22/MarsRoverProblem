package com.thoughtworks.bootcamp;

public enum Direction {

    W    {  public Direction turnLeft() { return S; }},
    E   {  public Direction turnLeft() { return N; }},

    N{
        @Override
        public Direction turnLeft() { return W; }},
    S{
        @Override
        public Direction turnLeft() {
            return E;
        }



    };


    public abstract  Direction turnLeft();

}
