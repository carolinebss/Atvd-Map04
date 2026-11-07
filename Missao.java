public abstract class Missao {
    public final void executar() {
        preparar();
        verificarEquipamentos();
        executarAcao();
        int recompensa = getRecompensa();
        System.out.println("Recompensa: " + recompensa);
        finalizar();
    }
    protected void preparar() {
        System.out.println("Preparando missão...");
    }
    protected void verificarEquipamentos() {
        System.out.println("Verificando equipamentos...");
    }
    protected void finalizar() {
        System.out.println("Missão finalizada!");
    }
    protected abstract void executarAcao();

    protected abstract int getRecompensa();
}