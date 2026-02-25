public class AgenteImagem extends AgenteIA {
    public AgenteImagem(String nome) {
        super(nome);

    }

    @Override
    public void processarRequisicao(String input)
            throws FalhaProcessamentoAgenteException,
            PromptInadequadoException,
            ErroComunicacaoIAException {

        String p = input.toLowerCase();

        if (p.contains("hackear") || p.contains("roubar") || p.contains("biométrico")) {
            throw new PromptInadequadoException(
                    "Esse prompt é considerado inadequado, tente outro!");
        }

        ModuloConexao.validarLink();

        super.conectarServidor();

        System.out.println("Agente de imagem [" + this.nome +
                "] sintetizando pixels para: [" + input + "]");
    }
}