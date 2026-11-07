public class MissaoResgate extends Missao {S
    @Override
    protected void executarAcao() {
        System.out.println("Resgatando personagem!");
    }
    @Override
    protected int getRecompensa() {
        return 150;
    }
}