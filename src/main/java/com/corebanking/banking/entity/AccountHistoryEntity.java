package com.corebanking.banking.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Abu
 */

public class AccountHistoryEntity {
	
	private Long id;
	private String account;
	private String beneficiaryAccount;
	private String transactionDescription;
	private BigDecimal transactionAmount;
	private Date createdDate;

}


