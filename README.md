# Resolução execício Beecrowd1079

##Descrição do problema
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

## Como Funciona
1. O usuário insere o número inteiro desejado, que é armazenado na variável `num`.
2. Uma estrutura de repetição `for` inicia no multiplicador 1 (`i = 1`) e avança sequencialmente até 10 (`i <= 10`).
3. Dentro do laço, o programa calcula o produto da multiplicação atual: `resultado = i * num`.
4. A linha resultante é impressa de forma formatada concatenando os valores textuais: `i + " x " + num + " = " + resultado`.