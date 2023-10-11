package com.mju.management.domain.post.controller.response;

import com.mju.management.domain.post.domain.Post;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponse {

    @Schema(description = "게시글 id")
    private Long id;

    @Schema(description = "진행현황")
    private boolean status;

    @Schema(description = "게시글 제목")
    private String title;

    @Schema(description = "작성자")
    private String userName;

    @Schema(description = "시작일")
    private String startDate;

    public static PostResponse from(Post post){
        return PostResponse.builder()
                .id(post.getId())
//                .status()
                .title(post.getTitle())
//                .userName()
//                .startDate()
                .build();
    }
}
