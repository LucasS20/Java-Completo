import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement st = null;
        try {
            Connection conexao = DB.getConexao();
            st = conexao.prepareStatement(
                    "insert into seller (name,email,birthdate,basesalary,departmentid) values (?,?,?,?,?)"
            );
            st.setString(1, "Joao");
            st.setString(2, "Joao@gmail.com");
            st.setDate(3, new java.sql.Date(formatador.parse("22/04/1985").getTime()));
            st.setDouble(4, 300.00);
            st.setInt(5, 4);
            var linhas = st.executeUpdate();
            System.out.println(linhas);
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            DB.fecharStatent(st);
            DB.fechaConexao();
        }
    }
}

