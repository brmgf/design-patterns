# Design Patterns
Este estudo é baseado nas aulas do professor Rodrigo Martins Pagliares da Universidade Federal de Alfenas.

Nesse repositório está um projeto contendo 3 princípios base e 23 design patterns que são apresentados no livro **Padrões de Projetos: Soluções Reutilizáveis de Software Orientados a Objetos** (traduzido em português).
É importante ter em mente que requisitos mudam, portanto, o sistema deve estar preparado para expandir ou receber alterações de forma que essas mudanças tenham o menor impacto possível na aplicação. 
As 23 soluções apresentadas no livro são uma formalização de padrões de design que foram observados pelos autores durante suas carreiras e que apresentaram uma melhor adaptabilidade às alterações de requisitos respeitando as boas práticas de programação.

O projeto está organizado da seguinte maneira: existem dois pacotes principais, os princípios e os padrões.
Cada implementação possui ainda dois subpacotes: o contexto é utilizado para ilustrar uma implementação para determinado requisito, depois o código é reescrito em uma melhor abordagem, ilustrando uma implementação mais alinhada às boas práticas.

## Princípios
### 1 - Interface sobre implementação
**Contexto:** Suponha-se que será desenvolvido um sistema para um hotel. Esse sistema deverá gerenciar as reservas de hóspedes e controlar o serviço de quarto. O sistema também será implementado inicialmente com o SGBD MySql.
Então é criado uma classe dedicada a conectar as services com o banco MySql. 

**Problema:** Supondo que em algum momento seja trocado o SGBD para para Oracle.
Nesse caso, essa alteração gera um efeito cascata onde todas as services que dependem da conexão deverão ser alteradas.

**Melhor abordagem:** Favorecer a utilização de uma inferface ou classe abstrata responsável pela conexão com o banco, passando a implementação das regras do SGBD para sua classe específica. 

Essa solução diminui o acoplamento entre a conexão com o banco de dados e as services. Trocando novamente o SGBD, basta criar uma nova classe implementando a interface de conexão, não sendo necessário realizar manutenção nas services. 

### 2 - Composição sobre Herança
**Contexto:** Um sistema é desenvolvido para criar dois tipos de containers, um chamado Flow container que adiciona objetos da esquerda para a direita `[1 2 3]` e um chamado Grid container que adiciona objetos da esquerda para a direita e de cima para baixo, `[1 2 3; 4 5 6]`.
Para isso é criado uma classe pai contendo os comportamentos comuns relacionado aos containers e cada tipo de container herda seus comportamentos.

**Problema:** Após a primeira implementação do sistema surgem novos requisitos para adicionar aos containers borda sólida ou borda tracejada. 
Então é criado dois novos containers Flow e dois novos containers Grid, um para a borda sólida e outro para borda tracejada.

**Melhor abordagem:** É criada uma classe abstrata para os container e outra para bordas, agrupando aquilo que é comum de seus respectivos objetos.
Porém, é feita uma inversão de dependências: uma borda precisa de um container mas um container não precisa de uma borda. 
Assim, faz-se uma composição e os objetos de borda passam a ter um container como atributo fazendo com que os containers existam de forma independente.

Essa solução diminui a duplicação de código. Uma nova borda ou um novo container poderão ser adicionados de forma mais rápida pois serão tratados de forma separada.

### 3 - Encapsular o que varia
**Contexto:** Em um sistema de jogadores de diversos esportes é esperado que existam os comportamentos de treinar, competir e planejar táticas.
Então temos uma classe abstrata Jogador e a partir dela teremos um jogador de futebol, tênis e golfe.

**Problema:** Supondo que posteriormente é adicionado um novo requisito para adicionar o comportamento de correr, porém, o jogador de golfe não possui esse comportamento.

**Melhor abordagem:** Cria-se uma inferface para o comportamento de correr e as classes de jogadores que devem correr passam a implementar essa interface.

Essa solução isola partes do código que variam tornando mais fácil a manutenção de forma a não prejudicar as partes que não variam.

## Patterns

### Strategy
Definição: permite que algoritmos sejam selecionados em tempo de execução. É útil em situações onde é necessário trocar os algoritmos usados em uma aplicação.

### Adapter
Definição: converte a interface de uma classe em outra interface que o cliente espera. Permite que classes incompatíveis trabalhem juntas.

### Facade
Definição: fornece uma interface unificada para um conjunto de interfaces em um subsistema. Define um nível de interface mais alto que torna o subsistema mais fácil de ser utilizado.

### Singleton
Definição: assegura que uma classe possua apenas uma instância e fornece um ponto de acesso global a classe.

### Factory Method
Definição: define uma interface para criar um objeto mas deixa a subclasse decidir qual classe será instanciada.

### Abstract Factory
Definição: fornece uma interface para famílias relacionadas ou dependentes sem especificar as suas classes concretas.
