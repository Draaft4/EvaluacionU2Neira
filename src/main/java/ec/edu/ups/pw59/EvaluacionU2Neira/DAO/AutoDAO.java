package ec.edu.ups.pw59.EvaluacionU2Neira.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw59.EvaluacionU2Neira.modelo.Auto;

@Stateless
public class AutoDAO {
	
	@PersistenceContext
	EntityManager em;
	
	public void  create(String placa, String modelo,String marca)throws Exception {
		Auto auto = new Auto();
		auto.setMarca(marca);
		auto.setModelo(modelo);
		auto.setMarca(marca);
		em.persist(auto);
		System.out.println("INSERTANDO NUEVO AUTO");
		throw new Exception("Se ha ingresado correctamente");
	}
	
	public void update(Auto auto) throws Exception{
		em.merge(auto);
		System.out.println("EDITANDO AUTO");
		throw new Exception("Se ha editado correctamente");
	}
	
	public Auto read(int codigo) {
		System.out.println("OBTENIENDO AUTO");
		return em.find(Auto.class,codigo);
	}
	
	public void delete(int codigo) throws Exception{
		Auto auto = em.find(Auto.class, codigo);
		em.remove(auto);
		System.out.println("ELIMINANDO AUTO");
		throw new Exception("Se ha eliminado corretamente");
	}

}
