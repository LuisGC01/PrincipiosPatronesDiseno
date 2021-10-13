package solid.interfaceSegregation;

public interface HostingProvider {
    void createServer(Region region, String serverName);
    void listServers(Region region);
}
