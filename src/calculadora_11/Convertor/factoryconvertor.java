/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_11.Convertor;
import calculadora_11.CalculadoraFactory;
import calculadora_11.Aritmetica.aritmetica;
/**
 *
 * @author LN710Q
 */
public class factoryconvertor implements CalculadoraFactory{
    @Override
    public convertor getconvertor() {
        return new binario();
    }

    @Override
    public aritmetica getaritmetica(int type) {
        return null;
    }
}
    