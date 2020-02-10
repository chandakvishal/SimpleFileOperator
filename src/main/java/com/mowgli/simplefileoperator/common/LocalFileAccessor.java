package com.mowgli.simplefileoperator.common;

import java.io.File;

public class LocalFileAccessor {

    private static final String FILE_PATH = "src/main/java/com/mowgli/simplefileoperator/assets/Mowgli.jpg";

    public static File getFileToUpload() {
        return new File(FILE_PATH);
    }
}
