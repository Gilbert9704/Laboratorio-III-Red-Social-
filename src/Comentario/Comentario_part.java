/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comentario;
import java.util.*;
import java.io.*;

/**
 *
 * @author Usuario
 */
public class Comentario_part {

    /**
     */
    public Comentario_part(){}
    
    public void comentarios() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        File file = new File("comentarios.txt"); 
        PrintStream g_comentario = new PrintStream(file); 
        Scanner l_comentario = new Scanner(file);
        
        Menu menu_1 = new Menu();
        menu_1.menu(g_comentario, l_comentario, file) ;
    
        l_comentario.close();
    
    }
    
}
