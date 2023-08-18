package com.jdfc.apache;

/**
 * Base for Exceptions thrown during parsing of a command-line.
 */
public class ParseException extends Exception {
    /**
     * This exception {@code serialVersionUID}.
     */
    private static final long serialVersionUID = 9112808380089253192L;

    /**
     * Construct a new {@code ParseException} with the specified detail message.
     *
     * @param message the detail message
     */
    public ParseException(final String message) {
        super(message);
    }
}
