package pt.com.clevertiassesmentbff.util;

public class Constants {
	
	private Constants() {
		
	}
	
	public static final String NOT_FOUND = "ClevertiAssesmentBff not found.";
	
	public static final String LOG_KEY_METHOD = "method={} ";
	public static final String LOG_KEY_MESSAGE = "msg=\"{}\" ";
	public static final String LOG_KEY_ENTITY = "entity={} ";
	
	public static final String BASE_AUTH_TOKEN_KONG_URI = "/v1/api/clevertiassesment/oauth2/token";
	public static final String BASE_AUTH_GRANT_TYPE = "client_credentials";
	public static final String BASE_AUTH_SCOPE = "read";
	
	public static final String POST_SAVE_NEW_JOB = "/jobs";
	
	public static final String GET_TOLIST_JOB = "/tolistby";
}
