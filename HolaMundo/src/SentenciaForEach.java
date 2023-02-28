public class SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numbers= {1,2,3,5};
        for(int num: numbers){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Pedro", "Mario", "Sara", "Karen", "Jhon"};

        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
