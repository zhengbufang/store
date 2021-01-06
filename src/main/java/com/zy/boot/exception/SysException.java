package com.zy.boot.exception;

public class SysException extends RuntimeException {

	private static final long serialVersionUID = -7352230407499839619L;

	// 错误代码和错误消息间隔符号，可用于从exception.getMessage()中反向解析出代码和消息
	public static final String MESSAGE_SPLIT_CHAR = ":";
	// 错误代码和错误消息间隔符号，可用于从exception.getMessage()中反向解析出代码和消息的消息和
	public static final String CODE_MESSAGE_SPLIT_CHAR = "!@#";

	private String errcode;
	private String errm;
	private String errLogMsg;
	private String dialog;

	public SysException(String errcode) {
		super(errcode + MESSAGE_SPLIT_CHAR + CODE_MESSAGE_SPLIT_CHAR);
		this.errcode = errcode;
		this.errm = "";
	}

	public SysException(String errcode, String errm) {
		super(errcode + MESSAGE_SPLIT_CHAR + errm + CODE_MESSAGE_SPLIT_CHAR);
		this.errcode = errcode;
		this.errm = errm;
	}

	public SysException(String errcode, String errm, String enErrm) {
		super(errcode + MESSAGE_SPLIT_CHAR + errm + MESSAGE_SPLIT_CHAR + enErrm);
		this.errcode = errcode;
		this.errm = errm;
	}

	public SysException(String errcode, String errm, String errLogMsg, Throwable cause) {
		super(errcode + MESSAGE_SPLIT_CHAR + errm + MESSAGE_SPLIT_CHAR + errLogMsg, cause);
		this.errcode = errcode;
		this.errm = errm;
		this.errLogMsg = errLogMsg;
	}

	public SysException() {
	}

//	public SysException(ErrorCode errorCode) {
//		this(errorCode.getErrcode(), errorCode.getErrm());
//	}
//
//	public SysException(ErrorCode errorCode, String errLogMsg) {
//		this(errorCode.getErrcode(), errorCode.getErrm(), errLogMsg);
//	}
//
//	public SysException(ErrorCode errorCode, String errLogMsg, Throwable cause) {
//		this(errorCode.getErrcode(), errorCode.getErrm(), errLogMsg, cause);
//	}


	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrm() {
		return errm;
	}

	public void setErrm(String errm) {
		this.errm = errm;
	}

	public String getErrLogMsg() {
		return errLogMsg;
	}

	public void setErrLogMsg(String errLogMsg) {
		this.errLogMsg = errLogMsg;
	}

	public String getDialog() {
		return dialog;
	}

	public void setDialog(String dialog) {
		this.dialog = dialog;
	}

}
