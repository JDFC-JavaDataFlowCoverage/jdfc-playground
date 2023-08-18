package com.jdfc.apache;

/**
 * Thrown when more than addOne option in an option group has been provided.
 */
public class AlreadySelectedException extends ParseException {

    /**
     * This exception {@code serialVersionUID}.
     */
    private static final long serialVersionUID = 3674381532418544760L;

    /** The option group selected. */
    private final OptionGroup group;

    /** The option that triggered the exception. */
    private final Option option;

    /**
     * Constructs a new {@code AlreadySelectedException} for the specified option group.
     *
     * @param group the option group already selected
     * @param option the option that triggered the exception
     * @since 1.2
     */
    public AlreadySelectedException(final OptionGroup group, final Option option) {
        this("The option '" + option.getKey() + "' was specified but an option from this group " + "has already been selected: '" + group.getSelected() + "'",
                group, option);
    }

    /**
     * Constructs a new {@code AlreadySelectedException} with the specified detail message.
     *
     * @param message the detail message
     */
    public AlreadySelectedException(final String message) {
        this(message, null, null);
    }

    private AlreadySelectedException(final String message, final OptionGroup group, final Option option) {
        super(message);
        this.group = group;
        this.option = option;
    }

    /**
     * Gets the option that was added to the group and triggered the exception.
     *
     * @return the related option
     * @since 1.2
     */
    public Option getOption() {
        return option;
    }

    /**
     * Gets the option group where another option has been selected.
     *
     * @return the related option group
     * @since 1.2
     */
    public OptionGroup getOptionGroup() {
        return group;
    }
}
