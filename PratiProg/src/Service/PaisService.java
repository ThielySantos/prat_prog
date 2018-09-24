package Service;
import DAO.PaisDAO;
import Model.Pais;

public class PaisService {

		PaisDAO dao = new PaisDAO();
		
		public void criar(Pais pais)  {
			dao.criar(pais);
		}
		
		public void atualizar (Pais pais) {
			dao.atualizar(pais);
		}
		
		public void excluir(int id) {
			dao.excluir(id);
		}
		
		public Pais carregar(int id) {
			return dao.carregar(id);
		}
		

}
