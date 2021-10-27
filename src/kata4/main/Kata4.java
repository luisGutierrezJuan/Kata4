package kata4.main;

import java.util.ArrayList;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {
    MailListReader mailListReader;
    List<Mail> listaEmails;
    MailHistogramBuilder mailHistogramBuilder;
    Histogram <String> histogram;
    
    public static void main(String[] args) {
        Kata4 ejecucion = new Kata4();
        ejecucion.execute();
    }
    public void execute(){
        input();
        process();
        output();
    }
    
    protected void input(){
        mailListReader = new MailListReader();
        listaEmails = mailListReader.read("email.txt");
        mailHistogramBuilder = new MailHistogramBuilder();
    }
    
    protected void process(){
        histogram = mailHistogramBuilder.build(listaEmails);
    }
    
    protected void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
