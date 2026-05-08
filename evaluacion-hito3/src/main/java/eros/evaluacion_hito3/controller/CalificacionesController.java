package eros.evaluacion_hito3.controller;

import eros.evaluacion_hito3.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    @Autowired
    private CalificacionesService service;

    @GetMapping("/agregar")
    public String agregar(@RequestParam double valor) {
        return service.agregarNota(valor);
    }

    @GetMapping
    public double[] listar() {
        return service.obtenerTodas();
    }

    @GetMapping("/promedio")
    public double promedio() {
        return service.calcularPromedio();
    }

    @GetMapping("/max")
    public double maximo() {
        return service.obtenerMax();
    }

    @GetMapping("/min")
    public double minimo() {
        return service.obtenerMin();
    }
}