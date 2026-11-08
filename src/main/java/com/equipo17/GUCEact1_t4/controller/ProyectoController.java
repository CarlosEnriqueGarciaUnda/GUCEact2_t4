package com.equipo17.GUCEact1_t4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProyectoController {

    // Endpoint 1: Nombre/Iniciales del estudiante
    @GetMapping("/info")
    public String obtenerInfo() {
        return "Proyecto Actividad 1 - Carlos Enrique García Unda (GUCE) - Equipo 17";
    }

    // Endpoint 2: Lista simulada de materias
    @GetMapping("/materias")
    public List<String> obtenerMaterias() {
        return Arrays.asList(
            "Desarrollo Web Integral",
            "Sistemas Programables",
            "Bases de Datos Avanzadas",
            "Gestión de Proyectos de Software"
        );
    }
}