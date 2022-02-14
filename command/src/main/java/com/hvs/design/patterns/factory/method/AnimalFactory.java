package com.hvs.design.patterns.factory.method;

import com.hvs.design.patterns.factory.method.model.IAnimal;

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
public abstract class AnimalFactory {


    public abstract IAnimal createAnimal(String name);




}
