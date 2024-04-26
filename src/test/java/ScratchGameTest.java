import com.cyberspeed.JSONPojo.Output;
import com.cyberspeed.JSONPojo.Root;
import com.cyberspeed.JsonReader;
import com.cyberspeed.MatrixChecker;
import com.cyberspeed.MatrixGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScratchGameTest {
    JsonReader reader = null;
    File configResources = null;
    MatrixChecker mc = null;
    MatrixGenerator mg = null;

    @BeforeEach
    public void init() {
        reader = new JsonReader();
        configResources = new File("src/main/resources/config.json");
        mc = new MatrixChecker();
        mg = new MatrixGenerator();

    }

    @Test
    public void scratchGameLoss() throws IOException {
        String[][] matrix = {{"A", "B", "C"},
                {"E", "B", "5x"},
                {"F", "D", "C"}};
        Root game = reader.readJson(configResources);
        Output output = mc.evaluateMatrix(matrix, game, mg.fillRewards(game), 100);
        assertEquals(0, output.getReward());
    }

    @Test
    public void scratchGameWin() throws IOException {
        String[][] matrix = {{"A", "B", "C"},
                {"E", "B", "10x"},
                {"F", "D", "B"}};
        Root game = reader.readJson(configResources);
        Output output = mc.evaluateMatrix(matrix, game, mg.fillRewards(game), 100);
        assertEquals(75000, output.getReward());
    }
}
