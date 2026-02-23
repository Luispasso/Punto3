import java.util.Scanner;
public class metodos {
    public datos[][] registro(datos[][] m)
    {
         Scanner sc = new Scanner(System.in);
        int con = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                con++;
                datos o = new datos();
                
                System.out.println();
                System.out.println("INGRESE LA INFORMACION DEL " + con + "° LIBRO");
                System.out.println("INGRESE EL TITULO DEL LIBRO");
                o.setTitulo(sc.nextLine());
                System.out.println("INGRESE EL AUTOR DEL LIBRO");
                o.setAutor(sc.nextLine());
                System.out.println("INGRESE EL PRECIO DEL LIBRO");
                o.setPrecio(sc.nextDouble());
                sc.nextLine();
                m[i][j] = o;
            }
        }
        return m;
    }

    public static void buscar(datos[][] m)
    {
        datos mayor = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 1; j < m.length; j++) {
                if(mayor.getPrecio() < m[i][j].getPrecio())
                    mayor = m[i][j];
            }
        }

         System.out.printf("%-15s %-15s %-15s", "TITULO", "AUTOR", "PRECIO");
         System.out.println();
         System.out.printf("%-15s %-15s %-15s", mayor.getTitulo(), mayor.getAutor(), mayor.getPrecio());
         System.out.println();
         System.out.println();
    }
}
