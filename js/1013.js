/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l". */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var Valores = input.split(" ");

var A = parseInt(Valores.shift());
var B = parseInt(Valores.shift());
var C = parseInt(Valores.shift());

var MaiorAB = parseInt(A + B + Math.abs(A-B)) /2;
var MaiorXC = parseInt(C + MaiorAB + Math.abs(C-MaiorAB)) /2;


console.log(MaiorXC + " eh o maior");
