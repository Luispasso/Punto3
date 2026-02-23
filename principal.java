import java.util.Scanner;
public class principal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        datos [][] m = new datos[2][2];
        metodos met = new metodos();
        int opc;

        while (true) 
        {
            System.out.println("ELIJA LA OPCION DE SU PREFERENCIA");
            System.out.println("1. REGISTRAR LOS LIBROS");
            System.out.println("2. BUSCAR LIBRO DE MAYOR PRECIO");
            System.out.println("3. SALIR");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                      m = met.registro(m);
                    break;
                case 2:
                      met.buscar(m);
                    break;
                default:
                    break;
            }
           if(opc == 3)
              break;
        }
    }
}
