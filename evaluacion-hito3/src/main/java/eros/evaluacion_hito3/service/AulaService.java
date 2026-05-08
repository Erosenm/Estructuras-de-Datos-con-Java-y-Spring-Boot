package eros.evaluacion_hito3.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {
    // aqui la matriz de 5x5 del aula
    private int[][] asientos = new int[5][5];

    public int[][] obtenerMapa() {
        return asientos;
    }

    public String ocuparAsiento(int fila, int columna) {
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            asientos[fila][columna] = 1; // aqui importante 1 = ocupado
            return "Asiento [" + fila + "][" + columna + "] ocupado con éxito.";
        }
        return "Error: Coordenadas fuera de rango (0-4).";
    }

    public String liberarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            asientos[fila][columna] = 0; // 0 = libre
            return "Asiento [" + fila + "][" + columna + "] liberado.";
        }
        return "Error: Coordenadas fuera de rango.";
    }

    public int contarOcupados() {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientos[i][j] == 1) contador++;
            }
        }
        return contador;
    }
}