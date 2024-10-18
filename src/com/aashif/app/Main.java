package com.aashif.app;
import java.awt.*;


public class Main{

    Main(){
        Frame frame = new Frame();
        Button btn1 = new Button("Button 1");
        btn1.setBounds(25, 25, 50, 25);
        Button btn2 = new Button("Button 2");
        btn2.setBounds(25, 55, 50, 25);
        Label name = new Label("Aashif");
        name.setBounds(80,25,50,25);


        frame.add(btn1);
        frame.add(btn2);
        frame.add(name);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(200,200);
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
