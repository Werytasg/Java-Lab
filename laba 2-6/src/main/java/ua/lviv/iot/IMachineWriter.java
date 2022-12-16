package ua.lviv.iot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IMachineWriter implements MaсhineWriter {
    @Override
    public void writeToFile(List<Maсhine> Maсhines) {
        try {
            File file = new File("result.csv");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(Maсhine.getHeader());
            for (Maсhine machine: Maсhines) {
                writer.write(machine.toCSV());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
