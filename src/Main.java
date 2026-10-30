import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odabir = 0;

        BankovniRacun bankovniRacun = new BankovniRacun("1",1000.0);

        while(odabir != 4){
            System.out.println("Odaberi radnju : ");
            System.out.println("Prikaz stanja racuna - odaberi 1");
            System.out.println("Uplata novca - odaberi 2");
            System.out.println("Isplata novca - odaberi 3");
            System.out.println("Kraj programa - odaberi 4");

            odabir = sc.nextInt();
            double iznos = 0;

            switch (odabir){
                case 1:
                        System.out.println("Prikaz stanja racuna:");
                        System.out.println(bankovniRacun.getStanje());
                        break;
                case 2:
                    System.out.println("Uplata novca:");
                    System.out.println("Unesi iznos koji zelis uplatiti : ");
                    iznos = sc.nextDouble();

                    bankovniRacun.uplati(iznos);
                    break;

                case 3:
                    System.out.println("Isplata novca:");
                    System.out.println("Unesi iznos koji zelis isplatiti : ");
                    iznos = sc.nextDouble();

                    bankovniRacun.isplati(iznos);
                    break;
                case 4:
                    System.out.println("Kraj programa:");
            }

        }


        sc.close();
    }

}
