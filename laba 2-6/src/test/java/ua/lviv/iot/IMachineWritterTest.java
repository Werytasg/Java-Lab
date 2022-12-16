package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.Material.*;

class IMachineWritterTest {
    First obj1 = new First(9,2,3, Wool);
    Second obj2 = new Second(3, 4, 10, Textile);
    Third obj3 = new Third(6, 7, 8, Linen);
    @Test
    void writeToFile() {
        IMachineWriter iMaсhineWriter = new IMachineWriter();
        List<Maсhine> list2 = Arrays.asList(obj1, obj2, obj3);
        iMaсhineWriter.writeToFile(list2);
        String readerEx = String.format("example.csv");
        String readerRes = String.format("result.csv");
        try {
            BufferedReader readerResult = new BufferedReader(new FileReader(readerRes));
            BufferedReader readerExample = new BufferedReader(new FileReader(readerEx));
            assertEquals(readerExample.readLine(), readerResult.readLine());
            assertNotEquals(null, readerResult.readLine());
            assertNotEquals(readerExample.readLine(), null);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}           