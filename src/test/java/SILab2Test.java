import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void everyStatementTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0","#");

        IllegalArgumentException illegalGreater, illegalPerfect;

        illegalGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case1));
        assertTrue(illegalGreater.getMessage().contains("List length should be greater than 0"));

        illegalPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case2));
        assertTrue(illegalPerfect.getMessage().contains("List length should be a perfect square"));
    }

    @Test
    void everyBranchTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0","#");

        IllegalArgumentException illegalGreater, illegalPerfect;

        illegalGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case1));
        assertTrue(illegalGreater.getMessage().contains("List length should be greater than 0"));

        illegalPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case2));
        assertTrue(illegalPerfect.getMessage().contains("List length should be a perfect square"));
    }
}
