import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CheckWordTest1 {

    @Test
    void checkWord() {
        String testLine = "I was Here and here and I go to Here";
        Set<String> expectationResult1 = new HashSet<>(Arrays.asList("i", "here", "and"));
        Set<String> expectationResult2 = new HashSet<>(List.of("here"));
        Set<String> expectationResult3 = new HashSet<>(Arrays.asList("here", "i"));
        Assertions.assertEquals(expectationResult1, CheckWord.checkWord(testLine, 1));
        Assertions.assertEquals(expectationResult2, CheckWord.checkWord(testLine, 2));
        Assertions.assertNotEquals(expectationResult3, CheckWord.checkWord(testLine, 0));
    }

    @org.junit.jupiter.api.Test
    void testCheckWord() {
    }
}