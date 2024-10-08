public class Ejercicio10 {
    public static void main(String[] args) {
        try {
            int x = -2;
            if ( x < 0 )
                throw new Exception("ERROR: valor negativo en la coordenada X.");
            System.out.println("Coordenada X: " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
