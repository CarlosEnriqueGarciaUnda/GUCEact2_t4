package com.equipo17.GUCEact1_t4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EstadoController {

    // Endpoint 3: Objeto JSON con estado del servidor
    @GetMapping("/status")
    public Map<String, Object> obtenerEstado() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("estado", "Servidor Activo");
        respuesta.put("puerto", 8081);
        respuesta.put("desarrollador", "Carlos Enrique García Unda");
        respuesta.put("timestamp", System.currentTimeMillis());
        return respuesta;
    }
}