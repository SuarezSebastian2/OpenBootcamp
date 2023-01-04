package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(20);
        persona1.setNombre("Carlos");
        persona1.setTelefono(3000);
        System.out.println("La edad es: "+persona1.getEdad()+"\n"+"El numero de telefono es: "+
                persona1.getTelefono()+"\n"+"El nombre es: "+persona1.getNombre());
    }
}
