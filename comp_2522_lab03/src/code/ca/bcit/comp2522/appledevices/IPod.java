package ca.bcit.comp2522.appledevices;

import java.util.Objects;

/**
 * Class representing an IPod.
 *
 * @author Brian Lau
 * @author Sebastian Roby
 * @author Samien Munwar
 * @version 1.0
 */
public final class IPod extends IDevice
{
    private static final String PURPOSE = "music";
    private final double maxVolume;
    private int songCount;


    /**
     * constructor for IPod.
     *
     * @param songCount int
     * @param maxVolume double
     */
    public IPod(final int songCount,
                final double maxVolume)
    {
        super(PURPOSE);


        this.songCount = songCount;
        this.maxVolume = maxVolume;
    }

    /**
     * Returns songCount.
     *
     * @return songCount
     */
    public int getSongCount()
    {
        return songCount;
    }

    /**
     * Returns maxVolume.
     *
     * @return maxVolume
     */
    public double getOsVersion()
    {
        return maxVolume;
    }


    /**
     * Prints details of IPod.
     */
    @Override
    public void printDetails()
    {
        System.out.println("IPod details:");
        System.out.println(" " + super.toString());
        System.out.println(" SongCount=" + songCount);
        System.out.println(" MaxVolume=" + maxVolume);
    }

    /**
     * Overrides toString.
     *
     * @return toString + hashcode + osVersion
     */
    @Override
    public String toString()
    {
        return "IPod " +
                super.toString() +
                ", Song Count: " + songCount +
                ", Max Volume: " + maxVolume;
    }

    /**
     * IPods are equal if they have the same song count.
     *
     * @param o object to compare
     * @return .equals of this.songCount and object.songCount
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }

        if (!(o instanceof IPod))
        {
            return false;
        }

        final IPod i1 = (IPod) o;
        return Objects.equals(this.songCount, i1.songCount);
    }

    /**
     * Overrides hashcode.
     *
     * @return hashcode
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getSongCount());
    }
}
