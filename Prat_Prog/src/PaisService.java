
	public class PaisService {
		
		PaisDAO dao;
		
		public PaisService() {
			dao = new PaisDAO();
		}
		public void criar(Pais to) {
			dao.incluir(to);
		}
		public void atualizar(Pais to) {
			dao.atualizar(to);
		}
		public void excluir(Pais to) {
			dao.excluir(to);
		}
		public Pais carregar(int id) {
			Pais to = dao.carregar(id);
				return to;
		}
}