package HomeWork10;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavel on 09/08/2017.
 */
public class PrintDirectoryWhithGoogle {
    public static void main(String[] args) throws IOException{

        String path = "D:\\games";
        Path parent = Paths.get(path);
        Files.walkFileTree(parent, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                int count = dir.getNameCount() - parent.getNameCount() + 1;
                count += dir.getFileName().toString().length();

                //выравнивание по правому краю
                String text = String.format("%" + count + "s", dir.getFileName());
                text = text.replaceAll("[\\s]", "-");
                System.out.println(text);
                return FileVisitResult.CONTINUE;
            }
        });



    }
}
