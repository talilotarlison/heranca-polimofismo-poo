class Musica {
  nome;
  id;
  constructor(id,name){
    this.name = name;
    this.id = id;
  }
}
var  Adele = new Musica(155, "Set fire");
console.log(Adele);

class Formato extends Musica{
  tipo;
  time;
   constructor(id, nome ,tipo,time){
     super(id,nome);
    this.tipo = tipo;
     this.time = time;
   }
}

var muse = new Formato(155, "Panic Station", "mp3","4min");

console.log(muse);

//https://www.w3schools.com/jsref/jsref_class_extends.asp
