#Projeto de devops
Aluno: Marcus Vinicius Cardoso de Melo<br>
Disciplina: Integração Contínua e DevOps [23E1_3]<br>
Curso: Engenharia de Software em Java<br>

Para subir o Prometheus e Grafana é necessário digitar o comando:

docker-compose up

na pasta raiz do projeto.

Prometheus: http://localhost:9090/ <br>
Grafana: http://localhost:3000/ <br>

Endpoints

[GET] /tecnicos -> Lista todos os tecnicos cadastrados<br>
[GET] /chamados -> Lista todos os chamados cadastrados<br>

[GET] /tecnicos/{id} -> Captura tecnico por ID<br>
[GET] /chamados/{id} -> Captura chamado por ID<br>

#Print's

Prometheus, Actuator, Health Check, Grafana
![](images/devops-grafana.png)

![](images/devops-prometheus.png)

Papertrail
![](images/devops-logs-papertrail.png)

Terraform + AWS
![](images/devops-aws-terraform.png)