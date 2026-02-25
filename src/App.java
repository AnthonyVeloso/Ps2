import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // 🔹 Lista polimórfica de agentes
        List<AgenteIA> orquestrador = new ArrayList<>();

        // 🔹 Adicionando agentes diferentes
        orquestrador.add(new AgenteTexto("ChatGPT"));
        orquestrador.add(new AgenteImagem("DALL-E"));

        String comando = "Explique orientação a objetos";

        processarFila(orquestrador, comando);
    }

    // 🔹 Método solicitado no exercício
    public static void processarFila(List<AgenteIA> lista, String comando) {

        for (AgenteIA agente : lista) {
            try {

                System.out.println("\n➡ Enviando comando para: " + agente.nome);
                agente.processarRequisicao(comando);

            } catch (Exception e) {

                String horario = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                System.err.println(
                        "[LOG-AGENTE] [" + horario + "] Erro no agente ["
                                + agente.nome + "]: " + e.getMessage()
                );
            }
        }
    }
}