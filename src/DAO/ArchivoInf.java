/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Usuario;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ArchivoInf {
    
    Usuario objUsuario;
    Usuario objAux;
    Usuario objUsuario2;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    File usuarios = new File("usuarios");
    File fotografias = new File("fotosUsuario.txt");
    
    public void almacenarDatosUsr(HashMap usuariosReg) throws FileNotFoundException{
        try {
            oos = new ObjectOutputStream(new FileOutputStream(usuarios));
            oos.writeObject(usuariosReg);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }  
        JOptionPane.showMessageDialog(null, "Se han guardado los datos");
    }
    
    public HashMap<String, Usuario> leerDatosUsr() throws ClassNotFoundException{
        HashMap<String, Usuario> usuariosReg = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(usuarios));
            usuariosReg = (HashMap<String, Usuario>) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Se han cargado los datos");
        return usuariosReg;
    }
    
    public void almacenarImagenes(ArrayList fotos){
        try{
            oos = new ObjectOutputStream(new FileOutputStream(fotografias));
            oos.writeObject(fotos);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Se han guardado las imagenes");
    }
    
    public ArrayList<File> cargarImagenes() throws ClassNotFoundException{
        ArrayList<File> fotos = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(fotografias));
            fotos = (ArrayList<File>) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Se han Cargado las imagenes");
        return fotos;
    }
}
