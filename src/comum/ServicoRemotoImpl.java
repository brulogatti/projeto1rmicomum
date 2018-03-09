package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {

	private static List<Fisica> lstPessoaf = new ArrayList<>();

	private static List<Juridica> lstPessoaj = new ArrayList<>();

	public ServicoRemotoImpl() throws RemoteException {
	}

	private static final long serialVersionUID = -7076405149636335182L;

	@Override
	public void inserirf(Fisica f) throws RemoteException {
		lstPessoaf.add(f);
	}

	@Override
	public void inserirj(Juridica j) throws RemoteException {
		lstPessoaj.add(j);
	}

	@Override
	public List<Fisica> listarPessoaf() throws RemoteException {
		return lstPessoaf;
	}

	@Override
	public List<Juridica> listarPessoaj() throws RemoteException {
		return lstPessoaj;
	}

	public double calcularsalario(Pessoa j) throws RemoteException {
		int idade = j.getIdade();
		double aumento = 0;
		double salario = j.getSalario();
		if (idade <= 20) {
			aumento = 1.1 * salario;
		}
		if (idade > 20 && idade <= 30) {
			aumento = 1.15 * salario;
		}
		if (idade > 30) {
			aumento = 1.2 * salario;
		}
		return aumento;
	}

	@Override
	public void imprimirf(Fisica f) throws RemoteException {
		System.out.println("CPF: " + f.getCpf());
		System.out.println("ID: " + f.getId());
		System.out.println("Nome: " + f.getNome());
		System.out.println("Telefone: " + f.getTelefone());
		System.out.println("Endereco: " + f.getEndereco());
		System.out.println("Cidade: " + f.getCidade());
		System.out.println("Estado: " + f.getEstado());
		System.out.println("Idade: " + f.getIdade());
		System.out.println("Nome da Mãe: " + f.getMae());
		System.out.println("Nome do Pai: " + f.getPai());
		System.out.println("Salario: R$" + String.format("%1$.2f", f.getSalario()));
		System.out.println("Aumento: R$" + String.format("%1$.2f", f.getAumento()));
		System.out.println("\n");
	}

	@Override
	public void imprimirj(Juridica j) throws RemoteException {
		System.out.println("CNPJ: " + j.getCnpj());
		System.out.println("ID: " + j.getId());
		System.out.println("Nome: " + j.getNome());
		System.out.println("Telefone: " + j.getTelefone());
		System.out.println("Endereco: " + j.getEndereco());
		System.out.println("Cidade: " + j.getCidade());
		System.out.println("Estado: " + j.getEstado());
		System.out.println("Idade: " + j.getIdade());
		System.out.println("Nome da Mãe: " + j.getMae());
		System.out.println("Nome do Pai: " + j.getPai());
		System.out.println("Salario: R$" + String.format("%1$.2f", j.getSalario()));
		System.out.println("Aumento: R$" + String.format("%1$.2f", j.getAumento()));
		System.out.println("\n");
	}
}



		
	

