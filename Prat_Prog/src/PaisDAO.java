
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	
public class PaisDAO {

		public void incluir(Pais to) {
			String sqlInsert = "INSERT INTO pais(id, nome, populacao, area) VALUES (?, ?, ?)";
				try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
					stm.setInt(1, to.getId());
					stm.setString(2, to.getNome());
					stm.setLong(3, to.getPopulacao());
					stm.setDouble(3, to.getArea());
					stm.execute();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		public void atualizar(Pais to) {
			String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE id=?";
				try (Connection conn = ConnectionFactory.obtemConexao();
						PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
					stm.setString(1, to.getNome());
					stm.setLong(2, to.getPopulacao());
					stm.setDouble(3, to.getArea());
					stm.setInt(4, to.getId());
					stm.execute();
					} catch (Exception e) {
						e.printStackTrace();
						}
						}
	public void excluir(Pais to) {
			String sqlDelete = "DELETE FROM pais WHERE id = ?";
				try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
					stm.setInt(1, to.getId());
					stm.execute();
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
	public Pais carregar(int id) {
		Pais to = new Pais();
		String sqlSelect = "SELECT nome, populacao, area FROM pais WHERE pais.id = ?";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setInt(1, id);
					try (ResultSet rs = stm.executeQuery();) {
							if (rs.next()) {
								to.setNome(rs.getString("nome"));
								to.setPopulacao(rs.getLong("populacao"));
								to.setArea(rs.getDouble("area"));
							}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
					}
						return to;
	}
}