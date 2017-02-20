import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.IllformedLocaleException;
import java.util.List;

public class PortalGraMax {

	private ArrayList<Portal> listaPortali = new ArrayList<Portal>();
	private PomocnikGry pomocnik = new PomocnikGry();
	private int iloscRuchow = 0;
		
	
	
	public void przygotujGre(){
		
		//ArrayList<Portal> listaPortali = new ArrayList<Portal>();
		Portal portal1 = new Portal();
		portal1.setNazwa("Onet.pl");
		Portal portal2 = new Portal();
		portal2.setNazwa("Wp.pl");
		Portal portal3 = new Portal();
		portal3.setNazwa("Allegro.pl");
		
		listaPortali.add(portal1);
		listaPortali.add(portal2);
		listaPortali.add(portal3);
		//for loop
		System.out.println("Zatop trzy portale : Onet, Wp i allegro. Jak najmniej ruchow.");
		for (Portal rozmieszczonyPortal: listaPortali){
			ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
			rozmieszczonyPortal.setPolePolozenia(nowePolozenie);
		}//loop ends
		
		
		
	}

	public void rozpocznijGre(){
		while(!listaPortali.isEmpty()){
			String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: ");
			sprawdzRuchGracza(ruchGracza);
		}
		zakonczGre();
	}
	
	
	public void sprawdzRuchGracza(String ruch){
		iloscRuchow++;
		String wynik = "pudlo";
		
		for(Portal portalDoSprawdzenia : listaPortali){
			wynik = portalDoSprawdzenia.sprawdz(ruch);
			if (wynik.equals("trafiony")){
				break;
			}
			
			if (wynik.equals("zatopiony")) {
				listaPortali.remove(portalDoSprawdzenia);
				break;
			}
		} //for ends here
		
		System.out.println(wynik);
				
	}
	
	public void zakonczGre(){
		System.out.println("Gra zostala zakonczona!");
		System.out.println("Wszystkie Portale zostały zatopione! Teraz Twoje informacje nie mają znaczenia.");
	    if (iloscRuchow <= 18) {
	      System.out.println("Wykonałeś jedynie " + iloscRuchow + " ruchów.");
	      System.out.println("Wydostałeś się, zanim Twoje informacje zatonęły.");
	    } else {
	      System.out.println("Ale się grzebałeś! Wykonałeś aż "+ iloscRuchow + " ruchów.");
	      System.out.println("Smieciu xD");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PortalGraMax gra = new PortalGraMax();
		 gra.przygotujGre();
		 gra.rozpocznijGre();
			
		}
	
}//end of the class
	
	
	
	

