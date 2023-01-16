package com.example.creational.prototype.runner;

import com.example.creational.prototype.model.Man;
import com.example.creational.prototype.model.Person;
import com.example.creational.prototype.model.Woman;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Builder
public class PrototypeDesignPatternRunner {
    public void runPrototypeDesignPattern(){
        List<Person> people = new ArrayList<>();
        List<Person> peopleCopies = new ArrayList<>();

        Woman woman = new Woman();
        woman.eyesColor = "brown";
        woman.hairColor = "black";
        woman.years = 45;
        woman.memory = 90;
        people.add(woman);

        Woman anotherWoman = (Woman) woman.clone();
        people.add(anotherWoman);

        Man man = new Man();
        man.eyesColor = "blue";
        man.hairColor = "gray";
        man.years = 50;
        man.languages = 3;
        people.add(man);

        cloneAndCompare(people, peopleCopies);
    }

    private static void cloneAndCompare(List<Person> people, List<Person> peopleCopies){
        for(Person person : people){
            peopleCopies.add(person.clone());
        }

        for(int i = 0; i < people.size(); i++){
            if(people.get(i) != (peopleCopies.get(i))){
                System.out.println(i + ": People are different objects (yay!)");
                if (people.get(i).equals(peopleCopies.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            }else {
                System.out.println(i + ": People objects are the same (booo!)");
            }
        }
    }
}
