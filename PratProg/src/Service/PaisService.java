package Service;
import java.util.ArrayList;

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
		
		public PaisService(){
			dao = new PaisDAO();
		}
		public ArrayList<Pais> listarPais(){
			return dao.listarPais();
		}
		public ArrayList<Pais> listarPais(String chave){
			return dao.listarPais(chave);
		}





}
