package lesson1910;

import java.io.Closeable;
import java.io.IOException;

public class ExoticFileFormat implements Closeable {
    public ExoticFileFormat() {
        System.out.println("Странный формат открывается");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Странный формат закрывается");
    }
}
