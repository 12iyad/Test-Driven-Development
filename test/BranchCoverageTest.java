import blackbox.BranchCoverage;
import org.junit.jupiter.api.Test;

public class BranchCoverageTest {

    BranchCoverage bc = new BranchCoverage();

    @Test
    public void testBC(){

        bc.executeBranches(0,5,8,1);
        bc.executeBranches(1,1,2,4);
        bc.executeBranches(3,1,5,11);
        bc.executeBranches(5,5,7,1);
        bc.executeBranches(1,1,1,1);
        bc.executeBranches(0,5,4,1);
        bc.executeBranches(0,5,8,5);

        //bc.executeBranches(20, 20, 20, 20);
        System.out.println("\nTotal coverage: "+bc.getCoverage()*100+"%");
    }

}