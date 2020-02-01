package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws IllegalArgumentException {
        ImageReader reader = null;
        if (type == null) throw new IllegalArgumentException("Неизвестный тип картинки");
        if (type.equals(ImageTypes.JPG)) reader = new JpgReader();
        if (type.equals(ImageTypes.PNG)) reader = new PngReader();
        if (type.equals(ImageTypes.BMP)) reader = new BmpReader();
        return reader;
    }
}
