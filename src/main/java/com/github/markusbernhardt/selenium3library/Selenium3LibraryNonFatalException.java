package com.github.markusbernhardt.selenium3library;

/**
 * A raised exception of this type marks the step as failed, but does not end
 * all test executions.
 */
@SuppressWarnings("serial")
public class Selenium3LibraryNonFatalException extends RuntimeException {

	/**
	 * Mark this exception as non fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = false;

	public Selenium3LibraryNonFatalException() {
		super();
	}

	public Selenium3LibraryNonFatalException(String string) {
		super(string);
	}

	public Selenium3LibraryNonFatalException(Throwable t) {
		super(t);
	}

	public Selenium3LibraryNonFatalException(String string, Throwable t) {
		super(string, t);
	}
}
