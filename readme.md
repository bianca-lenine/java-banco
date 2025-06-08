# Java Banco

Projeto base em Java utilizando Maven.

## Requisitos

- Java 11 ou superior
- Maven 3.6 ou superior

## Como executar

1. Clone o repositório
2. Na pasta do projeto, execute:
   ```bash
   mvn clean install
   ```
3. Para executar o programa:
   ```bash
   mvn exec:java -Dexec.mainClass="com.banco.Main"
   ```

## Estrutura do Projeto

```
src/
  main/
    java/
      com/
        banco/
          Main.java
pom.xml
```

## Desenvolvimento

Para adicionar novas dependências, edite o arquivo `pom.xml` e adicione-as na seção `<dependencies>`.

# Tarefas a serem desenvolvidas

# DEV-WIP
1. Criação de conta - Bianca Lenine

# Backlog
- Saque e deposito 
- Consulta de Saldo
- Fechamento de Conta
- Transferencia
- Extrato bancário
- Alteração de dados cadastrais
- Pagamento de contas e boletos
- Agendamento de pagamentos
- Cartão de crédito/débito