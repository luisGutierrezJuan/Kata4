package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "email.txt";
        MailListReader mailListReader = new MailListReader();
        List<Mail> listaEmails = mailListReader.read(fileName);
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram <String> histogram = mailHistogramBuilder.build(listaEmails);
        new HistogramDisplay(histogram).execute();
    }
    
}
