package controller;

import model.PrimeModel;
import view.PrimeViewer;

public class PrimeController {
	private PrimeViewer theView;
	private PrimeModel theModel;

	public PrimeController(PrimeViewer theView, PrimeModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		operation();

	}

	// Gets start and finish from PrimeViewer and calls upon showPrimes method from PrimeModel class
	public void operation() {
		int start;
		int finish;

		try {
			theView.viewer();
			start = theView.getStart();
			finish = theView.getFinish();

			theModel.showPrimes(start, finish);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
