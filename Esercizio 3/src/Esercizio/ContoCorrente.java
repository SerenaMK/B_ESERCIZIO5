package Esercizio;

public class ContoCorrente {
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		try {
			if (nMovimenti < maxMovimenti) {
				saldo = saldo - x;
				
				// conto in rosso
				if (saldo < 0) {
					throw new BancaException("ERRORE: Il conto è in rosso!");
				}
			} else {
				saldo = saldo - x - 0.50;
			}
		}
		finally {
			nMovimenti++;
		}
	}

	double restituisciSaldo() {
		return saldo;
	}

}
