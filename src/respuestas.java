
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
public class respuestas {
    String[] respuestas = {
      "Es un lenguaje Ideal para aprender la información moderna",
        "Su valor puede cambiar durante la ejecución de un programa",
        "Primitivo de punto flotante por defecto",
        "Tipo de dato primitivo entero por defecto. ",
        "JOptionPane",
        "Clase",
        "Label",
        "JPanel",
        "Datos",
        "Constructor"
    };
    
    String[] radioR = {
        "Es un lenguaje Ideal para aprender la información moderna,Son identificadores predefinidos que tienen un significado para el cumplidor,Es un software que posee herramientas de desarrollo para la creación de programas",
        "Su valor puede cambiar durante la ejecución de un programa,Es un dato cuyo valor no puede cambiar durante la ejecución del programa,Comparación entre números reales y enteros no merecen mayor comentario",
        "Primitivo de punto flotante por defecto,Primitivo entero por defecto,Primitivo entero",
        "Tipo de dato primitivo de punto flotante por defecto,Tipo de dato primitivo boleano,Tipo de dato primitivo entero por defecto",
        "JOptionPane,JOptionPaneInputshowDialog,JOptionPaneMessageDialog",
        "Clase,Dato,Nota",
        "Label,Text field,Text area",
        "Label,JPanel,Text area",
        "Arreglo,Datos,Diseño",
        "Constructor,Método,Clase",
    };
    
    public String getRespuesta(int posicion){
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
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}