package com.hvs.design.patterns.factory.method;

import com.hvs.design.patterns.factory.method.impl.CatFactory;
import com.hvs.design.patterns.factory.method.impl.DogFactory;
import com.hvs.design.patterns.factory.method.model.IAnimal;

import java.util.Arrays;

/**
 * AminalSoundApp
 * <p>
 * AminalSoundApp class.
 * <p>
 * <p>
 * ESTE COMPONENTE FUE CONSTRUIDO SIGUIENDO LOS ESTANDARES DE DESARROLLO Y EL PROCEDIMIENTO
 * DE DESARROLLO DE APLICACIONES DE NOVOPAYMENT Y SE ENCUENTRA PROTEGIDO POR LAS LEYES DE
 * PROPIEDAD INTELECTUAL Y DERECHOS DE AUTOR.
 *
 * @author Novopayment Inc.
 * @author hmartinez@novopayment.com
 * @since 14/02/22
 */
public class AnimalSoundApp {

    private static AnimalFactory factory;

    public static void main(String[] args) {

        System.out.println("building a dog");
        factory = new DogFactory();
        IAnimal dog = factory.createAnimal("dog");

        System.out.printf("the %s make this sounds: %s%n", dog.getName(), Arrays.toString(dog.makeSound()));

        System.out.println("building a cat");

        factory = new CatFactory();
        IAnimal cat = factory.createAnimal("cat");

        System.out.printf("the %s make this sounds: %s", cat.getName(), Arrays.toString(cat.makeSound()));


    }




}
