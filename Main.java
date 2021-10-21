class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    
    System.out.println(cir);
    cir.setRadio(5.6f);//->primer solucion
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);

    float var = -8.66f;
    cir.setRadio(var);
    System.out.println(cir);


    Coche coche1 = new Coche();
    
    
    System.out.println("######################");
    System.out.println(coche1);
    System.out.println("####################Composicion##################");
    Persona persona1 = new Persona();
    System.out.println(persona1);
    persona1.setNombre("Mau");
    persona1.setApellido("Arredondo");
    Fecha fecha = new Fecha( 19, 7, 1996);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());

    System.out.println("####################Composicion##################");

    Persona persona2 = new Persona("Angel","Anduaga", 19, 10, 2000);
    System.out.println(persona2);

    System.out.println("####################Extra##################");
    coche1.anio = 2020;
    coche1.automatico = true;
    coche1.color = "blanco";
    coche1.marca = "Nissan";
    coche1.numPuertas = 5;
    coche1.potencia = 150;
    coche1.encender();
    coche1.avanzar(true);
    coche1.frenar(true);
    coche1.apagar();
    coche1.abrirPuertas(4);
    

    Persona chofer = new Persona("Angel","Anduaga", 19 , 10, 2000);
    Persona copiloto = new Persona("Salvador","Cabañas", 5, 8, 1980);
    Persona pasajero1 = new Persona("Rubens","Sambueza", 1, 1, 1984);
    Persona pasajero2 = new Persona("Cuauhtemoc","Blanco", 17, 1, 1973);
    coche1.setChofer(chofer);
    coche1.setCopiloto(copiloto); 
    coche1.setPasajero1(pasajero1);
    coche1.setPasajero2(pasajero2);  


      

    System.out.println(coche1);        
  }
}