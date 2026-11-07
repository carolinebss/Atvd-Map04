public class GerenciadorMissoesExploracao extends GerenciadorMissoes {
    @Override
    protected Missao criarMissao() {
        return new MissaoExploracao();
    }
}