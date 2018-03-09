package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {
	
	void inserirf(Fisica f) throws RemoteException;
	
	void inserirj(Juridica j) throws RemoteException;

	List<Fisica> listarPessoaf() throws RemoteException;
	
	List<Juridica> listarPessoaj() throws RemoteException;
	
	double calcularsalario(Pessoa j) throws RemoteException;
	
	void imprimirf(Fisica f) throws RemoteException;
	
	void imprimirj(Juridica j) throws RemoteException;
}
