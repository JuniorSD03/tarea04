package ArregloElimEdit;

public class Main {
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(5, 6);

        arreglo.setElemento(17);
        arreglo.setNumElementos(6);

        arreglo.agregarArreglo();
        arreglo.mostrarArreglo();
        arreglo.buscarElemento();
        arreglo.editarElemento();
        arreglo.eleminarElemento();
    }
}
