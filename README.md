# octoevents



## Configuração

O arquivo application.properties contem as configurações da aplicação:

### server.port
Porta http em que a aplicação será acessada, a padrão é 9090


### spring.datasource
Configuração do datasource da aplicação.

Por padrão está sendo usado o banco h2 em memória, pode-se alterar para
este conjunto de propriedades para utilizar um arquivo em disco ou até mesmo um outro banco de dados (neste caso, deve-se incluir
o driver jdbc deste banco como dependência)

No caso do banco h2, é possível acessar seu console utilizando a url a baixo:
* http://localhost:9090/h2-console
Lembrando que a porta desta url é a mesma definida na propriedade server.port



## Para Iniciar o projeto
<code>
   mvnw spring-boot:run
</code>


