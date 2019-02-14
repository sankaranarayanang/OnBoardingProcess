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
public class OnBoardingException extends SystemException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -199557901655420032L;
	private static final Log LOG = LogFactory.getLog(OnBoardingException.class);

	/**
	 * @param message
	 */
	public OnBoardingException(String message) {
		super(message);
		LOG.error(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public OnBoardingException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message, cause);
	}
}
