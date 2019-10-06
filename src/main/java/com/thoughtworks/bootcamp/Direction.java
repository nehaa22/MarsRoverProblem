package com.thoughtworks.bootcamp;

public enum Direction {

    W    {  public Direction turnLeft() { return S; }
            public Direction turnRight() { return N; }
        },
    E   {  public Direction turnLeft() { return N; }
           public Direction turnRight() { return S; }
    },
    N   {  public Direction turnLeft() { return W; }
           public Direction turnRight() { return E; }
    },

    S   {  public Direction turnLeft() { return E; }
           public Direction turnRight() { return W; }
    };

    public abstract  Direction turnLeft();
    public abstract  Direction turnRight();
}
