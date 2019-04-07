  
import java.util.StringTokenizer;

public class respuestasCalculo {

    String[] respuestas = {
        "Volumen",//   1
        "Área",//       2
        "33/16",//  3
        "Longitud",// 4
        "Método tabular",//5
        "Factor",//6
        "17/6 Unidades Cuadradas",//7
        "125/6",//8
        "7.633",//9
        "2π"//10
    };

    String[] radioR = {
        
        "Longitud,Área,Volumen", //1
        "Área,Diámetro,Longitud", //2
        "33/16,37/10,23/66",      //3
        "Metro,Longitud,Volumen",  //4
        "Método tabular,Integración,Derivada", //5
        "Factor,Método,Producto", //6
        "17/6 Unidades Cuadradas,19/6 Unidades Cuadradas,59/9 Unidades Cuadradas", //7
        "7/6,19/6,125/6", //8
        "19/6,7.633,8.0", //9
        "2π,6π,19π",}; //10

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);

        String[] a = new String[3];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken(); //obtenido el token
            i++;
        }

        return a;
    }

    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

}
