/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_11.Convertor;

/**
 *
 * @author LN710Q
 */
public class binario implements convertor {

    @Override
    public String calcular(int a) {
            return Integer.toBinaryString(a);
        }

    }
