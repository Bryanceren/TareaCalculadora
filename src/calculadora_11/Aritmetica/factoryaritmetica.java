/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_11.Aritmetica;
import calculadora_11.CalculadoraFactory;
import calculadora_11.Convertor.convertor;
/**
 *
 * @author LN710Q
 */
public class factoryaritmetica implements CalculadoraFactory{
    
    @Override
    public convertor getconvertor() {
        return null;
    }

    @Override
    public aritmetica getaritmetica(int type) {
        switch (type) {
            case 1:
                return new suma();
            case 2:
                return new resta();
            case 3:
                return new multiplicacion();
            case 4:
                return new division();
        }
        return null;
}


    
}
