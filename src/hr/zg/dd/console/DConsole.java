package hr.zg.dd.console;

public class DConsole extends DAbstractScreen{

    public void display(DAbstractWindow window) {
        if (!windows.add(window)){
            //Greška dodavanja
        }
    }
    
}
