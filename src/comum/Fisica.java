package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Fisica extends Pessoa implements Serializable {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Fisica() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 4067054987257995266L;

}
