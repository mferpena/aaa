package com.example.demo.mapper;

import com.example.demo.dto.*;
import com.example.demo.model.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DefaultMapper {

	GetItemsResponseDto toGetItemsResponseDto(GetItemsResponse model);

	PostItemsRequest toPostItemsRequest(PostItemsRequestDto dto);

	PostItemsResponseDto toPostItemsResponseDto(PostItemsResponse model);

	GetItemsResponseDto toGetItemsResponseDto(GetItemsResponse model);

	PutItemsRequest toPutItemsRequest(PutItemsRequestDto dto);

	PutItemsResponseDto toPutItemsResponseDto(PutItemsResponse model);

	PatchItemsRequest toPatchItemsRequest(PatchItemsRequestDto dto);

	PatchItemsResponseDto toPatchItemsResponseDto(PatchItemsResponse model);

	DeleteItemsResponseDto toDeleteItemsResponseDto(DeleteItemsResponse model);

}
