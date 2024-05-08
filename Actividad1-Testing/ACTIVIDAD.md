# Actividad 1 - Testing

## Preguntas

**Pregunta 1**

<p style="text-align: justify;"> En la representación gráfica que sigue, el SUT (Sistema Sujeto a Prueba) aparece en el núcleo, mientras que los DOC (Componentes Dependientes) son los elementos circundantes y fundamentales para el correcto desempeño del SUT. En el ámbito de las pruebas unitarias, el SUT suele ser una entidad única, como un método, mientras que los DOC son las unidades que el SUT requiere para operar de manera efectiva.

**Pregunta 2**


<p style="text-align: justify;">El SUT (System Under Test) en esta situación es representado por la clase FinancialService, la cual estamos evaluando. Sus colaboradores, conocidos como DOC (Dependencies of the Class), son los siguientes:

- clientDAO: Este componente actúa como una dependencia que facilita el acceso a la base de datos u otro sistema de almacenamiento para recuperar datos del cliente, como su categoría.
- calculator: Otra dependencia, este componente se encarga de realizar cálculos para determinar el bono basado en la categoría del cliente y el pago realizado.

 Las acciones fundamentales que se ejecutan dentro del método calculateBonus() para la evaluación son las siguientes:

1. Obtener la categoría del cliente mediante la llamada a clientDAO.getClientType(clientId).
2. Calcular el bono invocando a calculator.calculateBonus(clientType, payment).
3. Registrar el historial de bonos mediante clientDAO.saveBonusHistory(clientId, bonus).

**Pregunta 3**

<p style="text-align: justify;">Las pruebas para los empleados y directivos serían distintas, dado que cada uno cuenta con atributos y funciones particulares.
Por ejemplo, en las pruebas para los empleados se podrían evaluar las funciones y atributos vinculados a sus salarios, mientras que en las pruebas para los directivos se podrían examinar las funciones y atributos relacionados con la asignación de tareas o el monitoreo del avance de los proyectos.

<p style="text-align: justify;"> Es esencial considerar las interacciones indirectas, ya que el comportamiento de los objetos puede repercutir en otros objetos vinculados. 

**Pregunta 5**

La diferencia entre una prueba unitaria y otros tipos de pruebas es la siguiente:

<p style="text-align: justify;">Pruebas unitarias: Se centran en probar unidades individuales de código, como métodos o funciones, de manera aislada del resto del sistema. 
Las pruebas unitarias suelen ser rápidas, sencillas y fáciles de mantener.

<p style="text-align: justify;">Pruebas de integración: Verifican la correcta comunicación y cooperación entre diferentes módulos del sistema. 
Las pruebas de integración pueden ser más complejas y lentas que las pruebas unitarias, ya que involucran a varios componentes y pueden requerir infraestructura adicional,  como bases de datos o servicios web.

<p style="text-align: justify;">Pruebas de aceptación: Son pruebas funcionales que se realizan desde la perspectiva del usuario final para verificar que el 
sistema se comporte como se espera.