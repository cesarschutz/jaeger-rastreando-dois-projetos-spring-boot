# Chamada-via-HTTP

Passo a passo:

- Iniciar serviço geo-ms

- Iniciar serviço roteirizador-ms

- Iniciar jaeger all-in-one:<br />
``
jaeger-all-in-one --collector.zipkin.http-port=9411
``

- Executar serviço no roteirizador-ms:<br />
Sem erro:<br />
``
localhost:8081/helloError
``
<br />Com erro proposital para analisar o erro no jaeger:<br />
``
localhost:8081/hello
``

- Verficar rastreabilidade:<br />
``
http://localhost:16686
``

![alt text](https://github.com/cesarschutz/jaeger-rastreando-dois-projetos-spring-boot/blob/master/Capturar.PNG)
