# Productor de mensajes en topics

* Se debe tener levantado kafka y los topics configurados en las propiedades
* Cada endpoint del api rest envia un mensaje diferente al topic asociado
* Se deben copiar las clases java en la carpeta src/main/java y los avsc en src/main/resources
  Se puede tanto componer el mensaje construyendolo con las clases java como metiendolo en un json