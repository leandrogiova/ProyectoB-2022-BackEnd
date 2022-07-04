

package ProyectoBBackEnd.Bar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ProyectoBBackEnd.Bar.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

    

}

