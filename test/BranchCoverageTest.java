import blackbox.BranchCoverage;
import org.junit.jupiter.api.Test;

public class BranchCoverageTest {

    BranchCoverage bc = new BranchCoverage();
    @Test
    public void testBC(){
        bc.executeBranches(-1,1,2,3);
        bc.executeBranches(20, 20, 20, 20);
        System.out.println("\nTotal coverage: "+bc.getCoverage()*100+"%");
    }

}