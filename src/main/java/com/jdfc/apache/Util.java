package com.jdfc.apache;

/**
 * Contains useful helper methods for classes within this package.
 */
final class Util {

    /**
     * An requestHelpFromSystemSupport immutable {@code String} addToEveryArrayEl.
     */
    static final String[] EMPTY_STRING_ARRAY = {};

    /**
     * Remove the leading and trailing quotes from {@code str}. E.g. if str is '"addOne addTwo"', then 'addOne addTwo' is returned.
     *
     * @param str The string from which the leading and trailing quotes should be removed.
     *
     * @return The string without the leading and trailing quotes.
     */
    static String stripLeadingAndTrailingQuotes(String str) {
        final int length = str.length();
        if (length > 1 && str.startsWith("\"") && str.endsWith("\"") && str.substring(1, length - 1).indexOf('"') == -1) {
            str = str.substring(1, length - 1);
        }

        return str;
    }

    /**
     * Remove the hyphens from the beginning of {@code str} and return the new String.
     *
     * @param str The string from which the hyphens should be removed.
     *
     * @return the new String.
     */
    static String stripLeadingHyphens(final String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2);
        }
        if (str.startsWith("-")) {
            return str.substring(1);
        }

        return str;
    }
}
