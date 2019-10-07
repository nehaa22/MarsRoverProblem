package com.thoughtworks.bootcamp;

public enum Direction {

    N{
        public Direction left(){ return W;}
    },
    W{
        public Direction left(){ return S;}
    },
    E{
        public Direction left(){ return N;}
    },
    S{
        public Direction left(){ return E;}
    };

    public abstract Direction left();


}











//    public Direction left() {
//        return S;
//    }
//
//    public  Direction right(){
//        return W;
//    }
