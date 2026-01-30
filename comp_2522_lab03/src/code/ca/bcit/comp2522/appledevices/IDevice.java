package ca.bcit.comp2522.appledevices;

/**
 * Abstract class for all IDevices (IPhone, IPad, IPod).
 *
 * @author Brian Lau
 * @author Sebastian Roby
 * @author Samien Munwar
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructor for IDevice
     *
     * @param purpose String
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Returns purpose.
     *
     * @return purpose
     */
    public final String getPurpose()
    {
        return purpose;
    }

    /**
     * Forces child class's to have a printDetails method.
     */
    public abstract void printDetails();
}
