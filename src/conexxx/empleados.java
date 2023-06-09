package conexxx;


public class empleados {
    int cod_emp;
    String nom_emp;
    String ape_emp;
    String cargo;
    String email;
    String direccion;
    
    public empleados(){     
    }
    
    public empleados(int cod_emp, String nom_emp, String ape_emp, String cargo, String email, String direccion){
        this.cod_emp = cod_emp;
        this.nom_emp = nom_emp;
        this.ape_emp = ape_emp;
        this.cargo = cargo;
        this.email = email;
        this.direccion = direccion;
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getApe_emp() {
        return ape_emp;
    }

    public void setApe_emp(String ape_emp) {
        this.ape_emp = ape_emp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
