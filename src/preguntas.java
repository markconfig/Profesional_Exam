/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class preguntas {
    String[] preguntas = {
        "1.- ¿Qué es Java?",
        "2.- ¿Qué es una variable en Java?",
        "3.- Doublé es un tipo de dato:",
        "4.-  Int es un tipo de dato:",
        "5.-  Esta clase son diálogos que nos facilitan la forma de mostrar mensajes, introducir datos, confirmar datos etc.",
        "6.- Son plantillas para la creación de objetos en lo que se conoce como POO.",
        "7.- Este componente se utiliza para desplegar textos o mensajes estáticos.",
        "8.- Son objetos contenedores la finalidad de estos objetos es la agrupación de otros objetos.",
        "9.- Es la información que el programador manipula en la construcción de una solución o en el desarrollo de un algoritmo.",
        "10.- Su función es inicializar el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos."
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
