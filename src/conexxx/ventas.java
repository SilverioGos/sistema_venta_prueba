package conexxx;


public class ventas {
    int Idventas;
    int cod_clientes;
    int cod_emp;
    String NumeroVentas;
    String FechaVentas;
    double Monto;
    String Estado;
    
    public ventas(){
        
    }
    public ventas(int Idventas, int cod_clientes, int cod_emp, String NumeroVentas, String FechaVentas, double Monto, String Estado){
        this.Idventas = Idventas;
        this.cod_clientes = cod_clientes;
        this.cod_emp = cod_emp;
        this.NumeroVentas = NumeroVentas;
        this.FechaVentas = FechaVentas;
        this.Monto = Monto;
        this.Estado = Estado;
    }

    public int getIdventas() {
        return Idventas;
    }

    public void setIdventas(int Idventas) {
        this.Idventas = Idventas;
    }

    public int getCod_clientes() {
        return cod_clientes;
    }

    public void setCod_clientes(int cod_clientes) {
        this.cod_clientes = cod_clientes;
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNumeroVentas() {
        return NumeroVentas;
    }

    public void setNumeroVentas(String NumeroVentas) {
        this.NumeroVentas = NumeroVentas;
    }

    public String getFechaVentas() {
        return FechaVentas;
    }

    public void setFechaVentas(String FechaVentas) {
        this.FechaVentas = FechaVentas;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
