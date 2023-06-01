class Robo {
    String nome;
    String cor;
    float velocidadeMaxima;
    float cargaMaxima;
    String tipoTracao;
    boolean temAntena;
    int bateria;
    float peso;
    
      public void roboSound() {
        System.out.println("Som de bipe!");
      }
  
     static void durabilidade( int distanciaPercorrida, int baterias ){
         int percursoTotal =  100 * baterias;
        
        if (distanciaPercorrida <= percursoTotal) {
          System.out.println("Você tem bateria suficiente para percorer!");
        }else{ 
          System.out.println("Você não tem autonimia para o percurso!!");
            
        }
        
    }
    
    static void fala( String fala ){

          System.out.println(fala);
        
    }
}


class RoboVoador extends Robo {
   boolean falarPortugues;
  public void roboVoadorSound() {
    System.out.println("Som de buzina!!");
  }
}
 
public class TesteRoboDeMarte {
  public static void main(String[] args) {
    RoboVoador R2D2 = new RoboVoador();
      R2D2.nome = "R2D2";
      R2D2.cor = "Blue";
      R2D2.velocidadeMaxima = 35;
      R2D2.tipoTracao = "Central";
      R2D2.temAntena = true;
      R2D2.bateria = 89;
      R2D2.peso = 200;
    
      
      System.out.println(R2D2);
      System.out.println("Meu nome é " + R2D2.nome);
      System.out.println("Minha cor é " + R2D2.cor);
      System.out.println("Minha velocidade maxima é " + R2D2.velocidadeMaxima);
      System.out.println("Minha tração é " + R2D2.tipoTracao);
      System.out.println("Meu peso é " + R2D2.peso);
      System.out.println("Possuo antena: " + R2D2.temAntena);
      System.out.println("Nivel de bateria atual: " + R2D2.bateria + "%");
       R2D2.durabilidade( 250 , 4);
       R2D2.fala("Eu so robo que vai para Marte!!!");
       R2D2.roboSound();
  }
}
