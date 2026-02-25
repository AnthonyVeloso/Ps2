public class ModuloConexao {

    public static void validarLink() throws ErroComunicacaoIAException {

        double valor = Math.random();

        // 20% de chance de falha
        if (valor > 0.8) {
            throw new ErroComunicacaoIAException(
                    "Falha na comunicação com a GPU remota (Rede Instável)."
            );
        }

        System.out.println("Link com GPU validado com sucesso.");
    }
}
