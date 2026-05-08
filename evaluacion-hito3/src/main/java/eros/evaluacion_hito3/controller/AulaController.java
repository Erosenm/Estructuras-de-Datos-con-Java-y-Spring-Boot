package eros.evaluacion_hito3.controller;

import eros.evaluacion_hito3.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaService service;

    @GetMapping
    public int[][] mostrarAula() {
        return service.obtenerMapa();
    }

    @GetMapping("/ocupar")
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberarAsiento(fila, columna);
    }

    @GetMapping("/ocupados")
    public int totalOcupados() {
        return service.contarOcupados();
    }
}