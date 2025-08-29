package entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {

		Pf pf1 = new Pf("Lucas", "11498461949", 700);
		Pf pf2 = new Pf("João", "12345678910", 7000);
		Pf pf3 = new Pf("Maria", "12131415160", 10000);
		Pj pj1 = new Pj("Em", "10101020/0000-0", 75000);
		Pj pj2 = new Pj("google2", "44444555/4444-1", 1000);
		Pj pj3 = new Pj("amazonico", "147563847/1010-1", 40000);

		ArrayList<Contribuinte> lista = new ArrayList<>(Arrays.asList(pf1, pf2, pf3, pj1, pj2, pj3));

		for (Contribuinte p : lista) {
			 p.mostra();
		}

	}

}
