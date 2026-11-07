public class GerenciadorMissoesCombate extends GerenciadorMissoes {
    @Override
    protected MissaoCombate criarMissao() {
        return new MissaoCombate();
    }
}