
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
public class respuestasA {
    String[] respuestas = {
        "Administración ",
        "Eficiencia ",
        "Función  informática ",
        "Eficacia ",
        "Tic’s ",
        "Liderazgo ",
        "Líder ",
        "Estilo Autocrático ",
        "Estilo Democrático ",
        "Estilo Paternalista "
    };
    
    String[] radioR = {
        "Administración ,Ventaja competitiva ,Eficacia ",
        "Función informática ,Ventaja competitiva ,Eficiencia ",
        "Función  informática ,Eficiencia ,Administrativa ",
        "Ventajas competitiva ,Administración ,Eficacia ",
        "Tic’s ,Tec.actuales ,Tec. Emergentes ",
        "Liderazgo ,Equipo de trabajo ,Líder ", 
        "Equipo de trabajo ,Líder ,Liderazgo ",
        "Estilo Autocrático ,Estilo Paternalista ,Estilo Democrático ",
        "Estilo Autocrático ,Estilo Democrático ,Estilo Paternalista ",
        "Estilo Paternalista ,Estilo Autocrático ,Estilo Democrático ",
    };
    
    public String getRespuestaA(int posicion){
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
    
    public String[] setRespuestasA(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
