package eros.evaluacion_hito3.estructuras;

import eros.evaluacion_hito3.model.Estudiante;
import eros.evaluacion_hito3.model.Nodo;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {
    private Nodo inicio;

    public ListaEstudiantes() {
        this.inicio = null;
    }

    // registrar estudiantes
    public void insertar(Estudiante est) {
        Nodo nuevoNodo = new Nodo(est);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
    }

    // convertir a lista para el controlador
    public List<Estudiante> obtenerTodos() {
        List<Estudiante> listaNormal = new ArrayList<>();
        Nodo aux = inicio;
        while (aux != null) {
            listaNormal.add(aux.estudiante);
            aux = aux.siguiente;
        }
        return listaNormal;
    }

    // para ordenar aqui
    public void ordenarPorPuntaje() {
        if (inicio == null || inicio.siguiente == null) {
            return;
        }

        boolean cambio;
        do {
            cambio = false;
            Nodo actual = inicio;

            while (actual != null && actual.siguiente != null) {
                // Comparación de mayor a menor [cite: 67]
                if (actual.estudiante.puntaje < actual.siguiente.estudiante.puntaje) {
                    // Swap de la data
                    Estudiante temporal = actual.estudiante;
                    actual.estudiante = actual.siguiente.estudiante;
                    actual.siguiente.estudiante = temporal;
                    cambio = true;
                }
                actual = actual.siguiente;
            }
        } while (cambio);
    }

    // Busqueda por nombre
    public Estudiante buscar(String nom) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.estudiante.nombre.equalsIgnoreCase(nom)) {
                return aux.estudiante;
            }
            aux = aux.siguiente;
        }
        return null;
    }
}