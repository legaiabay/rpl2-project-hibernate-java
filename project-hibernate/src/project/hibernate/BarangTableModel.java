package project.hibernate;

import project.hibernate.Barang;
import java.util.*;
import javax.swing.table.AbstractTableModel;

public class BarangTableModel extends AbstractTableModel{

    private List<Barang> barangs = new ArrayList<>();
    private final String HEADER[] = {"ID Barang", "Nama Barang", "Jenis Barang", "Stok Barang"};
    
    public BarangTableModel(List<Barang> barangs){
        this.barangs = barangs;
    }
    
    @Override
    public int getRowCount() {
        return barangs.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return HEADER[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang barang = barangs.get(rowIndex);
        
        switch(columnIndex){
            case 0 :
                return barang.getIdBarang();
            case 1 :
                return barang.getNamaBarang();
            case 2 :
                return barang.getHargaBarang();
            case 3 :
                return barang.getStokBarang();
            default :
                return null;
        }
    }
}
