
final class Configuration {

    private final String appName;
    private final int version;
    private final String environment;

    // Constructor
    Configuration(String appName, int version, String environment) {
        this.appName = appName;
        this.version = version;
        this.environment = environment;
    }

    // Getter methods
    public String getAppName() {
        return appName;
    }

    public int getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }
}

public class Nov17 {
    public static void main(String[] args) {

        Configuration config =
            new Configuration("JavaApp", 1, "Production");

        System.out.println("Application: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Environment: " + config.getEnvironment());
    }
}
