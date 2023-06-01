//https://www.alura.com.br/artigos/construtores-em-javascript?gclid=EAIaIQobChMIsvfJ3rnZ_QIV9BvUAR3FWgbOEAAYASAAEgIt5PD_BwE
//https://www.devmedia.com.br/poo-trabalhando-com-classes-e-objetos-em-javascript/28434
//https://www.freecodecamp.org/portuguese/news/tutorial-de-arrays-de-objetos-em-javascript-como-criar-atualizar-e-percorrer-objetos-em-lacos-usando-metodos-de-array-do-js/

//Use de poo com javascrip aplicado

class Pokemon{
  nome;
  forca;
  pais;
  valor;
   constructor(nome, forca, pais, valor){
     this.nome = nome;
     this.forca = forca;
     this.pais = pais;
     this.valor = valor;
   }
  
}
var baku = new Pokemon("baku" , 50, "BR", 5000);
var can = new Pokemon("can" , 50, "BR", 4000);

var perso = {baku, can};

perso.kabau = new Pokemon("kabau" , 60 ,"EUA" , 8000)

console.log(perso)

//condicional de objetos

if ( baku.forca > can.forca){
  console.log("Boku venceu!")
}else if( baku.forca < can.forca){
   console.log("Boku perdeu!")
}else{
   console.log("Empatou")
}


// cacular desconto no preço do produto

class Produto{
  static lote  = 0620247;
  nome;
  preco;
  constructor(lote, nome,preco){
    this.lote = lote;
    this.nome = nome;
    this.preco = preco;  
  }
  calcularDesconto(){
    return this.preco - (this.preco * 0.10)
  }
  
}

var camisa = new Produto(Produto.lote,"camisa", 390)
console.log(camisa)
console.log(Produto.lote)

console.log(camisa.calcularDesconto());



//class musica

class Musica{
  nome;
  id;
  constructor(nome, id){
    this.nome = nome;
    this.id = `https://wwww.youtube.com/${id}`
    
  }
  
}
var muse = new Musica("panic","8fas89fawr");
var link = `https://wwww.youtube.com/${muse.id}`
console.log(muse);
console.log(link);
