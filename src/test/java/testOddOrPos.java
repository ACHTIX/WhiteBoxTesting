import org.example.oddOrPos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testOddOrPos {

    @Test
    public void testStatement(){
        oddOrPos loop0 = new oddOrPos(0);
        loop0.calculateOddOrPos(new int[]{-10, -5, -3, 0});

        assertEquals(0, loop0.getCount());
    }

   @Test
    public void testDecision(){
        oddOrPos loop1 = new oddOrPos(0);
        loop1.calculateOddOrPos(new int[]{-10 , -5 , -3 , 0 , 8});

        assertEquals(1 , loop1.getCount());
    }

    @Test
    public void testLoop(){
        oddOrPos allLoop = new oddOrPos(0);
        allLoop.calculateOddOrPos(new int[]{2 , 4 , 8 ,16});

        assertEquals(4 , allLoop.getCount());
    }
}
