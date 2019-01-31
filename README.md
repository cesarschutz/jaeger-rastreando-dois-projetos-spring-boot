# Chamada-via-HTTP

Passo a passo:

- Iniciar serviço geo-ms

- Iniciar serviço roteirizador-ms

- Iniciar jaeger all-in-one:
``
jaeger-all-in-one --collector.zipkin.http-port=9411
``

- Executar serviço no roteirizador-ms
Sem erro:
``
localhost:8081/helloError
``

Com erro proposital para analisar o erro no jaeger:
``
localhost:8081/hello
``

- Verficar rastreabilidade:
``
http://localhost:16686
``

![alt text](https://github.com/cesarschutz/jaeger-rastreando-dois-projetos-spring-boot/blob/master/Capturar.PNG)
