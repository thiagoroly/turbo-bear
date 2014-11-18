package Pucrs.Apro2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Leitor<E> {

	private E[] lista;

	public Leitor() {
		this.lista = (E[]) new Object[20];
		leArquivo();
	}

	public void leArquivo() {
		Path path = Paths.get("acidentes.csv");
		try (Scanner sc = new Scanner(Files.newBufferedReader(path,
				Charset.defaultCharset()))) {
			sc.useDelimiter("[;\n]");
			int i = 0;
			@SuppressWarnings("unused")
			String linha = sc.nextLine();

			while (i < 20) {
				// while(sc.hasNext()){

				for (int j = 0; j < 20; j++) {
					lista[j] = (E) sc.next();

				}

				i++;
			}
		} catch (IOException x) {
			System.err.println("Arquivo não existe");
		}
		// System.out.println(nli);
	}

}
