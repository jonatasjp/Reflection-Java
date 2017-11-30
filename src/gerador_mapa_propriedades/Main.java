package gerador_mapa_propriedades;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jonatas", "Luis", 24);
		Map<String, Object> props = GeradorMapa.gerarMapa(pessoa);
		for (String prop : props.keySet()) {
			System.out.println(prop + " = " + props.get(prop));
		}
	}
}
