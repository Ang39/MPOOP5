class Coche{
  //Sección de atributos
  String color;
  String marca;
  int numPuertas;
  int anio;
  int potencia;
  boolean automatico;
  Persona chofer;
  Persona copiloto;
  Persona pasajero1;
  Persona pasajero2;



  //Sección de constructores
  public Coche(){

  }
  public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2){
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
    this.chofer = chofer;
    this.copiloto = copiloto;
    this.pasajero1 = pasajero1;
    this.pasajero2 = pasajero2;
  }

  //Sección de metodos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }
  public void avanzar(boolean avanza){
    //avanza == true
    //true == true -> true
    if(avanza){
      System.out.println("Estoy avanzando a 10 km/h");
    }else{
      System.out.println("Voy a 0 km/h");
    }
    
  }
  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
  }
  public void frenar(boolean frenar){

    if(frenar){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
    
  }
  public void abrirPuertas(int numPuertasAAbrir){

    if(numPuertasAAbrir > numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
    }
    else{
      System.out.println("Abriendo"+numPuertasAAbrir+"puertas");
    }
    
  }
  //Seccion set/get de personas
  public Persona getChofer(){
    return chofer;
  }

  public void setChofer(Persona chofer){
    this.chofer = chofer;
  }

  public Persona getCopiloto(){
    return copiloto;
  }

  public void setCopiloto(Persona copiloto){
    this.copiloto = copiloto;
  }

  public Persona getPasajero1(){
    return pasajero1;
  }

  public void setPasajero1(Persona pasajero1){
    this.pasajero1 = pasajero1;
  }

  public Persona getPasajero2(){
    return pasajero2;
  }

  public void setPasajero2(Persona pasajero2){
    this.pasajero2 = pasajero2;
  }  
  @Override
  public String toString(){
    return "Coche{"+"marca="+marca+" anio="+anio+" color="+color+" numPuertas="+numPuertas+" automatico="+automatico+" potencia="+potencia+" chofer="+chofer+" copiloto="+copiloto+" pasajero 1="+pasajero1+" pasajero 2="+pasajero2+"}";
  }


}