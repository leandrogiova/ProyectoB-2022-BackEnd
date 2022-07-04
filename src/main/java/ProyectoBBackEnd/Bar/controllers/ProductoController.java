
package ProyectoBBackEnd.Bar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import ProyectoBBackEnd.Bar.models.Producto;
import ProyectoBBackEnd.Bar.services.ProductoService;

@CrossOrigin
@RestController
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;


    @GetMapping("/lista")
    public List<Producto> todosLosProductos(){
        return productoService.getAllProductos();
    }

    @PostMapping("/enviar")
    public void enviarProducto(@RequestBody Producto p1){
        productoService.enviarProducto(p1);
    }


}
