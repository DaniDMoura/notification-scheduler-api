# Notification Scheduler API

API para agendamento e envio de notificações desenvolvida em Java com Spring Boot.
Projetada para ser extensível e fácil de integrar em sistemas existentes.

Principais funcionalidades:
- Criação de notificações agendadas
- Suporte para a adição múltiplos canais (ex.: email, SMS, push)
- Repetição e cron expressions para agendamentos complexos
- Registro e histórico de envios

Tecnologias usadas:
- Java 21 
- Spring Boot
- Spring Data JPA
- Spring Scheduler 
- Banco de dados relacional (MySQL)

Estrutura do projeto:
- src/main/java: código-fonte da aplicação
- src/main/resources: configurações e arquivos estáticos

Pré-requisitos:
- Java 21+
- Maven 
- MySQL ou outro banco compatível

Instalação e execução local:
1. Clone o repositório:
   git clone [DaniDMoura/notification-scheduler-api](https://github.com/DaniDMoura/notification-scheduler-api.git)
2. Acesse o diretório do projeto:
   cd notification-scheduler-api
3. Copie o arquivo de exemplo de propriedades e ajuste:
   cp src/main/resources/application.example.yml src/main/resources/application.yml
4. Configure as variáveis de conexão com o banco e provedores de notificação
5. Execute com Maven:
   mvn spring-boot:run

Contribuição:
- Abra issues para bugs e features; envie PRs com descrições claras, testes e documentação
