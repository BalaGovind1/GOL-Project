import javax.swing.*;
import java.util.Scanner;

// Main class for the Game of Life application
public class LifeApp {
    // Instance variables for the model, views, and controller
    private LifeModel model;
    private LifeConsoleView view;
    private LifePanelView panelView;
    private LifeController controller;

    // Constructor for LifeApp, initializes the model, views, and controller
    public LifeApp() {
        // Create a new LifeModel instance
        model = new LifeModel();
        // Create instances of LifeConsoleView and LifePanelView, passing the model
        view = new LifeConsoleView(model);
        panelView = new LifePanelView(model);
        // Get user input for the timer duration
        int timerDuration = LifeModel.getNewTimerUserInput();
        // Create a new LifeController instance, passing the model and timer duration
        controller = new LifeController(model, timerDuration);


    }


    // Main method for the LifeApp application
    public static void main(String[] args) {
                    // Run the application on the Event Dispatch Thread to ensure proper Swing behavior
                    SwingUtilities.invokeLater(() -> {
                        // Create an instance of LifeApp, initializing the application
                        new LifeApp();

            });
            }
}
