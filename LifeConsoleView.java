import java.util.Observable;
import java.util.Observer;

// LifeConsoleView class implements the Observer interface to observe changes in the LifeModel
public class LifeConsoleView implements Observer {
    private LifeModel model;  // Reference to the LifeModel being observed

    // Constructor to initialize the LifeConsoleView with a LifeModel
    public LifeConsoleView(LifeModel model) {
        this.model = model;
        model.addObserver(this);  // Register this view as an observer of the LifeModel
    }

    // Display the current state of the board in the console
    protected void toonBord() {
        System.out.print("\n");
        // Iterate through each row of the board
        for (int r = 0; r < model.bord.length; r++) {
            // Iterate through each column of the board
            for (int k = 0; k < model.bord[r].length; k++) {
                // Display 'X' for live cell, '.' for dead cell
                if (model.bord[r][k])
                    System.out.print("X ");
                else
                    System.out.print(". ");
            }
            System.out.print("\n");  // Move to the next line after each row
        }
    }

    // Observer method, called when the observed object (LifeModel) is updated
    @Override
    public void update(Observable o, Object arg) {
        toonBord();  // Display the updated board when notified of a change in the LifeModel
    }
}
