/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import calculadora_11.Aritmetica.aritmetica;
import calculadora_11.CalculadoraFactory;
import calculadora_11.CalculadoraProducer;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kriz
 */
public class VentanaAritmetica extends Ventana {

    public VentanaAritmetica() {

        button = new JButton("Sumar");
        button.setBounds(new Rectangle(120, 10, widthB, heightB));
        
        
        button1 = new JButton("Restar");
        button1.setBounds(new Rectangle(120, 50, widthB, heightB));

        button2 = new JButton("Multiplicar");
        button2.setBounds(new Rectangle(120, 90, widthB, heightB));

        button3 = new JButton("Dividir");
        button3.setBounds(new Rectangle(120, 130, widthB, heightB));
        
        int1 = new JTextField();
        int1.setBounds(new Rectangle(5, 25, widthB - 20, heightB));

        int2 = new JTextField();
        int2.setBounds(new Rectangle(5, 75, widthB - 20, heightB));

        int3 = new JTextField();
        int3.setBounds(new Rectangle(5, 125, widthB - 20, heightB));
        
        label1 = new JLabel("Numero1");
        label1.setBounds(5, 0,widthB,heightB);
        
        label2 = new JLabel("Numero2");
        label2.setBounds(5, 50, widthB,heightB);
        
        label3 = new JLabel("Resultado");
        label3.setBounds(5, 100, widthB,heightB);
        
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(label1);
        add(label2);
        add(label3);
        add(int1);
        add(int2);
        add(int3);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CalculadoraFactory factory;
                int a,b,result;
                a = Integer.parseInt(int1.getText());
                b = Integer.parseInt(int2.getText());
                
                factory = CalculadoraProducer.getFactory(1);
                aritmetica suma = factory.getaritmetica(1);
                result=suma.calcular(a,b);
                
                int3.setText(Integer.toString(result));
            }

        });
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CalculadoraFactory factory;
                int a,b,result;
                a = Integer.parseInt(int1.getText());
                b = Integer.parseInt(int2.getText());
                
                factory = CalculadoraProducer.getFactory(1);
                aritmetica resta = factory.getaritmetica(2);
                result=resta.calcular(a,b);
                
                int3.setText(Integer.toString(result));
            }

        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CalculadoraFactory factory;
                int a,b,result;
                a = Integer.parseInt(int1.getText());
                b = Integer.parseInt(int2.getText());
                
                factory = CalculadoraProducer.getFactory(1);
                aritmetica mult = factory.getaritmetica(3);
                result=mult.calcular(a,b);
                
                int3.setText(Integer.toString(result));
            }

        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CalculadoraFactory factory;
                int a,b,result;
                a = Integer.parseInt(int1.getText());
                b = Integer.parseInt(int2.getText());
                
                factory = CalculadoraProducer.getFactory(1);
                aritmetica div = factory.getaritmetica(4);
                result=div.calcular(a,b);
                
                int3.setText(Integer.toString(result));
            }

        });
    }

}
