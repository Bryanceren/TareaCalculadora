/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import calculadora_11.Convertor.convertor;
import calculadora_11.CalculadoraFactory;
import calculadora_11.CalculadoraProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kriz
 */
public class VentanaConversion extends Ventana{
    public VentanaConversion(){
        button = new JButton("convertir");
        button.setBounds(new Rectangle(120, 25, widthB, heightB));
        
        int1 = new JTextField();
        int1.setBounds(new Rectangle(5, 25, widthB - 20, heightB));
        
        int2 = new JTextField();
        int2.setBounds(new Rectangle(5, 75, widthB - 20, heightB));

        label1 = new JLabel("Numero1");
        label1.setBounds(5, 0,widthB,heightB);
        
        label2 = new JLabel("Resultado");
        label2.setBounds(5, 50, widthB,heightB);
        
        add(button);
        add(int1);
        add(int2);
        add(label1);
        add(label2);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CalculadoraFactory factory;
                int a;
                String result;
                a = Integer.parseInt(int1.getText());
                              
                factory = CalculadoraProducer.getFactory(2);
                convertor binario = factory.getconvertor();
                result=binario.calcular(a);
                
                int2.setText(result);
            }

        });
    }
    
}
