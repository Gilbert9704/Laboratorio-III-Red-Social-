/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionImagenes;

import DAO.ArchivoInf;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class GESTION {
    
    FileInputStream Entrada;
    File Archivo;
    public ArrayList<File>direcionDefotos = new ArrayList<>(); 
    ArchivoInf fotos = new ArchivoInf();
    
    public GESTION() {
    }
    
    public GESTION(ArrayList<File> f){
        direcionDefotos = f;
    }
    
    public byte[] AbrirAImagen(File Archivo){
      byte[] bytesImg=new byte[1024*100];
      try{
          Entrada=new FileInputStream( Archivo);
          Entrada.read(bytesImg);
      }catch(Exception e){}
    return bytesImg;
    }
    
    public String GuardarAImagen(File Archivo, byte[] bytesImg  ){ 
        String Respuesta=null;
        direcionDefotos.add(Archivo);
        Respuesta="la imagen se Guardo";
        fotos.almacenarImagenes(direcionDefotos);
        return Respuesta;
    }
    
}
   

    
            
      
            
        
        
       
        
    
    
  
  
    
    
    
    

