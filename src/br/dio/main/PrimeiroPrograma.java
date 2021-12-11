package br.dio.main;

import br.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Bichano", "preto", 2);
		System.out.println(gato.getNome());
		System.out.println(gato.getCor());
		System.out.println(gato.getIdade());
		System.out.println(gato);
	}

}
