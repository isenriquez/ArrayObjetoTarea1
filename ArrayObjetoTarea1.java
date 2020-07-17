/*
Implementar un algoritmo que nos permita crear una matriz de objetos, como matriz
de elementos primitivos a partir de objetos del paper en estudio.
 */
package arrayobjetotarea1;

/**
 *
 * @author Enríquez Israel
 */
class Gasolina{
	public float volumen;
	public String tipo,calidad;

	Gasolina(float volumen,String tipo,String calidad )
	{
		this.volumen=volumen;
		this.tipo=tipo;
                this.calidad=calidad;
	}
}
//los elementos del array son objetos de la clase Gasolina
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-LATACUNGA");
        System.out.println("Nombre: Enríquez Israel");
        System.out.println("Curso: Programación ¨B¨");
        System.out.println("NRC: 7450");
        System.out.println("Tema: ARRAY DE OBJETOS");

        // Declaro un Array de enteros
        Gasolina[]arreglo;
        //asigno memoria para los 10 objetos del tipoGasolina
        arreglo=new Gasolina[10];

        //inicializamos los elementos del array
        arreglo[0]=new Gasolina((float) 1.15,"T1","Premium");
        arreglo[1]=new Gasolina((float) 2.83,"T2","Convencional");
        arreglo[2]=new Gasolina((float) 4.11,"T3","ECO");
        arreglo[3]=new Gasolina((float) 1.54,"T4","Premium");
        arreglo[4]=new Gasolina((float) 3.01,"T5","ECO");
        arreglo[5]=new Gasolina((float) 1.82,"T6","Premium");
        arreglo[6]=new Gasolina((float) 3.21,"T7","Convencional");
        arreglo[7]=new Gasolina((float) 4.55,"T8","Premium");
        arreglo[8]=new Gasolina((float) 5.87,"T9","Premium");
        arreglo[9]=new Gasolina((float) 4.10,"T10","Convencional");

       //Accedemos a los elementos del Array
        for(int i=0;i<arreglo.length;i++)
	System.out.println("Muestra número "+(i+1)+""+arreglo[i].volumen+" litros,"
                +arreglo[i].tipo+" es "+arreglo[i].calidad);
    }

}
