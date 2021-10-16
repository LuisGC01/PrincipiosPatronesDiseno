package patterns.behavioural.chainOfResponsibility.callCentre;

public interface Assistant
{
    void setNext(Assistant assistant);
    void handle(HelpDeskRequest helpDeskRequest);
}
