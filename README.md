# Projeto Lotofácil

Este projeto consiste em um sistema de loteria chamado LOTOFÁCIL, desenvolvido em Java. O sistema é capaz de gerar jogos aleatórios, permitir que os jogadores façam suas apostas, verificar os resultados e calcular prêmios de acordo com as regras da loteria. O sistema funciona por meio do terminal, lendo e escrevendo dados.

## Requisitos

- JDK (Java Development Kit)
- Bibliotecas utilizadas: Scanner e Random
- Versão: 21.0.2

## Como rodar o projeto

Certifique-se de ter o JDK instalado em seu sistema.
Baixe ou clone o repositório do projeto.
Abra o terminal e navegue até o diretório do projeto.
Compile o código-fonte do projeto usando o comando javac Main.java.
Execute o programa compilado com o comando java Main.
Funcionamento do Sistema

O sistema LOTOFÁCIL possui um menu interativo, onde o usuário pode realizar diferentes tipos de apostas. Abaixo estão listadas as opções disponíveis no menu:

LOTOFÁCIL:
1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair

## Regras de Negócio

- Apostar de 0 a 100:
O usuário digita um número inteiro de 0 a 100.
Caso o número seja maior que 100 ou menor que 0, é exibida a mensagem "Aposta inválida."
Um número é sorteado aleatoriamente de 0 a 100.
Se o número escolhido pelo usuário for igual ao número sorteado, é exibida a mensagem "Você ganhou R$ 1.000,00 reais.", caso contrário, é exibida a mensagem "Que pena! O número sorteado foi: X."

- Apostar de A à Z:
O usuário digita uma letra de A à Z, podendo ser maiúscula ou minúscula.
Caso não seja uma letra, é exibida a mensagem "Aposta inválida."
A letra digitada é convertida para maiúsculo.
Uma letra premiada é escolhida (por exemplo, 'J').
Se a letra escolhida pelo usuário for igual à letra premiada, é exibida a mensagem "Você ganhou R$ 500,00 reais.", caso contrário, é exibida a mensagem "Que pena! A letra sorteada foi: X."

- Apostar em par ou ímpar:
O usuário digita um número inteiro.
É verificado se o número é par ou ímpar.
Se o número for par, é exibida a mensagem "Você ganhou R$ 100,00 reais.", caso contrário, é exibida a mensagem "Que pena! O número digitado é ímpar e a premiação foi para números pares."
Para sair do programa, o usuário deve digitar o número 0 no menu LOTOFÁCIL.

Este é o funcionamento básico do sistema LOTOFÁCIL, permitindo aos usuários realizar apostas e conferir os resultados de maneira interativa.

# Vídeo de apresentação 



https://github.com/MoreiraAri/linguagens-de-programa-o/assets/144627734/a6eb1d29-3988-49dc-8b87-761fcab277d3


