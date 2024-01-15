public class Hilo implements Runnable {

    Contador contador;
    private int veces;
    private int numHilo;

    public Hilo(Contador contador, int veces, int numHilo) {
        this.contador = contador;
        this.veces = veces;
        this.numHilo = numHilo;
    }

    public Contador getContador() {
        return contador;
    }


    @Override
    public void run() {
        for(int i =0;i<=veces;i++){
            contador.incremento(contador.getValor());
        }
        System.out.println(contador.getValor());
    }
}
