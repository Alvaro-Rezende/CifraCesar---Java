Estrutura Principal (main)
O programa começa com um menu interativo que permite ao usuário escolher entre:

1. Criptografar uma mensagem

2. Descriptografar uma mensagem

3. Sair do programa

Fluxo do Programa:
Entrada do usuário:

O Scanner lê a opção escolhida (1, 2 ou 3).

Se for 1 ou 2, o programa pede:

A mensagem a ser processada.

O deslocamento (quantas posições no alfabeto a mensagem será rotacionada).

Se for 3, o programa encerra.

Processamento:

Se a opção for 1, chama criptografar(mensagem, deslocamento).

Se a opção for 2, chama descriptografar(mensagem, deslocamento).

Saída:

Exibe a mensagem processada (criptografada ou descriptografada).

Método criptografar(String texto, int deslocamento)
Lógica da Criptografia:
Cada letra da mensagem é deslocada n posições à direita no alfabeto.

Se passar de 'Z' (maiúscula) ou 'z' (minúscula), volta ao início do alfabeto (ex: 'Z' + 3 = 'C').
