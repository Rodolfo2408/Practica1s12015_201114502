/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Rodolfo
 */
public class JChomboBox extends JComboBox{
    
    public JChomboBox(int items){
        Dimension dim = new Dimension(206,26);
        this.setSize(dim);
        this.setPreferredSize(dim);
        this.setAlignmentY((float) 0.5);
        
        for(int i=0; i<items; i++){
            this.addItem(i);
        }
        this.setVisible(true);
    }
    
}
