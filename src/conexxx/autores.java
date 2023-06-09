
package conexxx;

public class autores {
    int cod_au;
    String nom_autor;
    String ape_autor;
    String nacionalidad;
    
    public autores(){     
    }
    
    public autores(int cod_au, String nom_autor, String ape_autor, String nacionalidad){
        this.cod_au = cod_au;
        this.nom_autor = nom_autor;
        this.ape_autor = ape_autor;
        this.nacionalidad = nacionalidad;
    }

    public int getCod_au() {
        return cod_au;
    }

    public void setCod_au(int cod_au) {
        this.cod_au = cod_au;
    }

    public String getNom_autor() {
        return nom_autor;
    }

    public void setNom_autor(String nom_autor) {
        this.nom_autor = nom_autor;
    }

    public String getApe_autor() {
        return ape_autor;
    }

    public void setApe_autor(String ape_autor) {
        this.ape_autor = ape_autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
