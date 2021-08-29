package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotina extends Template implements Cloneable, PadraoComandoCriar{
    private String nome;
    private List<Evento> listaEventos;
    
    public Rotina() 
    {
        this.listaEventos = new ArrayList<Evento>();
        this.criar();
    }
    
    public void criar() {
    	Scanner s = new Scanner(System.in);
        String op;
        
        System.out.println("Digite o nome da Rotina");
        this.nome = s.nextLine();
        
        
        System.out.print("Deseja adicionar um evento? ('s')");
        do {
            
            op = s.next();
            switch (op) {
                case "s": {
                    this.getListaEventos().add(new Evento());
                    System.out.println("Deseja cadastrar um novo evento? ('s')");
                    break;
                }
                default:
                    System.out.println("Rotina Criada.");
                }
        }while(op.equals("s"));
		
	}
    
    
    public void editar()
    {
        Scanner s = new Scanner(System.in);
        String op;
        int cont = 0;
        
        System.out.print("Digite o novo nome da Rotina: ");
        this.nome = s.nextLine();
        
        do {
            System.out.println("Deseja Alterar este evento: ('s')" );
            System.out.println(this.getListaEventos().get(cont).getNome());
            System.out.println("Dia: "+this.getListaEventos().get(cont).getData().getDia()+ "/" + 
            this.getListaEventos().get(cont).getData().getMes()+"/" +this.getListaEventos().get(cont).getData().getAno());
            System.out.println("Hora: " + this.getListaEventos().get(cont).getHora().getHora()+ ":" +this.getListaEventos().get(cont).getHora().getMinuto() +
                    ":"+ this.getListaEventos().get(cont).getHora().getSegundo());
            
            op = s.next();
            switch (op) {
                case "s": {
                    this.getListaEventos().get(cont).editar();
                    cont++;
                    break;
                }
                default:
                    cont++;
                }
        }while(cont< this.getListaEventos().size());    
        
        System.out.println("Rotina Editada");
         
    }
    
    public List<Rotina> deletar(List<Rotina> listaRotinas, int posicao)
    {
        listaRotinas.get(posicao).getListaEventos().clear();
        listaRotinas.remove(posicao);
        System.out.println("Rotina Deletada");
        return listaRotinas;    
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Object clone()
    {
    	Rotina obj = null;
    	try {
    		obj = (Rotina)super.clone();
    	}catch (CloneNotSupportedException ex)
    	{
    		ex.printStackTrace();
    	}
    	return obj;
    }

	
	
	
    
    
}