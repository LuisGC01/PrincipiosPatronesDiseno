package patterns.structural.bridge.devices;

public class Application {
	public static void main(String[] args) {
		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl(television);
		System.out.println("Toggling power to turn tv on");
		remoteControl.togglePower();
		System.out.println("Going up 3 channels:");
		remoteControl.channelUp();
		remoteControl.channelUp();
		remoteControl.channelUp();
		System.out.println("Turning volume up by 4 levels:");
		remoteControl.volumeUp();
		remoteControl.volumeUp();
		remoteControl.volumeUp();
		remoteControl.volumeUp();
		System.out.println("Is tv enabled? " + television.isEnabled());
		System.out.println("In channel: " + television.getChannel());
		System.out.println("Volume: " + television.getVolume());

		Radio radio = new Radio();
		AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
		System.out.println("Toggling power to turn radio on");
		advancedRemoteControl.togglePower();
		System.out.println("Going up 3 channels:");
		advancedRemoteControl.channelUp();
		advancedRemoteControl.channelUp();
		advancedRemoteControl.channelUp();
		System.out.println("Turning volume up by 4 levels:");
		advancedRemoteControl.volumeUp();
		advancedRemoteControl.volumeUp();
		advancedRemoteControl.volumeUp();
		advancedRemoteControl.volumeUp();
		System.out.println("Volume: " + radio.getVolume());
		System.out.println("Silence:");
		advancedRemoteControl.mute();
		System.out.println("Is radio enabled? " + radio.isEnabled());
		System.out.println("In channel: " + radio.getChannel());
		System.out.println("Volume: " + radio.getVolume());

		Roku roku = new Roku();
		RemoteControl controlRoku = new RemoteControl(roku);

		System.out.println("Toggling power to turn roku on");
		controlRoku.togglePower();
		System.out.println("Going up youtube channel:");
		controlRoku.channelUp();
		controlRoku.channelUp();
		System.out.println("Turning volume up by 5 levels:");
		controlRoku.volumeUp();
		controlRoku.volumeUp();
		controlRoku.volumeUp();
		controlRoku.volumeUp();
		controlRoku.volumeUp();
		System.out.println("Volume: " + roku.getVolume());
		System.out.println("Going down netflix channel:");
		controlRoku.channelDown();
		System.out.println("Turning volume down by 3 levels:");
		controlRoku.volumeDown();
		controlRoku.volumeDown();
		controlRoku.volumeDown();
		System.out.println("Volume: " + roku.getVolume());

	}
}
