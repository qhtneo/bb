package com.joara.episode.mapper;

import com.joara.book.domain.model.episode.Episode;
import com.joara.episode.entity.EpisodeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-23T18:00:34+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class EpisodeEntityMapperImpl implements EpisodeEntityMapper {

    @Override
    public Episode toDomain(EpisodeEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Episode.EpisodeBuilder episode = Episode.builder();

        episode.id( arg0.getId() );
        episode.bookId( arg0.bookId );
        episode.memberId( arg0.memberId );
        episode.bookTitle( arg0.bookTitle );
        episode.nickname( arg0.nickname );
        episode.epiTitle( arg0.epiTitle );
        episode.content( arg0.content );
        episode.quote( arg0.quote );
        episode.cover( arg0.cover );
        episode.heartCount( arg0.heartCount );
        episode.viewCount( arg0.viewCount );
        episode.commentCount( arg0.commentCount );
        episode.status( arg0.status );
        episode.createdAt( arg0.createdAt );
        episode.updatedAt( arg0.updatedAt );
        episode.deletedAt( arg0.deletedAt );

        return episode.build();
    }

    @Override
    public EpisodeEntity toEntity(Episode arg0) {
        if ( arg0 == null ) {
            return null;
        }

        EpisodeEntity.EpisodeEntityBuilder episodeEntity = EpisodeEntity.builder();

        episodeEntity.bookId( arg0.bookId );
        episodeEntity.memberId( arg0.memberId );
        episodeEntity.bookTitle( arg0.bookTitle );
        episodeEntity.nickname( arg0.nickname );
        episodeEntity.epiTitle( arg0.epiTitle );
        episodeEntity.content( arg0.content );
        episodeEntity.quote( arg0.quote );
        episodeEntity.cover( arg0.cover );
        episodeEntity.viewCount( arg0.viewCount );
        episodeEntity.heartCount( arg0.heartCount );
        episodeEntity.commentCount( arg0.commentCount );
        episodeEntity.status( arg0.status );
        episodeEntity.createdAt( arg0.createdAt );
        episodeEntity.updatedAt( arg0.updatedAt );
        episodeEntity.deletedAt( arg0.deletedAt );

        return episodeEntity.build();
    }

    @Override
    public List<Episode> toDomainList(List<EpisodeEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Episode> list = new ArrayList<Episode>( entityList.size() );
        for ( EpisodeEntity episodeEntity : entityList ) {
            list.add( toDomain( episodeEntity ) );
        }

        return list;
    }

    @Override
    public List<Episode> toEntityList(List<EpisodeEntity> domainList) {
        if ( domainList == null ) {
            return null;
        }

        List<Episode> list = new ArrayList<Episode>( domainList.size() );
        for ( EpisodeEntity episodeEntity : domainList ) {
            list.add( toDomain( episodeEntity ) );
        }

        return list;
    }
}
