package com.joara.episode.domain.model;

import com.joara.book.domain.model.book.type.BookStatus;
import lombok.Builder;

import java.time.OffsetDateTime;

public record EpisodeReadModels() {
    @Builder
    public record EpisodeListViewReadModel(
            Long bookId,
            String epiTitle,
            Long viewCount,
            Long heartCount,
            OffsetDateTime createdAt
    ) {}

}
