//Teste de classes e objetos
public class Robo {
 String nome;
 String cor;
 float velocidadeMax;
 int nivelBateriaAtual;
 float pesoCargaMax;
 String tipoTracao;
 boolean temAntena;
         public static void main(String[] args) {
         Robo obj1 = new Robo();
         obj1.nome = "R-801";
         obj1.cor = "azul";
         obj1.velocidadeMax = 6;
         obj1.nivelBateriaAtual = 78;
         obj1.pesoCargaMax = 10;
         obj1.tipoTracao = "esteira";
         obj1.temAntena = true;
         System.out.println("Meu nome: " + obj1.nome);
         System.out.println("Cor do Robô: " + obj1.cor);
         System.out.println("Vel Max: " + obj1.velocidadeMax);
         System.out.println("Bat: " + obj1.nivelBateriaAtual);
         System.out.println("Carga Max: " + obj1.pesoCargaMax);
         System.out.println("Tipo Tração: " + obj1.tipoTracao);
         System.out.println("Tem Antena: " + obj1.temAntena);
     }
}



//Teste de classes e objetos 

public class Robo {
    String nome;
    String cor;
    float velocidadeMaxima;
    float cargaMaxima;
    String tipoTracao;
    boolean temAntena;
    int bateria;
    public static void main(String args[]) {
      Robo R2D2 = new Robo();
      R2D2.nome = "R2D2";
      R2D2.cor = "blue";
      R2D2.velocidadeMaxima = 35;
      R2D2.tipoTracao = "central";
      R2D2.temAntena = true;
      R2D2.bateria = 89;
      
      System.out.println(R2D2);
      System.out.println("meu nome é " + R2D2.nome);
       System.out.println("minha cor é " + R2D2.cor);
        System.out.println("minha velocidade maxima é " + R2D2.velocidadeMaxima);
         System.out.println("minha tração é " + R2D2.tipoTracao);
         System.out.println("Possuo antena: " + R2D2.temAntena);
        System.out.println("nivel de bateria: " + R2D2.bateria + "%");
    }
}


//Teste de ondicional
public class MyClass {
    public static void main(String args[]) {
       int baterias = 3;
       int distanciaPercorrida = 267;
       float percurso = ( 100 * baterias);
        
        if (distanciaPercorrida <= percurso) {
            System.out.println("você tem bateria suficiente para percorer");
        }else{ 
             System.out.println("você nao tem autonimia para o percurso");
            
        }
    }
}


//Teste de classes e objetos e metodos
public class Robo {
    String nome;
    String cor;
    float velocidadeMaxima;
    float cargaMaxima;
    String tipoTracao;
    boolean temAntena;
    int bateria;
    
    static void durabilidade( int distanciaPercorrida, int baterias ){
         int percurso =  100 * baterias;
        
        if (distanciaPercorrida <= percurso) {
          System.out.println("você tem bateria suficiente para percorer");
        }else{ 
          System.out.println("você nao tem autonimia para o percurso");
            
        }
        
    }
    
    static void fala( String fala ){
    
          System.out.println(fala);
        
    }
    public static void main(String args[]) {
      Robo R2D2 = new Robo();
      R2D2.nome = "R2D2";
      R2D2.cor = "blue";
      R2D2.velocidadeMaxima = 35;
      R2D2.tipoTracao = "central";
      R2D2.temAntena = true;
      R2D2.bateria = 89;
    
      
      System.out.println(R2D2);
      System.out.println("meu nome é " + R2D2.nome);
       System.out.println("minha cor é " + R2D2.cor);
        System.out.println("minha velocidade maxima é " + R2D2.velocidadeMaxima);
         System.out.println("minha tração é " + R2D2.tipoTracao);
         System.out.println("Possuo antena: " + R2D2.temAntena);
        System.out.println("nivel de bateria: " + R2D2.bateria + "%");
         durabilidade( 250 , 4);
         fala("Eu sou lindo");
    }
}
