package ca.bcit.comp2522.appledevices;

import java.util.Objects;

public final class IPhone17 extends IPhone
{
    // It's generally not possible to replace an entire camera system in a phone,
    // so we make this field final.
    private final boolean highResolutionCamera;
    private int memoryInGB;
    private static final int MIN_MEMORY_IN_GB = 1;

    @Override
    public String toString()
    {
        return "IPhone17{" +
                super.toString() + ", " +
                "highResolutionCamera=" + highResolutionCamera +
                ", memoryInGB=" + memoryInGB +
                '}';
    }

    /**
     * Constructor for IPhone17.
     *
     * @param phonePlanRemainingMinutes double
     * @param carrier String
     * @param highResolutionCamera boolean
     * @param memoryInGB int
     */
    public IPhone17(final double phonePlanRemainingMinutes,
                                final String carrier,
                                final boolean highResolutionCamera,
                                final int memoryInGB)
    {
        super(phonePlanRemainingMinutes, carrier);

        validateMemoryInGB(memoryInGB);

        this.highResolutionCamera = highResolutionCamera;
        this.memoryInGB = memoryInGB;
    }

    /**
     * Returns true if the IPhone17 has a high resolution camera.
     *
     * @return highResolutionCamera
     */
    public boolean isHighResolutionCamera()
    {
        return highResolutionCamera;
    }

    /**
     * Returns memory in GB.
     *
     * @return memoryInGB
     */
    public int getMemoryInGB()
    {
        return memoryInGB;
    }

    /**
     * Sets memory in GB.
     * Effectively the same as changing the memory card.
     *
     * @param memoryInGB int
     */
    public void setMemoryInGB(final int memoryInGB)
    {
        this.memoryInGB = memoryInGB;
    }

    /*
     * Prints details of IPhone17.
     *
     * @param memoryInGB
     */
    private static void validateMemoryInGB(final int memoryInGB)
    {
        if (memoryInGB <= MIN_MEMORY_IN_GB)
        {
            throw new IllegalArgumentException("Memory in GB must be positive");
        }
    }

    /**
     * IPhone17 objects that have the same amount of minutes remaining
     * on their phone plan are considered equal, but only if they also
     * have the same value for “high-resolution camera”.
     * @param o   the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof IPhone17 iPhone17))
        {
            return false;
        }
        if (!super.equals(o))
        {
            return false;
        }
        return isHighResolutionCamera() == iPhone17.isHighResolutionCamera() &&
                getMemoryInGB() == iPhone17.getMemoryInGB();
    }

    /**
     * Returns hash code for IPhone17.
     *
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), isHighResolutionCamera(), getMemoryInGB());
    }
}
