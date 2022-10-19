package ticketmachine;

public class Main {
// anniv melanie
	// merci beaucoup ;)
	//c aussi l'anniv de jeannnnn! bon anniversaire à vous 2
	// de rien hein?
	public static void main(String[] args) {
		TicketMachine machine = new TicketMachine(50);
		System.out.println("L'utilisateur insère 60 centimes");
		machine.insertMoney(60);
		System.out.println("L'utilisateur appuie sur 'Impression ticket'");
		machine.printTicket();
	}
}
