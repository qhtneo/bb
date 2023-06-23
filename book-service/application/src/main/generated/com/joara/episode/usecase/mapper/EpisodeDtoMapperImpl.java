package com.joara.episode.usecase.mapper;

import com.joara.book.domain.model.episode.Episode;
import com.joara.episode.usecase.dto.EpisodeCommandDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-23T15:52:34+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class EpisodeDtoMapperImpl implements EpisodeDtoMapper {

    @Override
    public Episode from(EpisodeCommandDto.EpisodeCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Episode.EpisodeBuilder episode = Episode.builder();

        episode.epiTitle( dto.epiTitle() );
        episode.content( dto.content() );
        episode.quote( dto.quote() );
        episode.cover( dto.cover() );

        return episode.build();
    }
}
