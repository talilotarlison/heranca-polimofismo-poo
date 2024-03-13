// https://www.w3schools.com/Js/js_classes.asp

class Robo {
    id;
    nome;
    cor;
    anoFabricacao;
    #numRodas;
    #totalPercurso;
  constructor(id, nome, cor, anoFabricacao, numRodas, totalPercurso) {
    this.id = id; 
    this.nome = nome;
    this.cor = cor;
    this.anoFabricacao = anoFabricacao;
    this.#numRodas = numRodas;
    this.#totalPercurso = totalPercurso;
  }
  
  getNome(){
    return this.nome; 
  }
  
  setNome(nome){
    this.nome = nome;
    return `Meu novo nome é ${this.nome}!`;
  }
  
  getAno(){
    return this.anoFabricacao; 
  }
  
  setAno(ano){
    this.ano = ano;
    return `Meu ano de fabricação é ${this.ano}!`;
  }
 
   getCor(){
    return this.cor; 
  }
  
  setCor(cor){
    this.cor = cor;
    return `Minha cor é ${this.cor}!`;
  }
 
  calDistancia(atualDistancia){
    return `${this.getNome()} , falta ${this.#totalPercurso - atualDistancia} Km para completar o percurso.`
  }
  
  getNumRodas(){
    return this.#numRodas;
  }
}

var RoboMarte = new Robo (2484,'Curiosite','Ouro', 2021, 4, 200);

console.log(RoboMarte.calDistancia(150));
console.log(RoboMarte);


class Sonda extends Robo {
  marca;
  constructor(nome, marca,id, cor, anoFabricacao) {
    super(id,nome, cor, anoFabricacao);
     this.marca = marca;
  }
  
  getNome(){
    return `${this.nome} [Plus]`;
  }
  
  getMarca() {
    return this.marca;
  }
}

var SondaMarte = new Sonda ('Voyage', 'x',7884,'branco', 2023);
console.log(SondaMarte);
console.log(SondaMarte.getNome());
console.log(SondaMarte.getAno());
