package com.example.creational.prototype.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Man extends Person{
    public int languages;

    public Man (Man target){
        super(target);
        if(target != null){
            this.languages = target.languages;
        }
    }

    @Override
    public Person clone() {
        return new Man(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Man) || !super.equals(object2)) return false;

        return ((Man) object2).languages == languages;
    }
}
