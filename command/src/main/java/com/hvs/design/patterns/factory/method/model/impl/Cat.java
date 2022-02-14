package com.hvs.design.patterns.factory.method.model.impl;

import com.hvs.design.patterns.factory.method.model.IAnimal;

/**
 * Cat
 * <p>
 * Cat class.
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
public class Cat implements IAnimal {

    private String name;
    private String[] sounds;

    public Cat(String name) {
        this.name = name;
        sounds = new String[] {"mew", "meow", "purr", "hiss", "trill", "caterwaul", "growl"};
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
