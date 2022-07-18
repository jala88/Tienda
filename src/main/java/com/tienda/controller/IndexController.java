package com.tienda.controller;

import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora utilizamos MVC");
        var articulos=articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        
        
        return "index";
    }
    
    
}
/*

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        return "modificarCliente";

    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
         cliente = clienteService.getCliente(cliente);
         model.addAttribute("cliente", cliente);
         return "modificarCliente";
    }
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
         clienteService.delete(cliente);
                  return "redirect:/";
    
}
}
*/