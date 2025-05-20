# 🪞 Java Reflection

Este repositório contém um exemplo simples e prático do uso de **reflection em Java**, demonstrando como acessar e modificar **campos privados** e invocar **métodos (inclusive privados e estáticos)** em tempo de execução.

---

## 📚 O que você vai aprender

- Como usar `getDeclaredFields()` e `getDeclaredMethods()` para acessar membros da classe.
- Como modificar atributos privados com `Field#setAccessible(true)`.
- Como invocar métodos privados e estáticos usando `Method#setAccessible(true)` e `Method#invoke()`.
- Conceitos de encapsulamento e como o reflection pode ignorá-los (com responsabilidade!).

---

## 📁 Estrutura

- `Main.java` – Classe principal com todos os testes de reflexão.
- `Cat.java` – Classe de exemplo com atributos e métodos públicos e privados.

---

## ⚠️ Observação

Este projeto é apenas para fins **educacionais**. O uso de `setAccessible(true)` **quebra o encapsulamento** e deve ser evitado em aplicações reais, exceto em casos muito específicos (ex: bibliotecas de serialização, frameworks, testes, etc.).

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/java-reflection-estudo.git
