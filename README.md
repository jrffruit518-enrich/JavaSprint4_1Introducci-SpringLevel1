# Tasca S4.01 Spring Boot - Nivel 1: Primer REST API

## Descripción - Enunciado del ejercicio
Este proyecto consiste en una introducción práctica a Spring Boot mediante la creación de un servicio REST básico.  
El objetivo principal es configurar un entorno de desarrollo funcional y desplegar un endpoint de **Health Check** (verificación de estado) que responda con un objeto estructurado en formato JSON.

El sistema permite:

- **Configuración de puerto:** El servidor se ejecuta en el puerto específico 9000.
- **Endpoint GET /health:** Un punto de entrada que devuelve el estado del sistema.
- **Respuesta Estructurada:** Uso de Java Records para devolver JSON: `{"status": "OK"}`.
- **Pruebas Automatizadas:** Verificación de la capa web sin necesidad de iniciar el servidor completo.
- **Generación de artefacto:** Empaquetado en un archivo `.jar` ejecutable e independiente.

El ejercicio demuestra:

- Uso de anotaciones de Spring (`@RestController`, `@GetMapping`, `@WebMvcTest`).
- Configuración de propiedades del servidor (`application.properties`).
- Implementación de pruebas unitarias con MockMvc.
- Flujo de trabajo con Maven para compilación y despliegue.

---

## Tecnologías Utilizadas

- Java 17+ (Soporte para Records)
- Spring Boot 3.x
- Maven (Gestión de dependencias y build)
- JUnit 5 & MockMvc (Testing)

---

## Requisitos

- Tener instalado **Java JDK 17 o superior**
- Maven instalado o uso del **Maven Wrapper** incluido
- Un IDE o terminal para compilar y ejecutar Java

---

## Estructura del Proyecto

sprint4Tasca_S401Nivel1/
├── controllers/
│ └── HealthController.java → Controlador REST con el endpoint /health
├── response/
│ └── HealthStatusResponse.java → Record Java para la respuesta JSON
├── JavaSprint41Application.java → Punto de entrada (Spring Boot App)
└── src/test/.../
└── HealthControllerTest.java → Test de integración de la capa Web

yaml
Copiar código

---

## Instalación

Clona o descarga el proyecto:

```
git clone https://github.com/tu-usuario/JavaSprint4_1IntroduccioSpring.git
cd JavaSprint4_1IntroduccioSpring
```
Abre en tu IDE o usa la terminal.

Ejecución
Opción 1: Desde terminal (Maven)

```
Copiar código
mvn spring-boot:run
```
Opción 2: En IDE

Ejecuta directamente la clase JavaSprint41IntroduccioSpringApplication.

Una vez iniciado, verifica el funcionamiento en:
http://localhost:9000/health

## Despliegue
Para generar el archivo ejecutable .jar:

```
Copiar código
mvn clean package
java -jar target/userapi-0.0.1-SNAPSHOT.jar
```
Implementación Destacada
Controlador REST
```
Copiar código
@RestController
public class HealthController {

    @GetMapping("/health")
    public HealthStatusResponse healthCheck() {
        return new HealthStatusResponse("OK");
    }
}
```
Test de Capa Web
```
Copiar código
@WebMvcTest(HealthController.class)
class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnOkStatus() throws Exception {
        mockMvc.perform(get("/health"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.status").value("OK"));
    }
}
```
Contribuciones
¡Bienvenidas! Sigue estos pasos:

Haz un fork

Crea una rama:

```
Copiar código
git checkout -b feature/nueva-funcionalidad
```
Realiza el commit (usando Conventional Commits):

```
Copiar código
git commit -m "feat: add user controller"
```
Push y Pull Request