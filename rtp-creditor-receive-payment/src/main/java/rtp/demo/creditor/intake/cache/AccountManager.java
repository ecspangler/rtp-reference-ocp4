package rtp.demo.creditor.intake.cache;

import java.net.URLDecoder;
import java.net.URLEncoder;

import java.io.UnsupportedEncodingException;

public class AccountManager {

	public static String encode(String key) {
		try {
			return URLEncoder.encode(key, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static String decode(String key) {
		try {
			return URLDecoder.decode(key, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

}
