public class MissaoCombate extends Missao {
    @Override
    protected void executarAcao() {
        System.out.println("Enfrentando inimigo!");
    }
    @Override
    protected int getRecompensa() {
        return 100;
    }
}