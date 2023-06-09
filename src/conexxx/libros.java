package conexxx;

import java.sql.Date;


public class libros {
    int cod_lib;
    int edicion;
    String fecha_lib;
    String editorial;
    String titulo;
    Double precio;
    int cod_au;
    
    public libros(){     
    }
    
    public libros(int cod_lib, int edicion, String fecha_lib, String editorial, String titulo, Double precio, int cod_au){
        this.cod_lib = cod_lib;
        this.edicion = edicion;
        this.fecha_lib = fecha_lib;
        this.editorial = editorial;
        this.titulo = titulo;
        this.precio = precio;
        this.cod_au = cod_au;
    }

    public int getCod_lib() {
        return cod_lib;
    }

    public void setCod_lib(int cod_lib) {
        this.cod_lib = cod_lib;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getFecha_lib() {
        return fecha_lib;
    }

    public void setFecha_lib(String fecha_lib) {
        this.fecha_lib = fecha_lib;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCod_au() {
        return cod_au;
    }

    public void setCod_au(int cod_au) {
        this.cod_au = cod_au;
    }

    
    
    
}
