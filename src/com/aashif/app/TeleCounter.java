package com.aashif.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TeleCounter {

    TeleCounter(){

        Frame frame = new Frame("Tele Counter");

        Button submit = new Button("Count");
        submit.setBounds(35, 85, 50, 30);
        Button reset = new Button("Reset");
        reset.setBounds(95, 85, 50, 30);
        TextField displayCount = new TextField("0");
        displayCount.setBounds(35, 50, 50, 30);

        submit.setBackground(Color.GREEN); 
        submit.setForeground(Color.BLACK); 
        reset.setBackground(Color.RED);     
        reset.setForeground(Color.WHITE);   
        displayCount.setBackground(Color.LIGHT_GRAY); 
        displayCount.setForeground(Color.BLACK);  

        ButtonCountListner btnsListner = new ButtonCountListner(displayCount,reset,submit);
        
        submit.addActionListener(btnsListner);
        reset.addActionListener(btnsListner);

        frame.add(submit);
        frame.add(reset);
        frame.add(displayCount);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(200,200);

    }

}

class ButtonCountListner implements ActionListener{

    TextField displayCount;
    Button reset;
    Button submit;

    ButtonCountListner(TextField displayCount,  Button reset,Button submit ){
        this.displayCount = displayCount;
        this.reset = reset;
        this.submit = submit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            int currentVal = Integer.parseInt(displayCount.getText());
            displayCount.setText(String.valueOf(++currentVal));
        }

        if (e.getSource() == reset){
            displayCount.setText("0");
        }
        
    }

}
