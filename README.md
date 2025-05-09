# 💸 Conversor de Cambio | Java Backend Challenge

![Conversao de Cambio  Banner](https://github.com/user-attachments/assets/aa711cef-7c31-4a1d-a57b-dc6acb2f36ba)

Esta é a resolução de um desafio da formação Java e Orientação a Objetos do bootcamp da Alura & Oracle. 
O projeto consome a API **ExchangeRate-API** e faz a conversão entre os dois câmbios escolhidos pelo usuário.

## 🧠 Funcionalidades
- Leitura da moeda base, quantidade e moeda alvo via terminal.
- Consulta à ExchangeRate-API utilizando HTTP.
- Desserialização de JSON para objetos Java utilizando a biblioteca Gson.
- Exibição do resultado da conversão com a quantidade convertida entre as moedas.

## 📁 Estrutura do Projeto

```
src/
├── App.java
├── model/
│   └── Coin.java
├── dto/
│   └── CoinDTO.java
└── services/
├── ExchangeService.java
├── RequestService.java
└── ResponseService.java
```

## ⚙️ Tecnologias Utilizadas
- Java 17+
- [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) (para serialização JSON)
- [Biblioteca Java HTTP Client](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpClient.html) (java.net.http)
- [ExchangeRateAPI](https://app.exchangerate-api.com/)

📦 Como Usar
1. Clone este repositório:

```
git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas
```

1. Adicione sua chave da ExchangeRate-API na classe **Main.java**:
```
final String API_KEY = "SUA_CHAVE_AQUI";
```

3. Adicione a dependência Gson:

- Baixe o arquivo JAR do Gson em Maven Central (versão 2.10.1 recomendada) e coloque-o no diretório lib do projeto.
- Ou use Maven (veja seção "Configuração com Maven" abaixo).

4. Compile e execute o projeto:

Se estiver usando a linha de comando com javac:

```
javac -cp lib/gson-2.10.1.jar -d out src/**/*.java
java -cp out:lib/gson-2.10.1.jar App
```

## 📌 Exemplo de Saída

Opções:
```
ARS - Peso argentino
BOB - Boliviano boliviano
BRL - Real brasileiro
CLP - Peso chileno
COP - Peso colombiano
USD - Dólar americano
Moeda a ser convertida
USD
Insira a quantidade de USD:
100
Opções:
ARS - Peso argentino
BOB - Boliviano boliviano
BRL - Real brasileiro
CLP - Peso chileno
COP - Peso colombiano
USD - Dólar americano
Moeda a ser convertida
BRL
$100USD's = $520.50BRL's
```
