package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri javada camelcase yazılır
		String ortaMetin ="İlginizi çekebilir";
		String altMetin ="Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade=1;
		
		double dolarDun = 10.14;
		double dolarBugun = 10.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu ="";
		
		if (dolarBugun<dolarDun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
		} 
		
	else if(dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);	
	}	
		else {
			okYonu ="equel.svg";
			System.out.println(okYonu);

		
	}

 }
}