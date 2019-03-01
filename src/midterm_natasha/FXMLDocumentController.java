/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_natasha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ADMIN
 */
public class FXMLDocumentController implements Initializable {
   @FXML
   GridPane gpane;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        Label lb =new Label();
        gpane.add(new Label("Time"), 0, 0);
         gpane.add(new Label("Monday"), 1, 0);
        gpane.add(new Label("Tuesday"), 2,0 );
         gpane.add(new Label("Wednesday"), 3, 0);
         gpane.add(new Label("Thursday"), 4, 0);
         gpane.add(new Label("Friday"), 5, 0);
          gpane.add(new Label("8:30-10:30 AM"), 0, 1);
           gpane.add(new Label("11:00-1:00 PM"), 0, 2);
            gpane.add(new Label("2:00-4:00 PM"), 0, 3);
             gpane.add(new Label("4:00-6:00 PM"), 0, 4);
              gpane.add(new Label("4:300-6:30 PM"), 0, 5);
              gpane.add(new Label("BLOCKCHAIN & AI"), 1, 1);
               gpane.add(new Label("MOBILE APP &WEB DEV"), 5, 1);
                gpane.add(new Label("JAVA 002"), 3, 4);
                 gpane.add(new Label("JAVA 002"), 4, 4);
                  gpane.add(new Label("UI/UX DESIGN"), 3, 5);
                   gpane.add(new Label(" JAVA 003"), 4, 5);
                    gpane.add(new Label("DATABASE WITH PHP"), 5, 5);
               gpane.add(new Label(""), 0, 1);
          String day[] = new String[]{"col 1","col 2","col 3","col 4","col 5,","col 6" };
    String time[] = new String[]{"row 1","row 2","row 3","row 4","row 5" };
   //gpane.add(new Label(day[]), col, row);
 for (int col =0; col<day.length; col++);
 for (int row=1; row<time.length; row++);
// gpane.add(day[row], col, row);
   
    }    
    
}
