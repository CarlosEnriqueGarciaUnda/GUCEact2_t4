# Actividad 2: Spring MVC - Vistas con Thymeleaf, DTOs y Manejo de Peticiones

**Estudiante:** Carlos Enrique García Unda (GUCE)  
**Parte del Equipo:** 17  
**Repositorio:** GUCEact2_t4  

---

## 📌 Proyecto
Este proyecto implementa el patrón de arquitectura **Modelo-Vista-Controlador (MVC)** utilizando **Spring Boot** y **Thymeleaf** para el renderizado de vistas dinámicas del lado del servidor. También incluye clases **DTO** para la transferencia limpia de datos y controladores **REST** para la atención de peticiones JSON.

### Características implementadas:
* **Inyección de propiedades:** Lectura de variables desde `application.properties` con `@Value`.
* **Vistas Thymeleaf:** Renderizado de listas dinámicas con `th:each` y vinculación de formularios con `@ModelAttribute`.
* **Manejo de parámetros:** Filtrado de datos por URL mediante `@RequestParam` y consulta de recursos por ID mediante `@PathVariable`.
* **Endpoints REST:** Procesamiento de solicitudes HTTP POST con objetos JSON deserializados con `@RequestBody`.
* **Despliegue independiente:** Ejecutado en servidor VPS Azure en el puerto `8083` mediante `nohup`, coexistiendo de forma simultánea con la Actividad 1 (puerto `8081`).

---

## 📸 Evidencias de Funcionamiento

### 1. Vista de Listado (`th:each` y `@Value`)
*Muestra la lista de materias cargadas y la variable personalizada del autor leída desde `application.properties`.*

<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/e58aa4f5-d6d2-4aad-b991-55fc148e11fd" />

---

### 2. Formulario de Captura (`@ModelAttribute`)
*Formulario HTML vinculado al DTO para capturar e ingresar una nueva materia.*

*(Arrastra aquí la Foto 2: pantalla de /vistas/formulario)*

---

### 3. Filtro por Categoría (`@RequestParam`)
*Recepción y filtrado de datos pasados como parámetros en la consulta URL (`?cat=Programacion`).*

<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/bd3d9584-fd91-48d2-ac5c-288dec1cecd9" />


### Cambios

<img width="919" height="380" alt="image" src="https://github.com/user-attachments/assets/ed8c5ffb-3369-4245-9a18-020abc500de9" />

---

### 4. Consulta de Detalle (`@PathVariable`)
*Obtención y renderizado del detalle de un registro dinámico pasando el ID en la ruta.*

<img width="925" height="362" alt="image" src="https://github.com/user-attachments/assets/5df5a72b-70e5-470f-b3b6-06a3cb854859" />

---

### 5. Prueba de Endpoint POST (Postman)
*Envío de estructura JSON y recepción del objeto DTO procesado con ID generado.*
<img width="1366" height="766" alt="image" src="https://github.com/user-attachments/assets/b88851fe-e1dd-455b-bd9a-bea654beec7c" />
