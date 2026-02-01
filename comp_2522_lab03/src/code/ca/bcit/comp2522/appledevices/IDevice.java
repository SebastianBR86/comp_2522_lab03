package ca.bcit.comp2522.appledevices;

import java.util.Objects;

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

    @Override
    public boolean equals(final Object o)
    {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IDevice iDevice = (IDevice) o;
        return Objects.equals(purpose, iDevice.purpose);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(purpose);
    }

    /**
     * Forces child class's to have a printDetails method.
     */
    public abstract void printDetails();

    private static void validatePurpose(final String purpose)
    {
        if (purpose == null || purpose.trim().isEmpty())
        {
            throw new IllegalArgumentException("Purpose cannot be null or empty");
        }
    }
}
