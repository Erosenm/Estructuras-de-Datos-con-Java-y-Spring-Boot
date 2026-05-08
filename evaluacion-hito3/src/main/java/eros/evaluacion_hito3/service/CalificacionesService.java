package eros.evaluacion_hito3.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {
    // arreglo para los 10 estudiantes
    private double[] notas = new double[10];
    private int contador = 0;

    public String agregarNota(double valor) {
        if (contador < 10) {
            notas[contador] = valor;
            contador++;
            return "nota agregada en la posición " + (contador - 1);
        }
        return "Error el arreglo de 10 notas ya estaa lleno.";
    }

    public double[] obtenerTodas() {
        return notas;
    }

    public double calcularPromedio() {
        if (contador == 0) return 0;
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += notas[i];
        }
        return suma / contador;
    }

    public double obtenerMax() {
        double max = notas[0];
        for (int i = 1; i < contador; i++) {
            if (notas[i] > max) max = notas[i];
        }
        return max;
    }

    public double obtenerMin() {
        double min = notas[0];
        for (int i = 1; i < contador; i++) {
            if (notas[i] < min) min = notas[i];
        }
        return min;
    }
}