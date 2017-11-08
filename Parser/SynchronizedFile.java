package Parser;

import java.io.File;


public class SynchronizedFile {
    File file = null;

    public synchronized void setFile(File file) {
        this.file = file;
    }

    public synchronized File getFile() {
        return file;
    }
}
