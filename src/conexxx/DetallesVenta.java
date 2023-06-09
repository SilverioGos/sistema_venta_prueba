package conexxx;


public class DetallesVenta {
    int id;
    int idVentas;
    int idLibros;
    int cantidad;
    double preVenta;
    
    public DetallesVenta(){       
    }
    
    public DetallesVenta(int id, int idVentas, int idLibros, int cantidad, double preVenta){
        this.id = id;
        this.idVentas = idVentas;
        this.idLibros = idLibros;
        this.cantidad = cantidad;
        this.preVenta = preVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(int idLibros) {
        this.idLibros = idLibros;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }
    
    
}
