public class Ejercicio8 {


    public static void main(String[] args) {
        Persona personaNueva = new Persona();
        personaNueva.setEdad(22);
        personaNueva.setNombre("Airam Ontiveros");
        personaNueva.setTelefono("8181818181");

        System.out.println("Estas son las propiedades de la persona 1:" +
                "\n- Edad: "+ personaNueva.getEdad()+"" +
                "\n- Nombre: "+ personaNueva.getNombre()+"" +
                "\n- Telefono: "+ personaNueva.getTelefono());
    }



}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
