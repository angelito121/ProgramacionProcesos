public class Contador {
    int valor=-1;

    public int getValor() {
        return valor;
    }

    public void incremento(int valor) {
        this.valor = ++valor;
    }
}
