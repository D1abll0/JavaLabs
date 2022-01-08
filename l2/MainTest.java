// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Test;

// import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

class MainTest {
Main prog;
    @BeforeEach
    void setUp() {
        prog = new Main();
    }
    @Test
    void testSizeArr(){
        assertEquals(3,prog.sizeArr(0,1,0.5));
    }
    @Test
    void testfillArrY(){
        double x[]=prog.fillArrX(0.2,2,0.004);
        double y[]=prog.fillArrY(x,2.2);

        assertEquals(0.460170,y[175],0.00001);

    }

}