import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Suma initiala: ");
        int sumaInitiala = scanner.nextInt();
        System.out.print("Nr ani: ");
        int nrAni = scanner.nextInt();
        System.out.print("% dobanda: ");
        double dobanda = scanner.nextDouble();

        double sumaDobandaSimpla = calcDobandaSimpla(sumaInitiala, nrAni, dobanda);
        double sumaDobandaCompusa = calcDobandaCompusa(sumaInitiala, nrAni, dobanda);

        System.out.printf("Diferenta este: %.2f ",(sumaDobandaCompusa-sumaDobandaSimpla));
    }


        private static double calcDobandaCompusa(double sumaInitiala, int nrAni, double dobanda){
            for (int i=0; i<nrAni; i++){
                sumaInitiala*=(1+dobanda/100);
            }
            System.out.printf("Dobanda compusa: %.2f\n", sumaInitiala);
            return sumaInitiala;
        }

        private static double calcDobandaSimpla(double sumaInitiala, int nrAni, double dobanda) {
            sumaInitiala=sumaInitiala*(1+nrAni*dobanda/100);
            System.out.printf("Dobanda simpla: %.2f\n", sumaInitiala);
            return sumaInitiala;
        }
    }

