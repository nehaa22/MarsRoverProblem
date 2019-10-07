package com.thoughtworks.bootcamp;

public enum Direction {

    N{
        public Direction left(){ return W;}
        public Direction right(){ return E;}
    },
    W{
        public Direction left(){ return S;}
        public Direction right(){ return N;}

    },
    E{
        public Direction left(){ return N;}
        public Direction right(){ return S;}

    },
    S{
        public Direction left(){ return E;}
        public Direction right(){ return W;}


    };

    public abstract Direction left();
    public abstract  Direction right();


}











//    public Direction left() {
//        return S;
//    }
//
//    public  Direction right(){
//        return W;
//    }
