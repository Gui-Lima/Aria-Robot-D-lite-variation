# Claudio's Amazing Aria Cheat Sheet

## Serviços
* ***runAsync(boolean)***
Inicializa a thread para rodar o robô.
* ***enableMotors()***
Habilita os motores do robô.
* ***lock()***
Trava a thread para que só você possa usá-la (usar antes de mandar comandos para o robô.).
* ***unlock()***
Destrava a thread, liberando seu uso para os outros (usar após mandar comandos para o robô).
## Movimentação
* ***move(int)***
Faz o robô andar para frente (na direção em que ele está apontado) a quantidade de milímetros passada como parâmetro.
* ***setHeading(int)***
Faz o robô girar em sentido anti-horário até o ângulo passado como parâmetro.
* ***sleep(int)***
Faz o robô ficar parado por tantos milissegundos.
* ***stopRunning(boolean)***
Para a movimentação do robô e fecha a thread (talvez).

## Informações do Robô
* ***getX()***
Retorna a coordenada x atual do robô.
* ***getY()***
Retorna a coordenada y atual do robô.
* ***getTh()***
Retorna o ângulo atual em que o robô está direcionado (graus).

## Informações dos Sensores
* ***getNumSonar()***
Retorna quantos sonares tem o robô. (No caso do p3dx-nolaser são 16)
* ***getSonarReading(int)***
Retorna um objeto ARSensorReading contendo as informações de onde aquele sonar bateu em uma parede.

## ARSensorReading
* ***getRange()***
Retorna a distância máxima alcançada pelo sensor. (No caso do p3dx-nolaser são 5000mm)
* ***getX()***
Retorna a coordenada x de onde o sonar bateu na parede, ou retorna -1 quando não bate em nada.
* ***getY()***
Retorna a coordenada y de onde o sonar bateu na parede, ou retorna -1 quando não bate em nada.
* ***getSensorTh()***
Retorna o ângulo daquele sensor em relação ao robô (graus).

