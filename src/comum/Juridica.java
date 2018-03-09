package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Juridica extends Pessoa implements Serializable{
	 
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Juridica() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = -688867009663670045L;

}
