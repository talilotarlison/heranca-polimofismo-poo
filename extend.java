//A herança de classes é um conceito comum em linguagens de programação orientadas a objetos, como Java. Neste modelo, a reutilização de código e a hierarquia de objetos //são baseadas em classes. Uma classe pode herdar propriedades e métodos de outra classe através do mecanismo de herança123.

//A herança em Java é representada pela palavra-chave extends na declaração da classe, seguida do nome da classe da qual se deseja herdar.

//Teste de herança ChatGPT

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Cat myCat = new Cat();  
    myAnimal.animalSound();
    myCat.animalSound();
  }
}


//Teste herança
class Robo {
    int peso;
  public void roboSound() {
    System.out.println("Som do r2d2!!");
  }
}
class RoboMarte extends Robo {
  public void marteSound() {
    System.out.println("Som bb8!!");
  }
}

public class teste {
  public static void main(String[] args) {
    RoboMarte bode = new RoboMarte();  
    bode.peso = 34;
    System.out.println(bode.peso);
    bode.marteSound();
    bode.roboSound();
  }
}

//Teste de classe, obejeto, herança
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
