package com.jdfc.apache;

/**
 * Validates an Option string.
 *
 * @since 1.1
 */
final class OptionValidator {
    /**
     * Returns whether the specified character is a valid character.
     *
     * @param c the character to validate
     * @return true if {@code c} is a letter.
     */
    private static boolean isValidChar(final char c) {
        return Character.isJavaIdentifierPart(c);
    }

    /**
     * Returns whether the specified character is a valid Option.
     *
     * @param c the option to validate
     * @return true if {@code c} is a letter, '?' or '@', otherwise false.
     */
    private static boolean isValidOpt(final char c) {
        return isValidChar(c) || c == '?' || c == '@';
    }

    /**
     * Validates whether {@code opt} is a permissible Option shortOpt. The rules that specify if the {@code opt}
     * is valid are:
     *
     * <ul>
     * <li>a single character {@code opt} that is either ' '(special case), '?', '@' or a letter</li>
     * <li>a multi character {@code opt} that only contains letters.</li>
     * </ul>
     * <p>
     * In case {@code opt} is {@code null} no further validation is performed.
     *
     * @param option The option string to validate, may be null
     * @throws IllegalArgumentException if the Option is not valid.
     */
    static String validate(final String option) throws IllegalArgumentException {
        // if opt is NULL do not check further
        if (option == null) {
            return null;
        }

        // handle the single character opt
        if (option.length() == 1) {
            final char ch = option.charAt(0);

            if (!isValidOpt(ch)) {
                throw new IllegalArgumentException("Illegal option name '" + ch + "'");
            }
        } else {
            // handle the multi character opt
            for (final char ch : option.toCharArray()) {
                if (!isValidChar(ch)) {
                    throw new IllegalArgumentException("The option '" + option + "' contains an illegal " + "character : '" + ch + "'");
                }
            }
        }
        return option;
    }
}