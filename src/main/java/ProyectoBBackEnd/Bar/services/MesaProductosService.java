package ProyectoBBackEnd.Bar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;
import ProyectoBBackEnd.Bar.repositorys.MesaProductosRepository;

@Service
public class MesaProductosService {
    
    @Autowired
    private MesaProductosRepository mesaProductosRepo;


    public List<Mesa_Producto> getAllMesasAbiertas(){
        return mesaProductosRepo.findAll();
    }

    public void enviarProductoMesa(Mesa_Producto m1){
        mesaProductosRepo.save(m1);
    }




}
