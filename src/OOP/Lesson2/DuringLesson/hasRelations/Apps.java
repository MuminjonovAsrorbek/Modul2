package OOP.Lesson2.DuringLesson.hasRelations;

public class Apps {
    private String name;
    private String appSize;
    private String appVersion;

    public Apps(String name, String appSize, String appVersion) {
        this.name = name;
        this.appSize = appSize;
        this.appVersion = appVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
