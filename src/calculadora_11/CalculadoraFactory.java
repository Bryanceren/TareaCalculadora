/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_11;

import calculadora_11.Aritmetica.aritmetica;
import calculadora_11.Convertor.convertor;

public interface CalculadoraFactory{
     aritmetica getaritmetica(int type);
     convertor getconvertor();
}
