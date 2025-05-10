package structural.facade.code.media.library;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Bitreader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Bitreader: writing file...");
        return buffer;
    }

}
