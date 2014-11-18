package Pucrs.Apro2;

public interface ListaTAD<E>{
	
	  void add(E e);                   // insere e no final
	//  void add(int index, E element) // insere e em determinada posi��o (index)
	  E get(int index);                // obt�m elemento na posi��o index
	  int indexOf (E e);               // retorna a posi��o onde e est�
	  void set(int index, E element);  // altera o elemento na posi��o index
	  boolean remove(E e);             // remove o elemento e, se existir
	  E remove(int index);             // remove o elemento da posi��o index
	  boolean isEmpty();               // retorna true se o array est� vazio
	  int size();                      // retorna o total de elementos armazenados
	  boolean contains(E e);           // retorna true se e existe no array
	  void clear();                    // remove todos os elementos

}
