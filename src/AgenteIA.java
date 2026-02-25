

public abstract class AgenteIA {

    protected String nome;
    protected String status;

    public AgenteIA(String nome){
        this.nome=nome;
    }


    public abstract void processarRequisicao(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;


    public void conectarServidor()throws ErroComunicacaoIAException{
        if (Math.random() > 0.7) { // 30% de chance de falha
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
        System.out.println("Servidor conectado");

    }

    /*public void processarPrompt(String prompt)
            throws FalhaProcessamentoAgenteException,
            PromptInadequadoException,
            ErroComunicacaoIAException {

        verificarSeguranca(prompt);
        chamarModeloExterno();

        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }

        System.out.println("Agente processando: " + prompt);
    }


    public void verificarSeguranca(String prompt)
            throws PromptInadequadoException {

        String p = prompt.toLowerCase();

        if (p.contains("hackear") || p.contains("roubar")) {
            throw new PromptInadequadoException(
                    "Esse prompt é considerado inadequado, tente outro!"
            );
        }
    }

    public void chamarModeloExterno() throws ErroComunicacaoIAException {
        double random = Math.random();
        if (random > 0.7){
            throw new ErroComunicacaoIAException("Falha de conexão, o tempo foi excedido!");
            }
        }
    // Método auxiliar de segurança (Exercício 1)
    public void verificarSeguranca(String prompt) throws PromptInadequadoException {
        String p = prompt.toLowerCase();
        if (p.contains("hackear") || p.contains("roubar")) {
            throw new PromptInadequadoException("Intenção maliciosa detectada pelo Safety Guard.");
        }
    }

    // Método de simulação de API (Exercício 2)
    private void chamarModeloExterno() throws ErroComunicacaoIAException {
        if (Math.random() > 0.7) { // 30% de chance de falha
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
    }

    public String getNome(){
        return this.nome;
    }*/
}
