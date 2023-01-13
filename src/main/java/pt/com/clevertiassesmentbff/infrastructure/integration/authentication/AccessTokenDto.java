package pt.com.clevertiassesmentbff.infrastructure.integration.authentication;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"grant_type",
	"client_id",
	"client_secret",
	"scope"
})
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccessTokenDto {
	
	@JsonProperty("grant_type")
	private String grantType;
	
	@JsonProperty("client_id")
	private String clientId;
	
	@JsonProperty("client_secret")
	private String clientSecret;
	
	@JsonProperty("scope")
	private String scope;
	
}
