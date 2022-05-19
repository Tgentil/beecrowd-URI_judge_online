/* Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos. */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var Valores = input.split("\n");

var A = parseInt(Valores.shift());
var B = parseInt(Valores.shift());
var C = parseInt(Valores.shift());
var D = parseInt(Valores.shift());
var E = parseInt(Valores.shift());
var F = parseInt(Valores.shift());

let positivo = parseInt(0);
 
    if (A > 0){
        positivo = positivo + 1;
    }
    if (B > 0){
        positivo = positivo + 1;
    }
    if (C> 0){
        positivo = positivo + 1;
    }
    if (D > 0){
        positivo = positivo + 1;    
    }
    if (E > 0){
        positivo = positivo + 1;
    }       
     if (F > 0){
        positivo = positivo + 1;
     }  
