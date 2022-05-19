/* Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares. */

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var input = parseInt (input);
        var resultado;
        for (var i = input; i <= input+11; i ++) {
            if ((i % 2) !== 0) {
                resultado = i;
                console.log(resultado);
            }
        }

