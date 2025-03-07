import java.util.Scanner;
public class usoMotorino
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
		//PARTE 3

		Motorino motorino = new Motorino("grigiometallizzato", 40.5, "Piaggio Liberty" );

		float velocitaMotorino = motorino.getVelocita();

		MotorinoImmatricolato motorinoImmatricolato =  new MotorinoImmatricolato("rosso", 30.5, "Aprilia Scarabeo", 60, "CV1234");
		motorinoImmatricolato.getMax();
		float risultatoMotorino = motorinoImmatricolato.accellera(30.7);
		float risultatoMotorino_immatricolato = motorino.accellera(30.7);

		System.out.println(velocitaMotorino);
		System.out.println(risultatoMotorino);
		System.out.println(risultatoMotorino_immatricolato);
	}
}
