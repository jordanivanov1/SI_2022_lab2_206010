import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementandTest(){
        IllegalArgumentException e;

        e = assertThrows(IllegalArgumentException.class, ()->SILab2.function(createList()));
        assertTrue(e.getMessage().contains("List length should be greater than 0"));

        e= assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList("0", "#", "0")));
        assertTrue(e.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("1","0","1","#","3","#","2","#","2"), SILab2.function(createList("0","0","0","#","0","#","0","#","0")));

    }
    @Test
    void everyBranchTest(){
        IllegalArgumentException e;

        e = assertThrows(IllegalArgumentException.class, ()->SILab2.function(createList()));
        assertTrue(e.getMessage().contains("List length should be greater than 0"));

        e= assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList("0", "#", "0")));
        assertTrue(e.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("1","0","1","#","3","#","2","#","2"), SILab2.function(createList("0","0","0","#","0","#","0","#","0")));

    }


}