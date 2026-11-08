package com.equipo17.GUCEact1_t4.controller;

import com.equipo17.GUCEact1_t4.dto.MateriaDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class RestPostController {

    // Endpoint POST para probar en Postman/Bruno
    @PostMapping("/nueva-materia")
    public MateriaDTO recibirPost(@RequestBody MateriaDTO nuevaMateria) {
        // Aquí simulamos que se guarda y se regresa la misma info confirmada
        nuevaMateria.setId(99L); 
        return nuevaMateria;
    }
}