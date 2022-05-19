#Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

#Entrada
#Seis valores, negativos e/ou positivos.

#Saída
#Imprima uma mensagem dizendo quantos valores positivos foram lidos.

A = float(input())
B = float(input())
C = float(input())
D = float(input())
E = float(input())
F = float(input())

positivos = 0

if A > 0:
    positivos = positivos +1
    
if B > 0:
    positivos = positivos +1
    
if C > 0:
    positivos = positivos +1
    
if D > 0:
    positivos = positivos +1
    
if E > 0:
    positivos = positivos +1

if F > 0:
    positivos = positivos +1    

print('{} valores positivos'.format(positivos))