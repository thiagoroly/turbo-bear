package Pucrs.Apro2;

public class AppTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acidentes<String> a = new Acidentes<String>();

		a.leArquivo();
		a.gravador();
		a.gravadorData();
		
//		int seg = a.contador(3, "SEGUNDA-FEIRA");
//		int ter = a.contador(3, "TERCA-FEIRA");
//		int qua = a.contador(3, "QUARTA-FEIRA");
//		int qui = a.contador(3, "QUINTA-FEIRA");
//		int sex = a.contador(3, "SEXTA-FEIRA");
//		int sab = a.contador(3, "SABADO");
//		int dom = a.contador(3, "DOMINGO");
//		int total = seg + ter + qua + qui + sex + sab + dom;
//		System.out.println("TOTAL - "+ total + "\nSEG-" + seg + "\nTER-" + ter + "\nQUA-" + qua + "\nQUI-" + qui + "\nSEX-" + sex + "\nSAB-" + sab + "\nDOM-" + dom);
		System.out.println(a.size());
		// Leitor l = new Leitor();

		// System.out.println(a.size());
		// System.out.println(p.getE(0));

	}

}
