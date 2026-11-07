public class MissaoExploracao extends Missao {
    @Override
    protected void executarAcao() {
        System.out.println("Explorando região desconhecida!");
    }
    @Override
    protected int getRecompensa() {
        return 50;
    }
}