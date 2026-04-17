package serialize;

import java.io.*;

public class ExemploSerializacao {
	public static void main(String[] args) {
		Jogador player1 = new Jogador("Arthur", 50, "segredo123");
		String nomeArquivo = "jogador.ser";

		// --- SERIALIZAÇÃO (Gravando o objeto) ---
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
			out.writeObject(player1);
			System.out.println("Objeto serializado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// --- DESSERIALIZAÇÃO (Lendo o objeto) ---
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
			Jogador playerRecuperado = (Jogador) in.readObject();
			System.out.println("Objeto recuperado do arquivo:");
			System.out.println(playerRecuperado);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
