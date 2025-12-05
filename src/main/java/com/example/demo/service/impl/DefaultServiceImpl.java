package com.example.demo.service.impl;

import com.example.demo.service.DefaultService;
import tools.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.example.demo.model.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultServiceImpl implements DefaultService {

	private final ObjectMapper objectMapper;

	@Override
	public Mono<GetItemsResponse> getItems() {
		try {
			String jsonExample = "{\"items\":[{\"id\":1,\"nombre\":\"Uno\"}]}";
			GetItemsResponse response = objectMapper.readValue(jsonExample, GetItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	@Override
	public Mono<PostItemsResponse> postItems(PostItemsRequest request) {
		try {
			String jsonExample = "{}";
			PostItemsResponse response = objectMapper.readValue(jsonExample, PostItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	@Override
	public Mono<GetItemsResponse> getItems() {
		try {
			String jsonExample = "{\"id\":1,\"nombre\":\"Ejemplo\"}";
			GetItemsResponse response = objectMapper.readValue(jsonExample, GetItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	@Override
	public Mono<PutItemsResponse> putItems(PutItemsRequest request) {
		try {
			String jsonExample = "{}";
			PutItemsResponse response = objectMapper.readValue(jsonExample, PutItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	@Override
	public Mono<PatchItemsResponse> patchItems(PatchItemsRequest request) {
		try {
			String jsonExample = "{}";
			PatchItemsResponse response = objectMapper.readValue(jsonExample, PatchItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	@Override
	public Mono<DeleteItemsResponse> deleteItems() {
		try {
			String jsonExample = "{}";
			DeleteItemsResponse response = objectMapper.readValue(jsonExample, DeleteItemsResponse.class);
			return Mono.just(response);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

}
