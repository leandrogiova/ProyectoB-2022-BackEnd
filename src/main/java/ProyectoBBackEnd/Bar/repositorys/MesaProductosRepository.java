
package ProyectoBBackEnd.Bar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;

@Repository
public interface MesaProductosRepository extends JpaRepository<Mesa_Producto, Long>{
}
