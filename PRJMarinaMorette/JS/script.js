function myFunction(){
var nome = document.getElementById("nome").value;
document.getElementById("title").innerHTML = "Cadastro de usuário: " + nome;
}
function imprimirSenha(){
   var a =document.getElementById("password").value;
   console.log(a);
}
function emailAlerta(){
    var email = document.getElementById("email").value;
    alert(email);
}
function cepMascara(cep){
    if(cep.value.length == 5){
        cep.value = cep.value + '-'
    }
}
function soma(){
const a=Number(document.getElementById("valorA").value);

const b=Number(document.getElementById("valorB").value);

const total=a+b;
document.getElementById("calculo").innerHTML=total;
}