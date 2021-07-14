package agenda;

public class Main {

	public static void main(String[] args)
	{
		Usuario rafael = new Usuario();
		rafael.cadastro("Rafael", "1234", "email");
		System.out.println("Nome: " + rafael.getNome() + "Senha: " + rafael.getSenha() + "Email: " + rafael.getEmail());
		
	}
}
