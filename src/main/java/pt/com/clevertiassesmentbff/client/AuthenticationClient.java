//package pt.com.clevertiassesmentbff.client;
//
//import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
//import static pt.com.clevertiassesmentbff.util.Constants.BASE_AUTH_TOKEN_KONG_URI;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import feign.Headers;
//import pt.com.clevertiassesmentbff.config.FeignConfig;
//import pt.com.clevertiassesmentbff.infrastructure.integration.authentication.AccessTokenDto;
//import pt.com.clevertiassesmentbff.infrastructure.integration.authentication.BaseAuthTokenDto;
//
//@FeignClient(value = "BaseAuthFeignClientIntegration", url = "${integration.base-auth.url}", configuration = FeignConfig.class)
//public interface AuthenticationClient {
//
//	@PostMapping(value = BASE_AUTH_TOKEN_KONG_URI, consumes = APPLICATION_JSON_VALUE)
//	@Headers("Content-type: application/json;charset=UTF-8")
//	BaseAuthTokenDto getToken(@RequestBody AccessTokenDto baseAuthToken);
//}
