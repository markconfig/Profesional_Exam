    

public class preguntasCalculo {

    String[] preguntas = {
        "1.- Es el Espacio que ocupa un cuerpo.",
        "2.- Superficie acotada que se distingue de lo que la rodea.",
        "3.- Calcular la longitud de arco de la curva y=(x^4/8)+1/(4x^2 )   En x=1 y x=2",
        "4.- Dimensión de una línea o de un cuerpo considerado su extensión en línea recta.",
        "5.- Se utiliza cuando se tiene el producto de una función polinómica y una trascendente.",
        "6.- Es cada una de las expresiones que pueden multiplicarse para formar un producto.",
        "7.- Calcular el área de la región acordada por las gráficas f(x)=x^2+2  g(x)=-x   x=0 y x=1",
        "8.- Calcular el área de la región comprendida de las gráficas f(x)=4-x^2 g(x)=x-2     x=-3  y  x=2",
        "9.- Calcular la longitud del arco de la curva y=x^(2/3) desde el punto (1,1) hasta el punto (8,4)",
        "10.- Calcular el volumen del solido de revolución formado al hacer girar la región acotada por la gráfica de F(x)=√sen x y el eje x=(0≤x≤π) entorno al eje x."
    };

    public String getPregunta(int posicion) {
        return preguntas[posicion];
    }

}
