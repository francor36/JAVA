public class recursividad {

    public class void public static void main(String[] args) {

        System.out.println(aux);

    public static int func(int n) { // precondicion: n es un entero positivo
        int aux;
        if (n == 0)
            aux = 0;
        else
            aux = n + func(n - 1);
        return aux;
    }
}
}
