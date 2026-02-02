package ca.bcit.comp2522.appledevices;

import java.util.Objects;

/**
 * Class representing an IPhone.
 *
 * @author Brian Lau
 * @author Sebastian Roby
 * @author Samien Munwar
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private double phonePlanRemainingMinutes;
    private String carrier;
    private static final String PURPOSE = "talking";
    private static final int MIN_PHONE_PLAN_REMAINING_MINUTES = 0;

    /**
     * Constructor for IPhone.
     *
     * @param phonePlanRemainingMinutes double
     * @param carrier String
     */
    public IPhone(final double phonePlanRemainingMinutes,
                            final String carrier)
    {
        super(PURPOSE);

        validateCarrier(carrier);
        validatePhonePlanRemainingMinutes(phonePlanRemainingMinutes);

        this.phonePlanRemainingMinutes = phonePlanRemainingMinutes;
        this.carrier = carrier;
    }

    /**
     * Returns phone plan remaining minutes.
     *
     * @return phonePlanRemainingMinutes
     */
    public double getPhonePlanRemainingMinutes()
    {
        return phonePlanRemainingMinutes;
    }

    /**
     * Sets phone plan remaining minutes.
     *
     * @param phonePlanRemainingMinutes double
     */
    public void setPhonePlanRemainingMinutes(final double phonePlanRemainingMinutes)
    {
        this.phonePlanRemainingMinutes = phonePlanRemainingMinutes;
    }

    /**
     * Returns carrier.
     *
     * @return carrier
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets carrier.
     *
     * @param carrier String
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof IPhone iPhone))
        {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return Double.compare(getPhonePlanRemainingMinutes(),
                                            iPhone.getPhonePlanRemainingMinutes()) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getPhonePlanRemainingMinutes());
    }

    @Override
    public String toString()
    {
        return  "phonePlanRemainingMinutes = " + phonePlanRemainingMinutes +
                    ", carrier = '" + carrier + " ";
    }

    /**
     * Prints details of the IPhone.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    private static void validateCarrier(final String carrier)
    {
        if (carrier == null || carrier.trim().isEmpty())
        {
            throw new IllegalArgumentException("Carrier cannot be null or empty");
        }
    }

    private static void validatePhonePlanRemainingMinutes(final double phonePlanRemainingMinutes)
    {
        if (phonePlanRemainingMinutes < MIN_PHONE_PLAN_REMAINING_MINUTES)
        {
            throw new IllegalArgumentException("Phone plan remaining minutes cannot be lower" +
                                                       " than " + MIN_PHONE_PLAN_REMAINING_MINUTES);
        }
    }
}
