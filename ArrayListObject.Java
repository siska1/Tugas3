import java.util.ArrayList;


public class ArrayListObject {

	
	public static void main(String[] args) {
		ArrayList<Mahasiswa> List = new ArrayList<Mahasiswa>();
		    List.add(new Mahasiswa("Siska","D0217004","Informatika A 2017","Bambalamotu"));
            List.add(new Mahasiswa("Shatdwika","D0217307","Informatika A 2017","Sendana"));
		    List.add(new Mahasiswa("Anti","D0217006","Informatika A 2017","Sendana"));
		    
		    for (int i = 0; i < List.size(); i++){
		    	System.out.println("Nama : " + List.get(i).getNama() + " || " + List.get(i).getNim() + " || " + List.get(i).getKelas() + " || " + List.get(i).getAlamat());
	       }

	   }
}

