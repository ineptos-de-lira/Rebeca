class Carro {

    //Variables
    String color;
    int modelo;
    String marca;
    
    //Funciones
    
    double frenar(double presionPedal){
        System.out.println("Frenando");
        return presionPedal*-2;
    }

    double acelerar(double presionPedal){
        System.out.println("Acelerando");
        return presionPedal;
        
    }


}

class E1Clases{
    public static void main (String[] args){
        System.out.println("p1");

         int gatito;
         gatito = 5;

         Carro tsuru;
         tsuru = new Carro();

         tsuru.modelo = 2011;
         tsuru.marca = "Nissan";
         tsuru.color = "Arena";

         double deltaVelocidad = tsuru.acelerar( 6.5);
         System.out.println(deltaVelocidad);
         
        double deltaVelocidad2 = tsuru.frenar( 7.9);
         System.out.println(deltaVelocidad2);
         

    }
    
}