package ec.edu.ups.pw59.EvaluacionU2Neira.bussines;

import javax.ejb.Remote;

import ec.edu.ups.pw59.EvaluacionU2Neira.modelo.Auto;
@Remote
public interface AutoONRemote {
	
public void crearAuto(String placa,String modelo,String marca) throws Exception;
	
	public Auto obtenerAuto(int codigo);
	
	public void actualizarAuto(int codigo,String placa,String modelo,String marca) throws Exception;
	
	public void borrarAuto(int codigo) throws Exception;

}
