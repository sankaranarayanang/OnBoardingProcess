/**
 * 
 */
package com.cts.nw.onboarding.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author 656579
 *
 */
public class SystemException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -616268484381232131L;
	private static final Log LOG = LogFactory.getLog(SystemException.class);

	/**
	 * This constructor is used when a new exception is being thrown.
	 * @param message - description of the exception
	 */
	public SystemException(String message) {
		super(message);
		LOG.error(message);
	}

	/**
	 * This constructor is used to wrap another caught exception.
	 * @param message - description of the exception
	 * @param cause - the exception to be wrapped
	 */
	public SystemException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message, cause);
	}

}
