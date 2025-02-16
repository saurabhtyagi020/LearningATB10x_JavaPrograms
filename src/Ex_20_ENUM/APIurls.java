package Ex_20_ENUM;

public enum APIurls {
    google("http://google.com"),gmail("http://gmail.com"),
    facebook("http://fb.com");

    private String url;
    APIurls(String url)
    {
        this.url=url;
    }
    String getUrl()
    {
        return this.url;
    }
}

