/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto. */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var produtos = input.split("\n");

var item1 = produtos.shift().split(" ");
var item2 = produtos.shift().split(" ");

var code1 = item1.shift();
var units1 = parseInt(item1.shift());
var price1 = parseFloat(item1.shift());

var code2 = item2.shift();
var units2 = parseInt(item2.shift());
var price2 = parseFloat(item2.shift());

var TOTAL = parseFloat(units1 * price1 + units2 * price2);

console.log("VALOR A PAGAR: R$ " + TOTAL.toFixed(2));
