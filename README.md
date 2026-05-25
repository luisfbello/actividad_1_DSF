# actividad_1_DSF
Acontinuacion se encuentra el desarrollo de la actividad numero 1 del diplomado

Autor: Luis Fernando Bello Gonzalez

Escenario 1:
Imagina que estás desarrollando una aplicación para una compañía automotriz que permite
a los clientes personalizar y ordenar un automóvil. Un objeto Automóvil puede tener muchas
configuraciones opcionales: tipo de motor, color, llantas, sistema de sonido, interiores,
techo solar, navegación GPS, etc.

Problema
Crear un objeto Automóvil con múltiples configuraciones puede llevar a constructores con
muchos parámetros (el infame "constructor telescópico") o a múltiples constructores
sobrecargados, lo que dificulta el mantenimiento y legibilidad del código.

Solucion:
* Se identifica que el tipo de patron que se puede usar para dar solucion al problema es creacional
* el patron creacional que se selecciono fue el patron builder ya que nos permite construir distintos
tipos y representaciones de un objeto complejo como lo es un automovil que puede tener varias caracteristicas 
que son opcionales.  



Escenario 2:
Estás desarrollando una aplicación que gestiona la visualización de notificaciones en
diferentes plataformas (por ejemplo: escritorio, móvil, web). Las notificaciones pueden ser
de distintos tipos (mensaje, alerta, advertencia, confirmación) y cada tipo puede mostrarse
de distintas formas según la plataforma.

Problema
Si usas herencia tradicional, tendrías que crear clases como:
● NotificacionMensajeWeb, NotificacionAlertaWeb, NotificacionMensajeMovil,
NotificacionAlertaMovil, etc.
Esto lleva rápidamente a una explosión combinatoria de subclases difíciles de mantener.

Solucion:
* se identifica que el patron que mejor puede solucionar el problema es estructural
* se observa que el patron que mejor se adapta a la solucion del problema es el bridge, ya que al evaluar las caractereisticas 
del problema se necesitan realizar muchas combinaciones de clases

Escenario 3:
Estás desarrollando una aplicación de chat grupal. Los usuarios pueden enviarse mensajes
entre sí dentro de una sala de chat. Sin embargo, gestionar las interacciones directas entre
cada usuario haría que cada uno deba conocer y comunicarse con todos los demás, lo que
resulta en una alta dependencia entre objetos.

Problema
Sin un mediador, cada usuario tendría que mantener referencias directas a todos los demás,
lo que genera un sistema difícil de escalar y mantener. Si agregas o eliminas usuarios, debes
actualizar muchas relaciones.

Solucion:
* Para este escenario podemos identificar que el patron que mejor se adapta es el de comportamiento
* Dentro de este patron el que nos sirve para dar solucion al problema es el patron mediador ya que nos permite 
mantener la creacion de multiples objetos y su interaccion sin un acoplamiento alto permitiendonos borrar o agregar 
otros sin que esto afecte.
