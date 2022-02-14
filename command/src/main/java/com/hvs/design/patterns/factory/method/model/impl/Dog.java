package com.hvs.design.patterns.factory.method.model.impl;

import com.hvs.design.patterns.factory.method.model.IAnimal;

import java.util.ArrayList;
import java.util.List;

/**
 * DesktopComputer
 * <p>
 * DesktopComputer class.
 * <p>
 * <p>
 *
 * @author https://github.com/martinezhenry
 * @since 14/02/22
 */
public class Dog implements IAnimal {

    private String name;
    private String[] sounds;

    public Dog(String name) {
        this.name = name;
        sounds = new String[] {"bark", "howl", "growl", "bay"};

    }
    @Override
    public String[] makeSound() {
        return sounds;
    }

    @Override
    public String getName() {
        return name;
    }
}
