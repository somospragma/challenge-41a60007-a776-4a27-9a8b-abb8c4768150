# Implementación de Microservicio de Gestión de Productos

Una empresa de comercio electrónico necesita un microservicio para gestionar productos en su plataforma. El sistema debe permitir el registro de productos con atributos como nombre, precio, stock y categoría. Además, debe manejar variables de entorno para configuración, logs para seguimiento y conexión a una base de datos para persistencia.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo de Microservicios |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de Productos

**Objetivo:** Implementar la funcionalidad para registrar productos con validaciones básicas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- El sistema debe registrar productos con nombre, precio, stock y categoría. No debe permitir precios negativos ni nombres duplicados.

**Entregable:** Microservicio funcional que permite registrar productos con las validaciones especificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar los datos para evitar duplicidades y manejar validaciones.

</details>

### Fase 2: Configuración y Logs

**Objetivo:** Integrar variables de entorno y logs en el microservicio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Configura el microservicio para leer variables de entorno y añadir logs para seguimiento de operaciones.

**Entregable:** Microservicio con variables de entorno y logs implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo manejar diferentes entornos (desarrollo, testing, producción) y en qué información es relevante para los logs.

</details>

### Fase 3: Conexión a Base de Datos

**Objetivo:** Conectar el microservicio a una base de datos usando JPA.

**Tiempo estimado:** 1-2 horas

**Instrucciones:**

- Implementa la conexión a una base de datos y utiliza JPA para persistir los productos registrados.

**Entregable:** Microservicio conectado a una base de datos con productos persistidos usando JPA.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo modelar la entidad de producto y cómo manejar las transacciones.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio y por qué se utiliza en este caso?
- **paraQueSirve**: ¿Para qué sirve la conexión a una base de datos en este microservicio?
- **comoSeUsa**: ¿Cómo se utilizan las variables de entorno en este microservicio?
- **erroresComunes**: ¿Qué errores comunes puedes encontrar al registrar productos y cómo los manejarías?
- **queDecisionesImplica**: ¿Qué decisiones implica la conexión a una base de datos y el uso de JPA?

## Criterios de Evaluacion

- Implementación de registro de productos con validaciones.
- Integración de variables de entorno y logs.
- Conexión a base de datos y persistencia de productos usando JPA.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
