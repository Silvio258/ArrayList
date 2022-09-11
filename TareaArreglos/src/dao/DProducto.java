/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author Usuario
 */
public class DProducto {
    
    private ArrayList<Producto> listProducto=new ArrayList<>();

    public DProducto() {
    }
    
    public DProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    public int agregarProducto(int id,
            String nom, double precio, double existencia){
        int a =0;
        Producto prod = new Producto(id, nom, precio, existencia);
        listProducto.add(prod);
        a = 1;
        return a;
    }
     public DefaultTableModel getListProd(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] ={"ID", "NOMBRES", "PRECIOS",
            "EXISTENCIA"};
       
        dtm.setColumnIdentifiers(titulo);
       
        for (Producto pro: listProducto){
            String reg[] = new String[4];
            reg[0] = ""+pro.getId();
            reg[1] = pro.getNombre();
            reg[2] = ""+pro.getPrecio();
            reg[3] = ""+pro.getExistencia();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
    }


