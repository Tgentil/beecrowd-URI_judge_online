/* Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” . */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var valores = input.split(" ");

var H1 =parseInt(valores.shift());
var M1 =parseInt(valores.shift());

var H2 =parseInt(valores.shift());
var M2 =parseInt(valores.shift());


var inicio = H1 * 60 + M1;
var fim = H2 * 60 + M2;

var tempo = fim - inicio;
var hora = parseInt(tempo / 60);
var min = tempo % 60;

if ( hora <= 0 && min < 0 ){
    hora = 24 + hora - 1;
    min = 60 + min;
    console.log("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
 }
  else if ( hora <= 0 && min === 0 ){
    hora = 24 + hora;
    console.log("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
 }
else {
console.log("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
}
