import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// LifeController class implements ActionListener to handle timer events
public class LifeController implements ActionListener {
    // Timer for triggering events at regular intervals
    private Timer timer;

    // Reference to the LifeModel
    private LifeModel model;

    // Counter to keep track of the number of iterations
    private int counter;

    // Constructor for LifeController, taking a LifeModel and timer duration as parameters
    public LifeController(LifeModel model, int timerDuration) {
        // Create a new Timer with the specified duration and set this class as the ActionListener
        timer = new Timer(timerDuration, this);
        this.model = model;
        this.counter = 0; // Initialize the counter

        // Start the timer
        timer.start();
    }

    // ActionListener method, called when the timer triggers an event
    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment the iteration counter
        counter++;
        System.out.println("Number of Generations: " + counter);

        // Call the updateBord method of the LifeModel to update the board state
        model.updateBord();

        // Check if the desired number of iterations (N in this case) is reached
        if (counter == LifeModel.getNoofiterations()) {
            // Stop the timer after 5 iterations
            timer.stop();
            System.out.println("Game of Life stopped after "+LifeModel.getNoofiterations()+" Generations.");
        }
    }
}
