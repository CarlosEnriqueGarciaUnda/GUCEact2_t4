package com.equipo17.GUCEact1_t4.controller;

import com.equipo17.GUCEact1_t4.dto.MateriaDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/vistas")
public class MvcController {

    // Leer valor desde application.properties
    @Value("${proyecto.autor}")
    private String autorProyecto;

    private List<MateriaDTO> listaMaterias = new ArrayList<>(List.of(
            new MateriaDTO(1L, "Desarrollo Web", "Programación"),
            new MateriaDTO(2L, "Bases de Datos", "Sistemas")
    ));

    // a) Vista con th:each y uso de @Value
    @GetMapping("/lista")
    public String mostrarLista(Model model) {
        model.addAttribute("materias", listaMaterias);
        model.addAttribute("autor", autorProyecto);
        return "lista"; // Busca lista.html en templates
    }

    // b) Vista con formulario y @ModelAttribute
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("materia", new MateriaDTO());
        return "formulario"; // Busca formulario.html
    }

    @PostMapping("/guardar")
    public String guardarMateria(@ModelAttribute MateriaDTO materia) {
        materia.setId((long) (listaMaterias.size() + 1));
        listaMaterias.add(materia);
        return "redirect:/vistas/lista";
    }

    // c) Uso de @RequestParam (Filtro)
    @GetMapping("/buscar")
    public String buscarPorCategoria(@RequestParam(name = "cat", required = false, defaultValue = "Todas") String cat, Model model) {
        model.addAttribute("categoriaBuscada", cat);
        return "lista"; // Reutilizamos la vista para el ejemplo
    }

    // d) Uso de @PathVariable (Detalle)
    @GetMapping("/detalle/{id}")
    public String verDetalle(@PathVariable("id") Long id, Model model) {
        MateriaDTO encontrada = listaMaterias.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst().orElse(new MateriaDTO(0L, "No encontrada", "-"));
        model.addAttribute("materia", encontrada);
        return "detalle"; // Busca detalle.html
    }
}