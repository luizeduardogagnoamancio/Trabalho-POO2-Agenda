package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	ArrayList<Evento> listaEvento;
	ArrayList<Rotina> listaRotina;
	
	public Agenda()
	{
		this.listaEvento = new ArrayList<Evento>();
		this.listaRotina = new ArrayList<Rotina>();
	}
	
	public void listarEventos()
	{
		for(Evento e : this.listaEvento)
		{
			System.out.println(e.getNome());
		}
	}
	
	public void listarRotinas()
	{
		for(Rotina r : this.listaRotina)
		{
			System.out.println(r.getNome());
		}
	}
	
	public void notificacao()
	{
		//supor que está ordenada
		System.out.println(this.listaEvento.get(0).getNome());
	}
	
	public List<Evento> getListaEvento() {
        return listaEvento;
    }

}
