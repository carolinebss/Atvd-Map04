public class Main {
    public static void main(String[] args) {
        GerenciadorMissoes combate = new GerenciadorMissoesCombate();
        GerenciadorMissoes exploracao = new GerenciadorMissoesExploracao();
        combate.iniciarMissao();
        exploracao.iniciarMissao();
        GerenciadorMissoes resgate = new GerenciadorMissoesResgate();
        resgate.iniciarMissao();
    }
}