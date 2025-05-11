package structural.proxy.code.media.proxy;

import java.util.HashMap;
import structural.proxy.code.media.library.ThirdPartyYoutube;
import structural.proxy.code.media.library.ThirdPartyYoutubeLib;
import structural.proxy.code.media.library.Video;

public class YouTubeCacheProxy implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopularVideos = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutube();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopularVideos.isEmpty()) {
            cachePopularVideos = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopularVideos;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopularVideos.clear();
        cacheAll.clear();
    }
}
