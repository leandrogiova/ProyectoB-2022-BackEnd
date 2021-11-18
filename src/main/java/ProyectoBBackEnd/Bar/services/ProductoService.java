package ProyectoBBackEnd.Bar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoBBackEnd.Bar.models.Producto;
import ProyectoBBackEnd.Bar.repositorys.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepo;


    public List<Producto> getAllProductos(){
        return productoRepo.findAll();
    }

    public void enviarProducto(Producto p1){
        productoRepo.save(p1);
    }


}
