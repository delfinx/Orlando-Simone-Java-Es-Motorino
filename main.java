import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Motorino moto1 = new Motorino("Giallo", 35.75f, "Suzuki");

		moto1.getVelocita();
		moto1.accellera(12);
		moto1.inserisciAntifurto();
		moto1.accellera(24);

		//non ho provato il programma perchè ho problemi a casa con il compilatore :)

		MotorinoImmatricolato moto2 = new MotorinoImmatricolato(90, "Kawasaki");

		moto2.getMax();
		moto2.accellera(12);

		//non ho provato il programma perchè ho problemi a casa con il compilatore :)
	}
}
