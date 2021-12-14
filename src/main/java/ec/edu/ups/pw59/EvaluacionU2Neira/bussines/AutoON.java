package ec.edu.ups.pw59.EvaluacionU2Neira.bussines;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw59.EvaluacionU2Neira.DAO.AutoDAO;
import ec.edu.ups.pw59.EvaluacionU2Neira.modelo.Auto;

@Stateless
public class AutoON {
	
	@Inject
	private AutoDAO dao; 
	
	public void crearAuto(String placa,String modelo,String marca) throws Exception {
		dao.create(placa, modelo, marca);
	}
	
	public Auto obtenerAuto(int codigo) {
		return dao.read(codigo);
	}
	
	public void actualizarAuto(int codigo,String placa,String modelo,String marca) throws Exception {
		Auto auto = new Auto();
		auto.setCodigo(codigo);
		auto.setMarca(marca);
		auto.setModelo(modelo);
		auto.setPlaca(placa);
		dao.update(auto);
	}
	
	public void borrarAuto(int codigo) throws Exception{
		dao.delete(codigo);
	}
	
}
