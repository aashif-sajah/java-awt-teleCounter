package com.aashif.app;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAction implements MouseListener{
    Frame frame;
    Label name;

    MouseAction(){
        frame = new Frame("Mouse Check");
        name = new Label("The Mouse");

        frame.addMouseListener(this);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.add(name);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        name.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        name.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        name.setText("Mouse Relesed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        name.setText("Mouse Enterd");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        name.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseAction();
    }

}
