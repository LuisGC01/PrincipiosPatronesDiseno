package patterns.structural.bridge.devices;

public class Roku implements Device
{
    private boolean enabledState;
    private int volume;
    private int channel;

    public Roku()
    {
        System.out.println("Creating Roku");
        enabledState = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public boolean isEnabled()
    {
        System.out.println("Is Roku enabled?");
        return enabledState;
    }

    @Override
    public void enable()
    {
        System.out.println("Enabling Roku");
        enabledState = true;
    }

    @Override
    public void disable()
    {
        System.out.println("Disabling Roku");
        enabledState = false;
    }

    @Override
    public int getVolume()
    {
        System.out.println("Getting Roku volume");
        return volume;
    }

    @Override
    public void setVolume(int percent)
    {
        System.out.println("Setting Roku volume");
        volume = percent;
    }

    @Override
    public int getChannel()
    {
        System.out.println("Getting Roku channel");
        return channel;
    }

    @Override
    public void setChannel(int channel)
    {
        System.out.println("Setting Roku channel");
        this.channel = channel;
    }
}
