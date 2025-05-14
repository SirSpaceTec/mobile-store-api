# Mobile Store - Backend

Backend de la tienda de móviles hecho con **Java 17**, **Spring Boot 3**, arquitectura hexagonal y base de datos **H2** embebida.

## Endpoints

- `GET /api/product` → Lista todos los productos.
- `GET /api/product/{id}` → Obtiene un producto por ID.
- `POST /api/cart` → Añade un producto al carrito.
- `GET /api/cart` → Obtiene el carrito actual.
- `DELETE /api/cart` → Elimina todo el carrito.
- `DELETE /api/cart/one` → Elimina solo una unidad del producto (último añadido).

## Requisitos previos

- Java 17
- Maven 3.8+

## Ejecución

```bash
mvn spring-boot:run
```

Accede a la consola H2 en: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
**URL JDBC:** `jdbc:h2:file:./data/mobile_store`

## Arquitectura utilizada

- Puertos y adaptadores (Hexagonal)
- Controladores REST en `adapter.in.rest`
- Persistencia en memoria + mock (`data.sql`)

## Notas

- Las imágenes se sirven desde `static/phones`
- Configuración CORS habilitada para `http://localhost:5173`