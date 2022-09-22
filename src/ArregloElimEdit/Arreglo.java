package ArregloElimEdit;

import java.util.Scanner;

public class Arreglo {
    //Escaner
    Scanner scanner = new Scanner(System.in);


    //Variables
    public int arreglo[];
    public int elemento;
    public int numElementos;


    //Constructor
    public Arreglo(int elemento, int numElementos) {
        this.elemento = elemento;
        this.numElementos = numElementos;
    }


    //Getter y Setter
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }


    //Ingreso de datos al arreglo
    public void agregarArreglo(){
        arreglo = new int[getNumElementos()];

        System.out.println("Ingrese los datos al arreglo de " + getNumElementos() + "elementos.");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("Elemento(" + i + "): ");
            arreglo[i] = scanner.nextInt();
        }
    }


    //Mostrando arreglo
    public void mostrarArreglo(){
        System.out.println("MOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
                System.out.print("\t" + arreglo[i]);
        }
    }


    //Buscando elemento
    public void buscarElemento(){
        System.out.println("\nBUSCANDO ELEMENTO");
        int band = 0;
        for(int i=0;i<getNumElementos();i++){
            if (getElemento()==arreglo[i]){
                System.out.println("Elemento " + elemento + " encontrado en la posición: " + i);
                band = 1;
                break;
            }
        }
        if (band != 1){
            System.out.println("Elemento no encontrado");
        }
    }


    //Editar elemento
    public void editarElemento(){
        System.out.println("\nEDITAR ELEMENTO");

        System.out.println("Digite la posición del elemento que busca editar: ");
        elemento = scanner.nextInt();

        //Mientras que la posición del elemento ingresado exceda se vuelverá a preguntar
        while (elemento>=getNumElementos()){
            System.out.println("El número " + elemento + " excede el rango del arreglo[" + getNumElementos() + "]");
            System.out.print("Digite nuevamente: ");
            elemento = scanner.nextInt();
        }

        //Se solicita el número que remplazará al elemento
        System.out.print("Elemento(" + elemento + ") = " + arreglo[elemento]);
        System.out.print("\nEditar con: ");
        arreglo[elemento] = scanner.nextInt();

        //Muestra el nuevo arreglo
        System.out.println("\nMOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("\t" + arreglo[i]);
        }
    }


    //Eliminar elemento
    public void eleminarElemento(){
        System.out.println("\nELIMINAR ELEMENTO");

        //Se solicita el número que se desea eliminar
        System.out.println("Digite el elemento que desea elminar: ");
        elemento = scanner.nextInt();

        //Se busca el número ingresado, si no se encuentra se finaliza la ejecucción
        for(int i = 0; i < getNumElementos(); i++){
            if (arreglo[i]==elemento){
                System.out.println("Eliminando el elemento " + elemento);

                //Se mueven las posiciones de los elementos que siguen al elemento eleminiado
                for (i=i;i<getNumElementos()-1;i++){
                    arreglo[i]=arreglo[i+1];
                }
                //Disminuye la cantidad de elementos del arreglo
                numElementos--;
            }
        }

        //Se imprime el nuevo arreglo
        System.out.println("MOSTRANDO ARREGLO");
        for(int i=0;i<getNumElementos();i++){
            System.out.print("\t" + arreglo[i]);
        }
    }

}
