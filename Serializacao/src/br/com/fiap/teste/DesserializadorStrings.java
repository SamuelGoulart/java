package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializadorStrings {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileStream = new FileInputStream("texto.ser");
		ObjectInputStream os = new ObjectInputStream(fileStream);

		String textoRecuperado = (String) os.readObject();
		System.out.println("Texto recuperado: " + textoRecuperado);

		os.close();
		fileStream.close();
	}
}