package br.fucapi.workshop.app_news;

import java.util.ArrayList;
import java.util.List;

public class GeradorNoticia {

	public static List<Noticia> listNoticias(){
		
		List<Noticia> noticias = new ArrayList<Noticia>();
		
		Noticia noticia1 = new Noticia("Titulo 1", "http://www.ig.com.br");
		Noticia noticia2 = new Noticia("Titulo 2", "http://www.uol.com.br");
		
		noticias.add(noticia1);
		noticias.add(noticia2);
		
		return noticias;
	}
}
