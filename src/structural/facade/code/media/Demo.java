package structural.facade.code.media;

import structural.facade.code.media.facade.VideoConversionFacade;

public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
    }

}
