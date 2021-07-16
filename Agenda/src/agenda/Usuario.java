package agenda;
import java.util.Scanner;


public class Usuario {
	private String nome;
	private String senha;
	private String email;
	
	
	
	public void cadastro()
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome: ");        
        this.nome = s.nextLine();
        System.out.print("Digite sua senha: "); 
        this.senha = s.nextLine();
        System.out.print("Digite seu email: "); 
        this.email = s.nextLine();
		
		
	}

	public void autenticacao()
	{
		String login, password;
		Scanner s = new Scanner(System.in);
        do
        {
        	System.out.print("Digite seu nome: ");
        	login = s.nextLine();
        	System.out.print("Digite seu senha: ");
        	password = s.nextLine();
        	if (!(login .equals(this.nome)))
            {
            	System.out.println("Login errado");
            	
            }if (!(password .equals(this.senha)))
            {
            	System.out.println("senha errado");
            	
            }
        }while(!(login .equals(this.nome) && (password .equals(this.senha))));
        System.out.println("Logado com sucesso!");
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
		
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	
	public String getSenha()
	{
		return senha;
		
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	
	
	
}
