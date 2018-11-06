/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stefan
 */
public class WetterTabelModel extends AbstractTableModel {

    private ArrayList <Wetterstation> station = new ArrayList();
    private static String[] colnames = {"Location", "Sea Level" ,"Temperatur", "Humidty"};
    
    @Override
    public int getRowCount() {
      return station.size();
    }

    @Override
    public int getColumnCount() {
       return colnames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Wetterstation t = (Wetterstation) station.get(rowIndex);
        return t;
    }

    @Override
    public String getColumnName(int column) {
        return colnames[column];
    }

    public void add(Wetterstation t)
    {
     station.add(t);
       this.fireTableRowsInserted(station.size()-1, station.size()-1);
    }       
    
    public void delete(int t)
    {
      station.remove(t);
     this.fireTableRowsDeleted(station.size(), station.size());
    }
    
    
}
