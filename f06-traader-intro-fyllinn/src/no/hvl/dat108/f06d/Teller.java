package no.hvl.dat108.f06d;

public class Teller {

	private int verdi = 0;

	public void tellOpp() {
//		synchronized (this) {
			verdi++;
//		}
	}

	public void tellNed() {
//		synchronized (this) {
			verdi--;
//		}
	}

	public int getVerdi() {
		return verdi;
	}
}
