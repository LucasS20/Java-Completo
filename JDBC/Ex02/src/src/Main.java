import db.DB;
import db.DbException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DB.getConexao();
            st = connection.createStatement();
            rs = st.executeQuery("select * from department");
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + rs.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.fecharResultSer(rs);
            DB.fecharStatent(st);
            DB.fechaConexao();
        }
    }
}

