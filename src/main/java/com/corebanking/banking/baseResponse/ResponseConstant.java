package com.corebanking.banking.baseResponse;

/**
 * @author Abu
 */

public class ResponseConstant {

	/*
	 * Response Codes and Messages
	 */

	// success
	public static final String SUCCEESS_CODE = "00";
	public static final String SUCCEESS_MESSAGE = "Successful";

	// insufficient funds
	public static final String INSUFFICIENT_CODE = "01";
	public static final String INSUFFICIENT_MESSAGE = "Insufficient Funds";

	// web service unavailable
	public static final String WEBSERVICE_UNAVAILABLE_CODE = "02";
	public static final String WEBSERVICE_UNAVAILABLE_MESSAGE = "Web Service unreachable";

	// Account Number Check
	public static final String INVALID_ACCOUNT_CODE = "03";
	public static final String INVALID_ACCOUNT_MESSAGE = "Invalid Account Number";

	// mandatory parameter has not been passed
	public static final String MANDATORY_CODE = "04";
	public static final String MANDATORY_MESSAGE = "A mandatory parameter has not been passed: ";

	// already exist
	public static final String ALREADY_EXIST_CODE = "05";
	public static final String ALREADY_EXIST_MESSAGE = "Record already exist ";

	// not found
	public static final String NOT_FOUND_CODE = "06";
	public static final String NOT_FOUND_MESSAGE = "Not Found";

	// exception
	public static final String EXCEPTION_CODE = "11";
	public static final String EXCEPTION_MESSAGE = "Exception was thrown ";

	// wrong login credentials
	public static final String LOGIN_CODE = "12";
	public static final String LOGIN_MESSAGE = "Invalid Username Or Password or Pin";

	// generic mismatch
	public static final String MISMATCH_CODE = "16";
	public static final String MISMATCH_MESSAGE = "There is a mismatch between the data passed";

	// exceeded limit
	public static final String LIMIT_CODE = "17";
	public static final String LIMIT_MESSAGE = "Limit has been exceeded";

	// Invalid Amount
	public static final String INVALID_AMOUNT_CODE = "20";
	public static final String INVALID_AMOUNT_MESSAGE = "Invalid Amount";

}
