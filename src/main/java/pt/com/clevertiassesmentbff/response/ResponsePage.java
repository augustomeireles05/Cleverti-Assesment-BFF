package pt.com.clevertiassesmentbff.response;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class ResponsePage<T> extends PageImpl<T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7480412347475480380L;

	@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
	public ResponsePage(
			@JsonProperty("content") List<T> content,
			@JsonProperty("number") int number,
			@JsonProperty("size") int size,
			@JsonProperty("totalElements") Long totalElements,
			@JsonProperty("pageable") JsonNode pageable,
			@JsonProperty("last") boolean last,
			@JsonProperty("totalPages") int totalPages,
			@JsonProperty("sort") JsonNode sort,
			@JsonProperty("first") boolean first,
			@JsonProperty("numberOfElements") int numberOfElements) {
		
		super(content, PageRequest.of(number, size > 0 ? size : 1), totalElements);
	}
	
	public ResponsePage(List<T> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}
	
	public ResponsePage(Page<T> page) {
		super(page.getContent(), page.getPageable(), page.getTotalElements());
	}
}
