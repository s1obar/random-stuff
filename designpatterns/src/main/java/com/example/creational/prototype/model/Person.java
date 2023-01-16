package com.example.creational.prototype.model;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public abstract class Person {
    public String eyesColor;
    public String hairColor;
    public int years;

    public Person(Person targetPerson){
        this.eyesColor = targetPerson.eyesColor;
        this.hairColor = targetPerson.hairColor;
        this.years = targetPerson.years;
    }

    public abstract Person clone();

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Person person2)){
            return false;
        }

        return Objects.equals(person2.hairColor, hairColor)
                && Objects.equals(person2.eyesColor, eyesColor)
                && person2.years == years;
    }
}
