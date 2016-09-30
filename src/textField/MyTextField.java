/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textField;

import javax.swing.JTextField;

/**
 *
 * @author Nadja
 */
public class MyTextField extends JTextField{
    private int x;
    private int y;

    public MyTextField() {
        super();
    }

    public MyTextField(String text) {
        super(text);
    }

    public MyTextField(int columns) {
        super(columns);
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
