package com.github.markusbernhardt.selenium3library;

/**
 * A raised exception of this type ends all test executions.
 */
@SuppressWarnings("serial")
public class Selenium3LibraryFatalException extends RuntimeException {

	/**
	 * Mark this exception as fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = true;

	public Selenium3LibraryFatalException() {
		super();
	}

	public Selenium3LibraryFatalException(String string) {
		super(string);
	}

	public Selenium3LibraryFatalException(Throwable t) {
		super(t);
	}

	public Selenium3LibraryFatalException(String string, Throwable t) {
		super(string, t);
	}
}
