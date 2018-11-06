/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author stefan
 */
public class WetterTabelRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        Wetterstation t = (Wetterstation) value;
        JLabel label = new JLabel();
        if(value == null) return label;
        label.setOpaque(true);
        
        switch(column)
        {
            case 0: label.setText(t.getLocation()); break;
            case 1: label.setText(t.getSea()+""); break;
            case 2: label.setText(t.getTemp()+""); break;
            case 3: label.setText(t.getHum()+""); break; 
        }
        
          label.setFont(new Font("Arial", Font.ITALIC, 14));
        if(isSelected){
            label.setForeground(Color.WHITE);
            label.setBackground(Color.LIGHT_GRAY);
        }
       if(t.getTemp() > 25 && t.getHum() > 20)
       {
       label.setBackground(Color.YELLOW);
       }
            else label.setBackground(Color.white);
         
        
        
        return label;
    }
    
}
