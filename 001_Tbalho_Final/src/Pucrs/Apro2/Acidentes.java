package Pucrs.Apro2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Acidentes<E> implements ListaTAD<E> {

	private Node<E> headStret;
	private Node<E> tailStret;
	private Node<E> headDate;
	private Node<E> tailDate;
	private int count;

	public Acidentes() {
	}

	@SuppressWarnings("unchecked")
	public void leArquivo() {
		Path path = Paths.get("acidentes.csv");
		try (Scanner sc = new Scanner(Files.newBufferedReader(path,
				Charset.defaultCharset()))) {
			sc.useDelimiter("[;\n]");
			int i = 0;
			@SuppressWarnings("unused")
			String linha = sc.nextLine();

			while (i < 20000) { // TODO para agilizar os teste do código
				// while(sc.hasNext()){
				E[] listaA = (E[]) new Object[21];
				for (int j = 0; j < 20; j++) {
					if (j == 0) {
						String s = sc.next();
						int a = s.indexOf(" ");
						if (a > 0) {
							// TODO falta tratar esta exeção
							listaA[20] = (E) s.subSequence(0, a);
							listaA[0] = (E) s.subSequence(a + 1, s.length());
						} else {
							listaA[20] = (E) "AV";
							listaA[0] = (E) "ZZ_AVENIDA OU RUA SEM NOME";
						}
					} else {
						listaA[j] = (E) sc.next();
					}
				}
				i++;
				add((E) listaA);

			}
		} catch (IOException x) {
			System.err.println("Arquivo não existe");
		}
	}

	@SuppressWarnings("hiding")
	private class Node<E> {

		public E[] lista;
		public E stret;
		public E dataHora;

		public Node<E> prevStret;
		public Node<E> prevDate;
		public Node<E> nextStret;
		public Node<E> nextDate;

		@SuppressWarnings({ "unchecked" })
		public Node(E e) {

			lista = (E[]) e;
			stret = (E) lista[0];
			dataHora = (E) lista[2];

			prevStret = null;
			nextStret = null;
			prevDate = null;
			nextDate = null;
		}

		public E getStret() {
			return stret;

		}

		public E getDataHora() {
			return dataHora;
		}

		// TODO fazer um toString();
	}

	public void gravador() {
		Path paths1 = Paths.get("dados.csv");
		try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(paths1,
				Charset.defaultCharset()))) {
			Node<E> aux = headStret;
			for (int i = 0; i < count - 1; i++) {
				w.format(
						"%s %s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s",
						aux.lista[20], aux.lista[0], aux.lista[1],
						aux.lista[2], aux.lista[3], aux.lista[4], aux.lista[5],
						aux.lista[6], aux.lista[7], aux.lista[8], aux.lista[9],
						aux.lista[10], aux.lista[11], aux.lista[12],
						aux.lista[13], aux.lista[14], aux.lista[15],
						aux.lista[16], aux.lista[17], aux.lista[18],
						aux.lista[19]);
				aux = aux.nextStret;
			}

		} catch (IOException x) {
			System.err.format("Erro de E/S: %s%n", x);
		}

	}

	public void gravadorData() {
		Path paths1 = Paths.get("dadosData.csv");
		try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(paths1,
				Charset.defaultCharset()))) {
			Node<E> aux = headDate;
			for (int i = 0; i < count; i++) {
				w.format(
						"%s %s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s",
						aux.lista[20], aux.lista[0], aux.lista[1],
						aux.lista[2], aux.lista[3], aux.lista[4], aux.lista[5],
						aux.lista[6], aux.lista[7], aux.lista[8], aux.lista[9],
						aux.lista[10], aux.lista[11], aux.lista[12],
						aux.lista[13], aux.lista[14], aux.lista[15],
						aux.lista[16], aux.lista[17], aux.lista[18],
						aux.lista[19]);
				aux = aux.nextDate;
			}

		} catch (IOException x) {
			System.err.format("Erro de E/S: %s%n", x);
		}

	}

	
	@Override
	public void add(E e) {
		// TODO
		Node<E> newNode = new Node<E>(e);
		if (count == 0) {
			headStret = newNode;
			tailStret = newNode;
			headDate = newNode;
			tailDate = newNode;
			count++;
		} else {
			count++;
			// #######STRET######################################
			Node<E> aux = headStret;
			for (int i = 1; i <= count; i++) {
				if (i != count) {
					String auxst = (String) aux.getStret();
					int k = auxst.compareTo((String) newNode.getStret());
					if (k > 0) {
						newNode.nextStret = aux;
						newNode.prevStret = aux.prevStret;
						aux.prevStret = newNode;
						if (i == 1) {
							headStret = newNode;
						} else {
							aux = newNode.prevStret;
							aux.nextStret = newNode;
						}
						i = count;
					} else {
						aux = aux.nextStret;
					}
				} else {
					tailStret.nextStret = newNode;
					newNode.prevStret = tailStret;
					tailStret = newNode;
				}
			}
			// #######DATE######################################
			aux = tailDate;
			for (int i = 1; i <= count; i++) {
				if (i != count) {
					String auxdt = (String) aux.getDataHora();
					int k = auxdt.compareTo((String) newNode.getDataHora());
					if (k < 0) {
						newNode.prevDate = aux;
						newNode.nextDate = aux.nextDate;
						aux.nextDate = newNode;
						if (i == 1) {
							tailDate = newNode;
						} else {
							aux = newNode.nextDate;
							aux.prevDate = newNode;
						}
						i = count;
					} else {
						aux = aux.prevDate;
					}
				} else {
					headDate.prevDate = newNode;
					newNode.nextDate = headDate;
					headDate = newNode;
				}
			}

			// #########################################
		}

	}

	@Override
	public boolean remove(E e) {
		// TODO Nestre Caso, vai apenas retot
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	public int contador(int coluna) {
		int conta = 0;
		Node<E> aux = headStret;
		while (aux != null) {
			// TODO tratar a excessão caso a string não seja outra coisa se não
			// um numero.
			int b = Integer.parseInt((String) aux.lista[coluna]);
			conta = conta + b;
			aux = aux.nextStret;
		}
		return conta;
	}

	public int contador(int coluna, String s) {
		int conta = 0;
		Node<E> aux = headStret;
		while (aux != null) {
			if (aux.lista[coluna].equals(s))
				conta++;

			aux = aux.nextStret;
		}
		return conta;
	}

	public int contador(String s) {
		int conta = 0;
		Node<E> aux = headStret;
		while (aux != null) {
			String sList = (String) aux.lista[19];
			if (sList.substring(0, 2).equals(s))
				conta++;

			aux = aux.nextStret;
		}
		return conta;
	}

	@Override
	public String toString() {
		if (count == 0)
			return "[]";

		Node<E> n = headStret;

		StringBuffer sb = new StringBuffer();
		sb.append("[");

		for (int i = 0; i < count - 1; i++) {

			sb.append(n.getStret() + ",");
			n = n.nextStret;
		}
		sb.append(n.getStret());
		sb.append("]");

		return sb.toString();
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int index, E element) {
		// TODO Auto-generated method stub

	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean containsAv (String si) {
		Node<E> aux = headStret;
		for (int i = 1; i <= count; i++) {
			String se = (String) aux.lista[0];
			if (si.equalsIgnoreCase(se))
				return true;
			aux = aux.nextStret;
		}

		return false;
	}

	public String dataini() {
		String s = (String) headDate.lista[2];
		s = s.substring(6, 8) + "/" + s.substring(4, 6) + "/"
				+ s.subSequence(0, 4);
		return s;
	}

	public String dataFim() {
		String s = (String) tailDate.lista[2];
		s = s.substring(6, 8) + "/" + s.substring(4, 6) + "/"
				+ s.subSequence(0, 4);
		return s;
	}
	
	public void setCorrigeData(){
		Node<E> aux = headDate;
		for (int i = 0; i<count;i++){
			String s = (String) aux.lista[2];
			if (s.length()<12){
				aux.lista[2] = (E) (s + " 00:00");
				aux.lista[18] = (E) "NOITE";
				System.out.println(s);
				//teste de commit
			}
			aux = aux.nextDate;
			
			
		}
		
		
	}
	
	public String horaMaisAcidentes(){
		Node aux = headDate;
		//cria uma lista de 24 inteiros e coloca zero em todos os elementos dela.

		int [] horas = new int[24];
		for(int i=0; i<24; i++){
		horas[i]=0;
		}

		    // esse FOR percorre toda a lista
		    // ele pega a String da data e hora
		    // e faz e retiara apenas o inteiro da hora
		    // esse inteiro ele apenas soma um na posição da hora

		    for (int i = 0;i < count; i++ ){
		        String s = (String) aux.lista[2];
		        // aqui tive que ser obrigado a utilizar o TRY, por conta de erros na formatação da linha.
		        try{
		        int h = Integer.parseInt(s.substring(9, 11));   
		        horas[h] = horas[h] + 1;
		        }
		        catch(Exception e){
		            //System.out.println("erro na formatação da linha " + i );
		        }
		        aux=aux.nextDate;
		    }

		    // nessa parte ele verifica qual a hora com maior numero de acidentes.
		    String j = "00h";
		    int x = horas[0];
		    System.out.println(x + " 0h");
		    for(int i=1; i<24; i++){
		        if(horas[i] > x){
		            if(i <10) j = "0" + i + "h";
		            j = i + "h";
		            x = horas[i];
		        }else if(horas[i]==x){
		            if(i <10) j = j + " 0" + i + "h";
		            j = j + " " + i + "h";
		        }

		    }


		    return j;
		}
		// método que retorna uma String com o dia que tiveram mais acidente no Arquivo.
		public String diaMaisAcidentes() {

		    Node<E> aux = headDate;
		    int contaMaior = 0;
		    int contaMenor = 0;
		    String j = "";
		    String s;
		    String s2;
		    String su = "";
		    String su2 = "";

		    for (int i = 0; i < count; i++) {

		        contaMenor++;
		        try {
		            s = (String) aux.lista[2];
		            su = s.substring(0, 8);
		            s2 = (String) aux.nextDate.lista[2];
		            su2 = s2.substring(0, 8);
		        } catch (Exception e) {
		            // ultimo elemento da lista.
		        }
		        if (!su.equals(su2)) {

		            if (contaMenor > contaMaior) {
		                contaMaior = contaMenor;
		                j = su;
		            } else if (contaMenor == contaMaior) {
		                j = j + "\n" + su;
		            }
		            contaMenor = 0;
		        }
		        aux = aux.nextDate;
		    }
		    return j + " Com " + contaMaior + " Acidentes";
		}
	

}
