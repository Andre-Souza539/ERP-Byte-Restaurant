# ERP para o Byte Restaurant

Objetivos com esse projeto é criar um sistema de ERP para a empresa no ramo alimentício

<hr>
A empresa contempla algumas entidades vamos a elas:

**Clientes**

- Nome
- Sobrenome
- Data Nascimento
- CPF
- Endereço
  - Rua
  - Bairro
  - Estado
  - CEP
- Forma de Pagamento Preferida

**Funcionários**

- Nome
- Sobrenome
- Cargo
  - Cozinheiro
  - Gerente
  - Atendente
  - Entregador
- Data Nascimento
- CPF
- Endereço
  - Rua 
  - Bairro
  - Estado
  - CEP
- Salário
- Gorjetas

**Pratos**

- Nome
- Tamanho
- Identificador



**Venda**

- Cliente
  - Nome
  - Endereço de Entrega
  - Forma de Pagamento
- Prato
  - Nome
  - Quantidade
- Entregador
  - Carro 
  - Moto
- Preço
  - Total = (Valor do Produto * Quantidade)
  - Taxa de Entrega
  - Somatório 


<hr>

Objetivo Geral será Criar uma plataforma onde poderão ser cadastrados os produtos também como sua compra.

O processo de Compra começa com o CLIENTE(Já Cadastrado) vai para um Menu com os produtos cadastrados, uma vez que selecionado o produto e sua quantidade, o cliente pode ir para a página de pagamento.

O Pagamento Trabalha com o método de Pagamento na entrega e uma taxa fixa para entrega de R$15 o cliente também pode pagar via cartão e também pode adicionar uma gorjeta para o entregador.

Após a Compra em um painel haverá uma mensagem indicando que houve um pagamento, desse ponto o atendente pode passar o pedido para cozinha, quando o prato estiver pronto o Entregador receberá a comida e o painel do cliente receberá uma indicação de que a comida ja foi pronta e segue para a entrega.

O Cliente pode Cancelar a Compra, ou reportar algum problema com seu pedido

Objetivo desse projeto é trabalhar com as seguintes Tecnologias
<br><br>
Java Security <br>
Spring Boot <br>
ThymeLeaf<br>
Bootstrap<br>



<hr>
