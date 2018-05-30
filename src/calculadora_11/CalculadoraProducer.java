/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_11;

/**
 *
 * @author Kriz
 */
import calculadora_11.Aritmetica.factoryaritmetica;
import calculadora_11.Convertor.factoryconvertor;

public class CalculadoraProducer {
    public static CalculadoraFactory getFactory(int type){
        switch (type){
            case 1:
                return  new factoryaritmetica();
            case 2:
                return new factoryconvertor();
        }
        return null;
    }
}