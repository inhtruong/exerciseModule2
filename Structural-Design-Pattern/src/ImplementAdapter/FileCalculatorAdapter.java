package ImplementAdapter;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator{

    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }

    private class FileUtil {
        public long calculateSize(File file) {
            return 0;
        }
    }
}
