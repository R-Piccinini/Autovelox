import java.util.Scanner;

public class Autovelox {

	public static void main(String[] args) {

		int limite, velocità, differenza;
		String conferma;

		Scanner sc = new Scanner(System.in);
		System.out.print("inserire limite di velocità:");
		limite = sc.nextInt();
		sc.nextLine();
		do {
			System.out.print("inserire velocità rilevata:");
			velocità = sc.nextInt();
			sc.nextLine();

			if (velocità >= 0 && limite >= 0) {
				differenza = velocità - limite;
				if (velocità <= 100) {
					if (velocità > limite + 5) {
						if (differenza > 5 && differenza < 10)
							System.out.println("La sanzione è tra 42 e 173€");
						else if (differenza >= 10 && differenza <= 40)
							System.out.println("La sanzione è tra 173€ e 694€");
						else if (differenza > 40 && differenza <= 60)
							System.out.println("La sanzione è tra 543€ e 2.170€");
						else
							System.out.println("La sanzione è tra 845€ e 3382€");
					} else
						System.out.println("Rispettato il limite");
				} else {
					if (velocità > limite / 100 * 105) {
						if (differenza > 5 && differenza < 10)
							System.out.println("La sanzione è tra 42 e 173€");
						else if (differenza >= 10 && differenza <= 40)
							System.out.println("La sanzione è tra 173€ e 694€");
						else if (differenza > 40 && differenza <= 60)
							System.out.println("La sanzione è tra 543€ e 2.170€");
						else
							System.out.println("La sanzione è tra 845€ e 3382€");
					} else
						System.out.println("Rispettato il limite");
				}
			}

			else {
				while (limite <= 0 || velocità <= 0) {
					System.out.println("Errore controllare valori");
					System.out.println("inserire limite di velocità:");
					limite = sc.nextInt();
					sc.nextLine();

					System.out.println("inserire velocità rilevata:-");
					velocità = sc.nextInt();
					sc.nextLine();
				}
			}
			System.out.println("Controllare altri veicoli? si/no");
			conferma = sc.next();

			while (!(conferma.equals("si") || conferma.equals("no"))) {
				System.out.println("inserire si o no");
				conferma = sc.next();

			}

		} while (conferma.equals("si"));

		System.out.println("Arrivederci");
		sc.close();

	}
}
