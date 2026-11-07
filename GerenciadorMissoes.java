public abstract class GerenciadorMissoes {
    protected abstract Missao criarMissao();

    public void iniciarMissao() {
        Missao missao = criarMissao();
        missao.executar();
    }
}