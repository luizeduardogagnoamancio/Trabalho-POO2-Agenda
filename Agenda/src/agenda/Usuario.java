package agenda;
import java.io.*;

import agenda.files.WriteFile;

public class Usuario {
	private String nome;
	private String senha;
	private String email;
	
	
	
	public void cadastro(String nome, String senha, String email)
	{
		setNome(nome);
		setSenha(senha);
		setEmail(email);
		
		escreveArquivo(nome);
		escreveArquivo(senha);
		escreveArquivo(email);
		
	}
	
	public void autenticacao()
	{
		
	}
	
	public void escreveArquivo(String palavra)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\BSI\\SextoPeriodo\\DOO\\Trabalho-POO2-Agenda\\cadastro.txt",true));
			bw.write(palavra+"\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
