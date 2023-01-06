package com.example.creational.builder.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class House {
    //required params
    private int walls;
    private int doors;
    private String color;

    //optional params
    private boolean isSmart;
    private boolean hasPool;
    private String windows;

    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.doors = houseBuilder.doors;
        this.color = houseBuilder.color;
        this.isSmart = houseBuilder.isSmart;
        this.hasPool = houseBuilder.hasPool;
        this.windows = houseBuilder.windows;
    }

    public static class HouseBuilder{
        private int walls;
        private int doors;
        private String color;
        private boolean isSmart;
        private boolean hasPool;
        private String windows;

        public HouseBuilder(int walls, int doors, String color){
            this.walls = walls;
            this.doors = doors;
            this.color = color;
        }

        public HouseBuilder setIsHouseSmart(boolean isHouseSmart){
            this.isSmart = isHouseSmart;
            return this;
        }

        public HouseBuilder setHasHousePool(boolean hasHousePool){
            this.hasPool = hasHousePool;
            return this;
        }

        public HouseBuilder setWindows(String windows){
            this.windows = windows;
            return this;
        }

        public House build(){
        return new House(this);
        }

    }
}
