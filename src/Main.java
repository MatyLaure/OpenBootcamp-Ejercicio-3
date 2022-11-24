public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(20);
        System.out.println(persona.getEdad());
        persona.setNombre("Matias Garcia");
        System.out.println(persona.getNombre());
        persona.setTelefono(42485888);
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    private int telefono;
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}