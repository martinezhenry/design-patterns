package com.hvs.design.patterns.factory.method.impl;

import com.hvs.design.patterns.factory.method.AnimalFactory;
import com.hvs.design.patterns.factory.method.model.IAnimal;
import com.hvs.design.patterns.factory.method.model.impl.Cat;

/**
 * CatFactory
 * <p>
 * CatFactory class.
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
public class CatFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal(String name) {
        return new Cat(name);
    }
}
