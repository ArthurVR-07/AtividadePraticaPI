package school.sptech;

public abstract class SpecterIA {
    private int energia;
    private MemoriaDeCombate memoria; // composição: TEM UMA

    public SpecterIA(MemoriaDeCombate memoria) {
        this.energia = 100;
        this.memoria = memoria;
    }

    public abstract void executarTurno(); // abstração + gancho de polimorfismo

    public void receberDano(int valor) {
        if (valor < 0) return;
        energia = Math.max(0, energia - valor);
    }
}

public class AssassinSpecter extends SpecterIA {
    public AssassinSpecter(MemoriaDeCombate memoria) { super(memoria); }

    @Override
    public void executarTurno() {
        System.out.println("Assassin entra em stealth e explode o combo!");
    }
}
