/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.awt.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Rodolfo
 */
public class jComboRender extends JLabel implements ListCellRenderer{
    
    public ImageIcon[] items;
    
    public jComboRender(ImageIcon[] items){
        setOpaque(true);
        this.items = items;
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isselected, boolean cellHasFocus){
        int selectedIndex = ((Integer)value).intValue();
        if(isselected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        ImageIcon icon = this.items[selectedIndex];
        setIcon(icon);
        File f = new File(items[selectedIndex].toString());
        setText(f.getName());
        return this;
    }
}
