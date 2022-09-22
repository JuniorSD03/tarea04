package TranspuestaMatriz;

public class Main {
    public static void main(String[] args) {
        Transpuesta transpuesta = new Transpuesta(2,2);

        transpuesta.setColumna(5);
        transpuesta.setFila(3);

        transpuesta.generarMatriz();
        transpuesta.transponerMatriz();
    }
}
