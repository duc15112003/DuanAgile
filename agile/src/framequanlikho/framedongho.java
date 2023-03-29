package framequanlikho;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
public class framedongho implements Runnable{

	
	  JLabel Clocklabel ; 

	    public framedongho(JLabel Clocklabel) {
	        this.Clocklabel = Clocklabel;
	     }
	  
	    @Override
	    public void run() {
	        while (true) {            
	            Date now = new Date();
	            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
	           Clocklabel.setText(sdf.format(now));
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException ex) {
	            }
	        }

	    }
	    
	}
