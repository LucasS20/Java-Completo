package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class DB {
    private static Connection conexao = null;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conexao = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
        return conexao;
    }

    private static Properties loadProperties() {
        String path = "C:/Users/lucas/OneDrive/Área de Trabalho/Cursos/Java Completo/JDBC/Ex01/src/src/db/db.properties";
        try (FileInputStream fs = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void fechaConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void fecharStatent(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void fecharResultSer(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
