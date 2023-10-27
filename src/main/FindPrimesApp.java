package main;

import controller.PrimeController;
import model.PrimeModel;
import view.PrimeViewer;

public class FindPrimesApp {
    
    

    public static void main(String[] args) {

        PrimeViewer theViewer = new PrimeViewer();
        
        PrimeModel theModel = new PrimeModel();
        
        PrimeController theController = new PrimeController(theViewer, theModel);

    }

}