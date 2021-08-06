package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	/* Singleton */
	private static Agenda instance;

    ArrayList<Evento> listaEvento;
    ArrayList<Rotina> listaRotina;


    private Agenda() 
    {
        this.listaEvento = new ArrayList<Evento>();
        this.listaRotina = new ArrayList<Rotina>();
    }

    public synchronized static Agenda getInstance()
    {
        if(instance == null)
        {
            instance = new Agenda();
        }
        return instance;
    }
    /* Fim do Singleton*/
	public synchronized void listarEventos()
	{
		for(Evento e : this.listaEvento)
		{
			System.out.println(e.getNome());
		}
	}
	
	public synchronized void listarRotinas()
	{
		for(Rotina r : this.listaRotina)
		{
			System.out.println(r.getNome());
		}
	}
	
	
	public synchronized void notificacao()
	{
		 List<Evento> l;

	        l = this.getListaEvento();

	        for (Rotina listaRotina: this.getListaRotina()) 
	        {
	            l.addAll(listaRotina.getListaEventos());
	        }
	        System.out.println(l);
	        //Ordenacao por Data
	        l.sort((e1, e2) -> {
	            if (e1.getData().getAno() > e2.getData().getAno()) return 1;
	            else if(e1.getData().getAno() < e2.getData().getAno()) return -1;
	            else if(e1.getData().getMes() > e2.getData().getMes()) return 1;
	            else if(e1.getData().getMes() < e2.getData().getMes()) return -1;
	            else if(e1.getData().getDia() > e2.getData().getDia()) return 1;
	            else if(e1.getData().getDia() < e2.getData().getDia()) return -1;
	            else
	            {
	            	if (e1.getHora().getHora() > e2.getHora().getHora()) return 1;
		            else if(e1.getHora().getHora() < e2.getHora().getHora()) return -1;
		            else if(e1.getHora().getMinuto() > e2.getHora().getMinuto()) return 1;
		            else if(e1.getHora().getMinuto() < e2.getHora().getMinuto()) return -1;
		            else if(e1.getHora().getSegundo() > e2.getHora().getSegundo()) return 1;
		            else if(e1.getHora().getSegundo() < e2.getHora().getSegundo()) return -1;
		            return 0;
	            }
	       
	        });
	        
	        
	        
	        System.out.println(l);

	        System.out.println(l.get(0).getNome());
	}
	
	public List<Evento> getListaEvento() {
        return listaEvento;
    }
	public ArrayList<Rotina> getListaRotina() {
		return listaRotina;
	}

}
