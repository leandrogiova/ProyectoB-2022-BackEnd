package ProyectoBBackEnd.Bar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_producto", unique=true)
    private int numeroProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private int precio;


    @Column(name = "enStock")
    private boolean enStock;

//    @Column(name = "cobrado")
//    private boolean cobrado;

    public Producto(){        
    }
    public Producto(Long id, String nombre, int precio, int numeroProducto, boolean enStock) {
        this.id = id;
        this.numeroProducto = numeroProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.enStock = enStock;
//        this.cobrado = cobrado;

    }


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }


    public int getNumeroProducto() {
        return numeroProducto;
    }
    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public boolean getEnStock(){
        return enStock;
    }
    public void setEntock(boolean enStock){
        this.enStock = enStock;
    }

//    public boolean getCobrado(){
//        return cobrado;
//    }
//    public void setCobrado(boolean cobrado){
//        this.cobrado = cobrado;
//    }

}

