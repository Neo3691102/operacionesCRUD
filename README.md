
---

## 📖 Funcionamiento

### 🔹 Clase `MysqlConnection`

Se encarga de crear la conexión con la base de datos utilizando `DriverManager`.

```java
public Connection getConnection(String url, String user, String password) throws SQLException {
    return DriverManager.getConnection(url, user, password);
}
