
class Calcular {
  constructor(num1, num2) {
  this.num1 = num1;
   this.num2 = num2;
  }
  
    soma(){
    return this.num1 + this.num2 
  }
 //modifica o valor do atributo da class
  // modifica a a informação do atributo da class mudando seu valor
 set somaNovamente1(num1) {
   this.num1 = num1;
   //this.num2;
  }
   set somaNovamente2(num2) {
   this.num2 = num2;
   this.num1;
  }
  //retorna valor do atributo da class
  // get pega a informação do atributo da class
  get retonorNumero(){
     return this.num2;
  }

}

var somar = new Calcular(1,1)
console.log(somar.soma())
console.log(somar.retonorNumero);
console.log(somar.somaNovamente1=5, somar.somaNovamente2=5);
console.log(somar.soma())
