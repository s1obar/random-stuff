package com.example.creational.prototype.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Woman extends Person{
    public int memory;

    public Woman (Woman target){
        super(target);
        if(target != null){
            this.memory = target.memory;
        }
    }

    @Override
    public Person clone() {
        return new Woman(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Woman) || !super.equals(object2)) return false;

        return ((Woman) object2).memory == memory;
    }
}
