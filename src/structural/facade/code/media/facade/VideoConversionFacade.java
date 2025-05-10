package structural.facade.code.media.facade;

import java.io.File;
import structural.facade.code.media.library.AudioMixer;
import structural.facade.code.media.library.BitrateReader;
import structural.facade.code.media.library.Codec;
import structural.facade.code.media.library.CodecFactory;
import structural.facade.code.media.library.MPEG4CompressionCodec;
import structural.facade.code.media.library.OggCompressionCodec;
import structural.facade.code.media.library.VideoFile;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }

}
