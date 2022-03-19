
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class ContaDAO {

    public void adicionarConta(Conta conta){
        conexao contas = new conexao();
        PreparedStatement stmt = null;
        Connection conexao = null;

        try {
            conexao = contas.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CONTA(agencia, numero, saldo, cliente) VALUES(1,1,1,?)");
            stmt.setInt(1, conta.getAgencia());
            stmt.setInt(2, conta.getNumero());
            stmt.setDouble(3, conta.getSaldo());



            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            contas.close(stmt, conexao);
        }
    }

    public List<Conta> listarConta() {
        List<Conta> listaContas = new LinkedList<>();

        conexao postgres = new conexao();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CONTA ORDER BY AGENCIA");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Conta conta = new Conta(rs.getInt("agencia"), rs.getInt("numero"), rs.getDouble("saldo"),
                        rs.getString("cliente")) {
                    @Override
                    public void imprimirExtrato() {

                    }

                    @Override
                    public void calcularRendimneto() {

                    }
                };

                listaContas.add(conta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return listaContas;
    }



}