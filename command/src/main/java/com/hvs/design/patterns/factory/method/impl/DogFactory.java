package com.hvs.design.patterns.factory.method.impl;

import com.hvs.design.patterns.factory.method.AnimalFactory;
import com.hvs.design.patterns.factory.method.model.IAnimal;
import com.hvs.design.patterns.factory.method.model.impl.Dog;

/**
 * ComputerFactory
 * <p>
 * ComputerFactory class.
 * <p>
 * <p>
 *
 * @author https://github.com/martinezhenry
 * @since 14/02/22
 */
public class DogFactory extends AnimalFactory {

    @Override
    public IAnimal createAnimal(String name) {
        return new Dog(name);
    }
}
