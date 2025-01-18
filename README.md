# Resumo Teórico
O Desenvolvimento Orientado a Testes (TDD) é uma metodologia de desenvolvimento de software popularizada por Kent Beck em 2003. Ele baseia-se em começar o desenvolvimento pela escrita de testes, antes mesmo de implementar o código, incentivando uma definição clara dos requisitos e do comportamento esperado do software. Isso assegura maior qualidade, promove um design de código mais limpo e sustentável e melhora a compreensão dos requisitos.

## O processo do TDD é conhecido como "Red-Green-Refactor":


<img src="https://sofy.ai/wp-content/uploads/2024/07/Test-Driven-Development-Process.png" width="400" height="300">

**Fonte:** https://sofy.ai/blog/what-is-test-driven-development/

❌**Red:** Escrever um teste que inicialmente falha, representando o comportamento esperado.❌  
✅**Green:** Implementar o código necessário para que o teste passe.✅  
🔧**Refactor:** Refatorar o código, melhorando sua estrutura, enquanto mantém os testes funcionando.🔧  

O foco inicial do TDD está em testes unitários, que validam a funcionalidade das menores partes testáveis do sistema, como funções ou métodos. Ferramentas como o JUnit 5 são frequentemente utilizadas para facilitar a criação, execução e organização desses testes.

## TDD ou Testes depois do desenvolvimento?

| TDD                                                                                              | Testes tradicionais                                                             |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| Os testes são escritos antes de escrever qualquer código.                                        | Os testes são escritos depois de escrever o código.                             |
| Enfatiza a escrita da quantidade mínima de código necessária para passar no teste.               | Enfatiza a escrita de todo o código e os testes posteriores.                    |
| Concentra-se em testar o código no nível da unidade.                                             | Concentra-se em testar todo o aplicativo como um todo.                          |
| Ajuda os desenvolvedores a detectar bugs logo no início e a produzir um código mais sustentável. | Isso pode levar à descoberta de bugs mais tarde no processo de desenvolvimento. |
| Envolve refatoração contínua do código durante a execução de todos os testes.                    | Envolve testes após a conclusão do processo de desenvolvimento.                 |
**Fonte:** https://testsigma.com/blog/test-driven-development-testsigma/

## JUnit <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="25" height="25">
O JUnit é um framework de teste unitário para Java que permite isolar e validar pequenos módulos de código. Ele suporta a execução de múltiplos testes em sequência, fornece relatórios detalhados sobre sucessos e falhas, e facilita a configuração e limpeza do ambiente de execução antes e depois de cada teste. Isso torna o processo mais eficiente e organizado, ajudando os desenvolvedores a identificar e corrigir problemas rapidamente.

### @Annotations
No contexto do JUnit, as anotações são essenciais para indicar ao framework como os testes devem ser configurados, executados e organizados.


| Anotação             | Descrição                                                                                                                                                           |
|----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `@Test`              | Indica que o método é um teste. Usada para identificar métodos de teste que serão executados pelo framework. É obrigatória em métodos de teste unitário.            |
| `@BeforeEach`        | Executa um método antes de cada teste. Útil para configurar um estado inicial comum aos testes.                                                                     |
| `@AfterEach`         | Executa um método após cada teste. Usada para limpar recursos ou restaurar estados modificados pelo teste.                                                          |
| `@BeforeAll`         | Executa um método uma vez antes de todos os testes da classe. Geralmente usado para configurar recursos globais compartilhados. O método anotado deve ser `static`. |
| `@AfterAll`          | Executa um método uma vez após todos os testes da classe. Útil para liberar recursos globais ou realizar operações finais. O método também deve ser `static`.       |
| `@DisplayName`       | Define um nome descritivo para o teste, facilitando a leitura de relatórios. Útil para exibir nomes mais amigáveis em vez do nome do método.                        |
| `@Disabled`          | Desativa o teste ou método de teste. Geralmente usado para ignorar testes temporariamente durante o desenvolvimento.                                                |
| `@ParameterizedTest` | Permite executar o mesmo teste com diferentes conjuntos de dados. Geralmente usado em conjunto com fontes de dados, como `@ValueSource`.                            |
| `@ValueSource`       | Fornece valores para testes parametrizados.                                                                                                                         |
| `@CsvSource`         | Fornece valores tabulares para testes parametrizados. Cada linha no CSV representa um conjunto de dados.                                                            |
| `@RepeatedTest`      | Executa o mesmo teste várias vezes. Útil para validar consistência em cenários repetitivos.                                                                         |
| `@Timeout`           | Define um limite de tempo para a execução de um teste. Se o teste exceder o tempo especificado, ele falha.                                                          |

### Assertions
O JUnit utiliza métodos estáticos para verificar condições nos testes.

| Assertions                                                           | Descrição                                                                                                                                                            |
|----------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `assertEquals(expected, actual)`                                     | Verifica se os valores são iguais.                                                                                                                                   |
| `assertNotEquals(unexpected, actual)`                                | Verifica se dois valores não são iguais.                                                                                                                             |
| `assertTrue(condition)` / `assertFalse(condition)`                   | Verifica se uma condição é verdadeira ou falsa.                                                                                                                      |
| `assertNull(object)` / `assertNotNull(object)`                       | Verifica se um objeto é nulo ou não nulo.                                                                                                                            |
| `assertSame(expected, actual)` / `assertNotSame(unexpected, actual)` | Verifica se dois objetos são a mesma instância (comparam referências).                                                                                               |
| `assertArrayEquals(expectedArray, actualArray)`                      | Verifica se dois arrays são iguais.                                                                                                                                  |
| `assertThrows(expectedType, executable)`                             | Verifica se uma exceção esperada é lançada.                                                                                                                          |
| `assertAll(executables...)`                                          | Agrupa várias asserções para execução conjunta. Mesmo que algumas falhem, todas as asserções são executadas, e as falhas são relatadas juntas.                       |
| Mensagens Personalizadas                                             | Todos os métodos de asserção permitem adicionar mensagens personalizadas para exibição em caso de falha. Essas mensagens podem ser passadas como o último parâmetro. |

# Conclusão

TDD promove um desenvolvimento mais disciplinado e focado na qualidade desde o início, com uma abordagem iterativa que melhora tanto o design quanto a manutenção do código. Testes após o desenvolvimento focam na verificação do código já existente, o que pode levar a mais retrabalho e a um ciclo de feedback mais longo, impactando potencialmente a eficiência e a qualidade geral do software.

# Fontes

https://www.devmedia.com.br/test-driven-development-tdd-simples-e-pratico/18533  
https://testsigma.com/blog/test-driven-development-testsigma/  
https://junit.org/junit5/docs/current/user-guide/  
https://www.youtube.com/watch?v=bLdEypr2e-8  