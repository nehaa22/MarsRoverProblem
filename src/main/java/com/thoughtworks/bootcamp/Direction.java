package com.thoughtworks.bootcamp;

public enum Direction {

    N{
        public Direction left(){ return W;}
        public Direction right(){ return E;}
        public Coordinate move(){ return new Coordinate(0,1); }
    },
    W{
        public Direction left(){ return S;}
        public Direction right(){ return N;}
        public Coordinate move(){ return new Coordinate(-1,0); }


    },
    E{
        public Direction left(){ return N;}
        public Direction right(){ return S;}
        public Coordinate move(){ return new Coordinate(1,0); }

        },
    S{
        public Direction left(){ return E;}
        public Direction right(){ return W;}
        public Coordinate move(){ return new Coordinate(0,-1); }

    };

    public abstract Direction left();
    public abstract  Direction right();
    public abstract Coordinate move();

}










