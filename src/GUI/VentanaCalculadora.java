/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kriz
 */
public class VentanaCalculadora extends Ventana{

    public VentanaCalculadora() {
        button = new JButton("aritmetica");
        button.setBounds(new Rectangle(70, 50, widthB, heightB));

        button1 = new JButton("conversion");
        button1.setBounds(new Rectangle(70, 100, widthB, heightB));
        
        add(button);
        add(button1);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame ventana = new JFrame("Ventana");
                ventana.setContentPane(new VentanaAritmetica());
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setResizable(false);
                ventana.pack();
                ventana.setVisible(true);
            }

        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame ventana = new JFrame("Ventana");
                ventana.setContentPane(new VentanaConversion());
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setResizable(false);
                ventana.pack();
                ventana.setVisible(true);
            }

        });
    }
    
    
}
