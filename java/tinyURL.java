
import java.util.UUID;

public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String res = fmap.getOrDefault(longUrl, null);
        if(res != null)
            return res;
        
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        fmap.put(longUrl, uuid);
        bmap.put(uuid, longUrl);
        return uuid;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return bmap.get(shortUrl);
    }
    
    HashMap<String, String> fmap = new HashMap<>();
    HashMap<String, String> bmap = new HashMap<>();
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));