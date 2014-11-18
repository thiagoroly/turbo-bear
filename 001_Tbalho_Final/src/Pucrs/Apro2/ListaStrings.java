package Pucrs.Apro2;

public class ListaStrings <E>{

	private  E[] lista;

	
	@SuppressWarnings("unchecked")
	public ListaStrings(E acidente) {
		this.lista = (E[]) new Object [20];
		addLista(acidente);
	}

	public void addLista(E e) {
		// TODO fazer o tratamento da string
		for (int i = 0; i < lista.length; i++) {
			lista[i] = e;
		}
	}

	public E getE(int index) {
		return lista[index];
	}

}
