# Descripción

Ejemplo de Consumidor y Productor con kafka y spring boot 3

# Ejecución

* Ejecutar un "docker compose up" en el directorio donde se encuentra el fichero que genera Kafka y
  un RedPanda.
* Tras levantar el contenedor será accesible RedPanda desde localhost:8080
* Compilar y ejecutar el producer, éste enviará mensajes al topic "Compras" (es posible que sea
  necesario crear el topic)
* Compilar y ejecutar el consumer, éste consumirá los mensajes del topic "Compras" y los imprimirá
  por consola
