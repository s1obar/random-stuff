package com.example.creational.builder.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class House {
    //required params
    private final int walls;
    private final int doors;
    private final int windows;

    //optional params
    private final String color;
    private final boolean isSmart;
    private final boolean hasPool;

    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.doors = houseBuilder.doors;
        this.windows = houseBuilder.windows;
        this.color = houseBuilder.color;
        this.isSmart = houseBuilder.isSmart;
        this.hasPool = houseBuilder.hasPool;
    }

    public static class HouseBuilder{
        private final int walls;
        private final int doors;
        private final int windows;
        private String color;
        private boolean isSmart;
        private boolean hasPool;

        public HouseBuilder(int walls, int doors, int windows){
            this.walls = walls;
            this.doors = doors;
            this.windows = windows;
        }

        public HouseBuilder setIsHouseSmart(boolean isHouseSmart){
            this.isSmart = isHouseSmart;
            return this;
        }

        public HouseBuilder setHasHousePool(boolean hasHousePool){
            this.hasPool = hasHousePool;
            return this;
        }

        public HouseBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public House build(){
        return new House(this);
        }

    }
}
