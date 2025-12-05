package com.example.demo.controller;

import com.example.demo.service.DefaultService;
import com.example.demo.mapper.DefaultMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import com.example.demo.dto.*;

@Slf4j
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class DefaultController {

	private final DefaultService service;
	private final DefaultMapper mapper;

	@GetMapping
	public Mono<GetItemsResponseDto> getItems() {
		return service.getItems().map(mapper::toGetItemsResponseDto);
	}

	@PostMapping
	public Mono<PostItemsResponseDto> postItems(@Valid @RequestBody PostItemsRequestDto requestDto) {
		return service.postItems(mapper.toPostItemsRequest(requestDto)).map(mapper::toPostItemsResponseDto);
	}

	@GetMapping("/{id}")
	public Mono<GetItemsResponseDto> getItems() {
		return service.getItems().map(mapper::toGetItemsResponseDto);
	}

	@PutMapping("/{id}")
	public Mono<PutItemsResponseDto> putItems(@Valid @RequestBody PutItemsRequestDto requestDto) {
		return service.putItems(mapper.toPutItemsRequest(requestDto)).map(mapper::toPutItemsResponseDto);
	}

	@PatchMapping("/{id}")
	public Mono<PatchItemsResponseDto> patchItems(@Valid @RequestBody PatchItemsRequestDto requestDto) {
		return service.patchItems(mapper.toPatchItemsRequest(requestDto)).map(mapper::toPatchItemsResponseDto);
	}

	@DeleteMapping("/{id}")
	public Mono<DeleteItemsResponseDto> deleteItems() {
		return service.deleteItems().map(mapper::toDeleteItemsResponseDto);
	}

}
