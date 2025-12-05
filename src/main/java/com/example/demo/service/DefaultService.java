package com.example.demo.service;

import reactor.core.publisher.Mono;
import com.example.demo.model.*;

public interface DefaultService {

	Mono<GetItemsResponse> getItems();

	Mono<PostItemsResponse> postItems(PostItemsRequest request);

	Mono<GetItemsResponse> getItems();

	Mono<PutItemsResponse> putItems(PutItemsRequest request);

	Mono<PatchItemsResponse> patchItems(PatchItemsRequest request);

	Mono<DeleteItemsResponse> deleteItems();

}
