package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Cliente cliente1 = new Cliente();
        Trabajador trabajador1 = new Trabajador();

        persona1.setEdad(20);
        persona1.setNombre("Carlos");
        persona1.setTelefono(3000);
        cliente1.setCredito(500);
        trabajador1.setSalario(2000);
        System.out.println("La edad es: "+persona1.getEdad()+"\n"+"El numero de telefono es: "+
                persona1.getTelefono()+"\n"+"El nombre es: "+persona1.getNombre()+"\n"+"El credito es de: "+
                cliente1.getCredito()+"\n"+"El salario es "+trabajador1.getSalario());
    }
}
