# Microservices Udemy - Projeto de Estudos

Este repositório é dedicado ao estudo e prática de arquitetura de microserviços. O projeto atualmente conta com dois serviços principais:

## Eureka Server (Naming Server)

O projeto inclui a implementação do **Eureka Server** como servidor de registro (naming server) para facilitar a descoberta de serviços entre os microserviços. O Eureka Server está localizado no diretório `naming-server` e deve ser iniciado antes dos demais serviços para que possam se registrar e se comunicar dinamicamente.

Consulte a documentação no diretório `naming-server` para instruções detalhadas de execução.

## API Gateway

O projeto também conta com um **API Gateway**, responsável por rotear as requisições e balancear a carga entre as diferentes instâncias dos microserviços. O API Gateway facilita a centralização do acesso, segurança e monitoramento, além de permitir o balanceamento eficiente das chamadas entre os serviços.

Consulte o diretório `api-gateway` para mais informações e instruções de execução.

## Serviços

- **cambio-service**  
    Serviço responsável por realizar conversão de moedas. Disponibiliza endpoints para consultar taxas de câmbio e converter valores entre diferentes moedas.
    Além disso, o **cambio-service** possui uma documentação interativa disponível via Swagger, permitindo explorar e testar os endpoints diretamente pelo navegador.

- **book-service**  
    Serviço para gerenciamento de cadastros de livros. Permite operações como criação, atualização, listagem e remoção de livros.
    Além disso, o **book-service** possui uma documentação interativa disponível via Swagger, permitindo explorar e testar os endpoints diretamente pelo navegador.

    ## Observabilidade com Zipkin

    O projeto integra o **Zipkin** para rastreamento distribuído (distributed tracing) nos dois microserviços (**cambio-service** e **book-service**) e no **API Gateway**. Com o Zipkin, é possível monitorar o fluxo das requisições entre os serviços, facilitando a identificação de gargalos e a análise de desempenho em ambientes distribuídos.

    Consulte a documentação de cada serviço para detalhes sobre configuração e acesso ao painel do Zipkin.

## Objetivo

O objetivo deste projeto é aprofundar conhecimentos em microserviços, explorando conceitos como comunicação entre serviços, escalabilidade, e boas práticas de desenvolvimento distribuído.

## Como executar

Cada serviço possui sua própria documentação e instruções de execução em seus respectivos diretórios.
