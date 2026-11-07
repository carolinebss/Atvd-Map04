public class GerenciadorMissoesResgate extends GerenciadorMissoes {
    @Override
    protected Missao criarMissao() {
        return new MissaoResgate();
    }
}