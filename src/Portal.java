import java.util.ArrayList;

public class Portal {

	private String nazwa;
	private ArrayList<String> polePolozenia;
	
	public void setNazwa(String nazwa){
		this.nazwa = nazwa;
	}
	
	public void setPolePolozenia(ArrayList<String> polePolozenia){
		this.polePolozenia = polePolozenia;
	}
	
	
	public String sprawdz(String ruch){
		String wynik = "pudło";

	    int indeks = polePolozenia.indexOf(ruch);
	    
	    if (indeks >= 0) {
	    
	    	polePolozenia.remove(indeks);
	      
	      if (polePolozenia.isEmpty()) {
	        wynik = "zatopiony";
	      } else {
	        wynik = "trafiony";
	      } // koniec if
	      
	    } // koniec if
	    
	    return wynik;
	 
	} // koniec metody
	
}
