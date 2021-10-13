package solid.interfaceSegregation;

public class Dropbox implements CloudStorageProvider
{
    @Override
    public void storeFile(String name)
    {
        System.out.println("Dropbox is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Dropbox file " + name;
    }

}
