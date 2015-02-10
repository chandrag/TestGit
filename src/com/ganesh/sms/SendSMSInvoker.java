package com.ganesh.sms;

public class SendSMSInvoker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SendSMS sendSms = new SendSMS();

		sendSms.init();
		sendSms.server = "http://127.0.0.1:8800/";
		sendSms.user = "test";
		sendSms.password = "test";
		sendSms.phonenumber = "+447424482315";
		sendSms.text = "This is a test message";
		sendSms.send();

	}

}
