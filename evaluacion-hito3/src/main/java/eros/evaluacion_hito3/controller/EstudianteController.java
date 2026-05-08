package eros.evaluacion_hito3.controller;

import eros.evaluacion_hito3.estructuras.ListaEstudiantes;
import eros.evaluacion_hito3.model.Estudiante;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private ListaEstudiantes lista = new ListaEstudiantes();

    @GetMapping("/agregar")
    public String agregar(@RequestParam String nombre, @RequestParam int puntaje) {
        lista.insertar(new Estudiante(nombre, puntaje));
        return "Estudiante " + nombre + " agregado.";
    }

    @GetMapping
    public List<Estudiante> listar() {
        return lista.obtenerTodos();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> listarOrdenados() {
        lista.ordenarPorPuntaje();
        return lista.obtenerTodos();
    }

    @GetMapping("/buscar/{nombre}")
    public Estudiante buscar(@PathVariable String nombre) {
        return lista.buscar(nombre);
    }
}