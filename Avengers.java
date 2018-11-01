public class Avengers extends Movie{
	
	public String kekuatan;

	public Avengers(String namaAvengers, String kekuatan){
		super(namaAvengers);		
		this.kekuatan = kekuatan;
	}

	public Avengers(String namaAvengers){
		super(namaAvengers);
	}

	public void showKekuatan(){
		System.out.println(kekuatan);
	}

}