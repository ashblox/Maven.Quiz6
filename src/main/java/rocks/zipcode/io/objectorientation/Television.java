package rocks.zipcode.io.objectorientation;

public class Television {

    private TVChannel tvChannel;
    private boolean isTurnedOn;

    public Television() {
        tvChannel = null;
        isTurnedOn = false;
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void setChannel(Integer channel) {
        if (!isTurnedOn) {
            throw new IllegalStateException();
        }
        tvChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
