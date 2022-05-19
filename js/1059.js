/*Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha. */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var i = parseInt(1);
        var resultado;
        do {
            i++;
            if ((i % 2) === 0) {
                resultado = i;
                console.log(resultado);
            }
        }while (i < 101);
