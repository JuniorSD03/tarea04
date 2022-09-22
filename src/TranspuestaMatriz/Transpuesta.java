package TranspuestaMatriz;

public class Transpuesta {
    //Declaración de variables
    public int matrizA[][];
    public int matrizT[][];
    public int fila;
    public int columna;
    int i, j;


    //Constructor
    public Transpuesta(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }


    //Getter y Setter
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }


    //Generar datos de la matriz a transponer
    public void generarMatriz(){

        //Generando datos para la matriz
        matrizA = new int[getFila()][getColumna()];
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                matrizA[i][j] = (int) (Math.random()*(10-1)+1);
            }
        }

        //Imprimiendo la matriz
        System.out.println("MATRIZ ORIGINAL");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + matrizA[i][j]);
            }
            System.out.println();
        }
    }

    //Transponer la matriz
    public void transponerMatriz(){
        matrizT = new int[getColumna()][getFila()];

        //Transpuesta
        for (int i=0; i < matrizA.length; i++) {
            for (int j=0; j < matrizA[i].length; j++) {
                matrizT[j][i] = matrizA[i][j];
            }
        }

        //Imprimiendo matriz transpuesta
        System.out.println("\nMATRIZ TRANSPUESTA");
        for(i=0;i<getColumna();i++){
            for(j=0;j<getFila();j++){
                System.out.print("\t" + matrizT[i][j]);
            }
            System.out.println();
        }
    }
}
