package clasegenerica;

/*
 * @author DIEGO LOPEZ
 */
class   Usuario {
    
    private String Nombre;
    private int Edad;
    private String FechaNac;
    private String Eps;

    public Usuario(String nombre, int edad, String fecha, String eps) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.FechaNac = fecha;
        this.Eps = eps;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public String getFecha() {
        return FechaNac;
    }

    public void setFecha(String fecha) {
        this.FechaNac = fecha;
    }

    public String getEps() {
        return Eps;
    }

    public void setEps(String eps) {
        this.Eps = eps;
    } 
}
