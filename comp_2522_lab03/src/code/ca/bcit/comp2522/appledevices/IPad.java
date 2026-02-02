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
public class IPad extends IDevice
{
    private final boolean hasCase;
    private final String osVersion;

    /**
     * constructor for IPad.
     *
     * @param hasCase boolean
     * @param osVersion String
     * @param getPurpose String
     */
    public IPad(final boolean hasCase,
                final String osVersion,
                final String getPurpose)
    {
        super("learning");

        if(osVersion == null || osVersion.isEmpty())
        {
            throw new IllegalArgumentException("osVersion cannot be null or empty");
        }

        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * returns true if IPad has a case.
     *
     * @return hasCase()
     */
    public boolean hasCase()
    {
            return hasCase;
    }

    /**
     * Returns the exact OS Version.
     *
     * @return getOsVersion
     */
    public String getOsVersion()
    {
        return osVersion;
    }

    /**
     * Prints details of IPad.
     */
    @Override
    public void printDetails()
    {
        System.out.println("IPad details:");
        System.out.println(" " + super.toString());
        System.out.println(" hasCase=" + hasCase);
        System.out.println(" osVersion=" + osVersion);
    }

    /**
     * Overrides toString.
     *
     * @return toString + hashcode + osVersion
     */
    @Override
    public String toString()
    {
        return "IPad{"
                + super.toString()
                + ", hasCase=" + hasCase
                + ", osVersion" + osVersion;
    }

    /**
     * IPads are equal if they have the same OS version.
     *
     * @param o object to compare
     * @return true if equal
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }

        if (!(o instanceof IPad))
        {
            return false;
        }

        final IPad iPad = (IPad) o;
        return Objects.equals(osVersion, iPad.osVersion);
    }

    /**
     * Overrides hashcode.
     *
     * @return hashcode
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(osVersion);
    }
}

