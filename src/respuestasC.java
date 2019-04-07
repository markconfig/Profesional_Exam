
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class respuestasC {
    String[] respuestas = {
        "Contabilidad ",
        "Costo ",
        "6 ",
        "Deuda ",
        "Producto ",
        "Balance General ",
        "Cuenta ",
        "95 ",
        "Libro Diario ",
        "Partida Doble ",
  
    };
    
    String[] radioR = {
        "Objetivos ,Contabilidad ,Diciplina ",
        "Precio ,Producto ,Costo ",
        "5 ,8 ,6 ",
        "Producto ,Precio ,Deuda ",
        "Precio ,Producto , Costo ",
        "Estado de resultados ,Balance General ,Sociedades ",
        "Intereses ,Dato ,Cuenta ",
        "55 ,80 ,95 ",
        "Libro Diario ,Libro de Datos , Libro de Perdidas ",
        "Libro Diario ,Cuenta ,Partida Doble ",
       
    };
    
    public String getRespuestaC(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[3];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); //obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestasC(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
