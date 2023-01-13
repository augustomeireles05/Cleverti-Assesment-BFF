//package pt.com.clevertiassesmentbff.infrastructure.integration.authentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import lombok.RequiredArgsConstructor;
//import pt.com.clevertiassesmentbff.client.AuthenticationClient;
//
//import static pt.com.clevertiassesmentbff.util.Constants.BASE_AUTH_GRANT_TYPE;
//import static pt.com.clevertiassesmentbff.util.Constants.BASE_AUTH_SCOPE;
//
//
//@RequiredArgsConstructor
//@Component
//public class AuthenticationIntegration {
//	
//	@Autowired
//	private AuthenticationClient authenticationClient;
//	
//	@Value("${integration.base-auth.client_id}")
//	private String clientId;
//	
//	@Value("${integration.base-auth.client_secret}")
//	private String clientSecret;
//	
//	public String generateAccess() {
//		
//		BaseAuthTokenDto baseAuthToken = authenticationClient.getToken(AccessTokenDto.builder()
//				.clientId(clientId).clientSecret(clientSecret)
//				.grantType(BASE_AUTH_GRANT_TYPE).scope(BASE_AUTH_SCOPE).build());
//		return "Bearer " + baseAuthToken.getAccessToken();
//	}
//}
