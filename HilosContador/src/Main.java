public class Main {
     private static final int num_veces=5;
     private static final int num_hilos=5;
     public static void main(String[] args) {

         Contador contador=new Contador();


         for(int i=0;i<=num_hilos;++i){
             Hilo h= new Hilo(contador,num_veces,num_hilos);
             Thread hilo= new Thread(h);
             hilo.start();
             System.out.println("hilo numero: "+i);
         }


    }
}