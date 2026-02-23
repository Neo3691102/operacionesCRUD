# 📦 Conexión a MySQL con JDBC en Java

## 📌 Descripción

Este proyecto demuestra cómo establecer una conexión a una base de datos **MySQL** utilizando **JDBC (Java Database Connectivity)** en Java.

La aplicación realiza una consulta SQL a la tabla `tablaMotos` dentro de la base de datos `BDmodulo59` y muestra los resultados en consola.

Es un ejemplo básico orientado al aprendizaje del uso de:

- `DriverManager`
- `Connection`
- `Statement`
- `ResultSet`

---

## 🛠 Tecnologías Utilizadas

- ☕ Java
- 🗄 MySQL
- 🔌 JDBC
- 💻 IDE (IntelliJ / Eclipse / VS Code)

---

## 📂 Estructura del Proyecto

```
com.ebac.modulo59
│
├── Contexto.java
└── MysqlConnection.java
```

---

## 📖 Funcionamiento

### 🔹 Clase `MysqlConnection`

Se encarga de crear la conexión con la base de datos utilizando `DriverManager`.

```java
public Connection getConnection(String url, String user, String password) throws SQLException {
    return DriverManager.getConnection(url, user, password);
}
```

---

### 🔹 Clase `Contexto`

1. Define las credenciales de conexión.
2. Obtiene una conexión.
3. Ejecuta una consulta SQL.
4. Recorre el `ResultSet`.
5. Imprime los datos en consola.

Consulta ejecutada:

```sql
SELECT * FROM tablaMotos;
```

---

## 🗄 Configuración de Base de Datos

### Base de datos:

```
BDmodulo59
```

### Tabla utilizada:

```
tablaMotos
```

### Ejemplo de estructura de la tabla:

```sql
CREATE TABLE tablaMotos (
    idMoto INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    CC INT
);
```

---

## ▶️ Cómo Ejecutar

1. Tener MySQL instalado y en ejecución.
2. Crear la base de datos `BDmodulo59`.
3. Crear la tabla `tablaMotos`.
4. Insertar registros de prueba.
5. Configurar usuario y contraseña en el código:

```java
String user = "root";
String password = "root";
```

6. Ejecutar la clase `Contexto`.

---

## 📌 Ejemplo de Salida en Consola

```
idMoto: 1
marca: Yamaha
modelo: R6
Cilindraje: 600CC

idMoto: 2
marca: Honda
modelo: CBR
Cilindraje: 1000CC
```

---

## ⚠️ Buenas Prácticas Recomendadas

Para un entorno profesional se recomienda:

- Utilizar `try-with-resources` para cerrar conexiones automáticamente.
- Implementar el patrón **DAO**.
- Externalizar credenciales en un archivo de configuración.
- Manejar excepciones personalizadas.
- Utilizar un pool de conexiones (HikariCP).

---

## 🎯 Objetivo

Este proyecto tiene fines educativos y permite comprender:

- Conexión a bases de datos con JDBC.
- Ejecución de consultas SQL desde Java.
- Manejo de `ResultSet`.
- Separación básica de responsabilidades.
