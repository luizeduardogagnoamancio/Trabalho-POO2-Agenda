package agenda;

public class Main {

	public static void main(String[] args)
	{
		//Usuario rafael = new Usuario();
		//rafael.cadastro();
		//rafael.autenticacao();
		//System.out.println("Nome: " + rafael.getNome() + "Senha: " + rafael.getSenha() + "Email: " + rafael.getEmail());
		
		//Agenda agenda = new Agenda();
//		
		//Evento evento = new Evento();
		//Evento evento2 = new Evento();
//		
//		
//		//Criar uns 2 eventos e 2 rotinas com 2 eventos cada pra ver se la no final ele vai criar uma lista com 6 elementos e ordenar cerintho
//		
		//Rotina rotina = new Rotina();
		//Rotina rotina2 = new Rotina();
		//Rotina rotinaClone = (Rotina) rotina.clone();
		
		//agenda.listaEvento.add(evento);
		//agenda.listaEvento.add(evento2);
		
		//agenda.listaRotina.add(rotina);
		//agenda.listaRotina.add(rotina2);
		
		//agenda.notificacao();
		//System.out.println(rotinaClone.getNome());
		
		
//		agenda.getListaEvento().add(evento);
//		agenda.getListaEvento().add(evento2);
//		agenda.listarEventos();
		
		
		
		
		Agenda agenda = Agenda.getInstance();

        System.out.println(agenda.getListaEvento());
        System.out.println(agenda.getListaRotina());
        System.out.println();

        Evento evento = new Evento();
        
        
        Evento evento2 = new Evento();

        agenda.getListaEvento().add(evento);
        agenda.getListaEvento().add(evento2);

        Rotina rotina = new Rotina();
        Rotina rotina2 = new Rotina();

        agenda.getListaRotina().add(rotina);
        agenda.getListaRotina().add(rotina2);

        System.out.println(agenda.getListaEvento());
        System.out.println(agenda.getListaEvento().size());

        System.out.println();

        System.out.println(agenda.getListaRotina());
        System.out.println(agenda.getListaRotina().size());

        System.out.println();

        agenda.listarEventos();

        System.out.println();

        agenda.listarRotinas();

        System.out.println();

        agenda.notificacao();
//		
		
		
	}
}
