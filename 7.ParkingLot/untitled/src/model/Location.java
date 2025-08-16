package model;

import com.sun.istack.internal.NotNull;

import static java.lang.Math.abs;

public class Location {
    int x;
    int y;

    public Location(int x ,int y){
        this.x = x;
        this.y = y;
    }
    public int manhattanDistance(@NotNull Location a, @NotNull Location b){
        return  abs(a.x - b.x) + abs(a.y - b.y);
    }
}
