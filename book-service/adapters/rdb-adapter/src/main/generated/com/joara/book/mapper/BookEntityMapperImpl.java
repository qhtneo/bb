package com.joara.book.mapper;

import com.joara.book.domain.model.BookReadModels;
import com.joara.book.domain.model.book.Book;
import com.joara.book.entity.BookEntity;
import com.joara.book.projection.BookQueryProjections;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-23T15:52:36+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class BookEntityMapperImpl implements BookEntityMapper {

    @Override
    public Book toDomain(BookEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.id( arg0.getId() );
        book.memberId( arg0.getMemberId() );
        book.genreId( arg0.getGenreId() );
        book.genreKor( arg0.getGenreKor() );
        book.nickname( arg0.getNickname() );
        book.title( arg0.getTitle() );
        book.description( arg0.getDescription() );
        book.coverUrl( arg0.getCoverUrl() );
        book.status( arg0.getStatus() );
        book.totalViewCount( arg0.getTotalViewCount() );
        book.totalHeartCount( arg0.getTotalHeartCount() );
        book.favorCount( arg0.getFavorCount() );
        book.createdAt( arg0.getCreatedAt() );
        book.updatedAt( arg0.getUpdatedAt() );
        book.deletedAt( arg0.getDeletedAt() );
        book.score( arg0.getScore() );

        return book.build();
    }

    @Override
    public BookEntity toEntity(Book arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookEntity.BookEntityBuilder bookEntity = BookEntity.builder();

        bookEntity.memberId( arg0.memberId );
        bookEntity.genreId( arg0.genreId );
        bookEntity.genreKor( arg0.genreKor );
        bookEntity.nickname( arg0.nickname );
        bookEntity.title( arg0.title );
        bookEntity.description( arg0.description );
        bookEntity.coverUrl( arg0.coverUrl );
        bookEntity.status( arg0.status );
        bookEntity.totalViewCount( arg0.totalViewCount );
        bookEntity.totalHeartCount( arg0.totalHeartCount );
        bookEntity.favorCount( arg0.favorCount );
        bookEntity.createdAt( arg0.createdAt );
        bookEntity.updatedAt( arg0.updatedAt );
        bookEntity.deletedAt( arg0.deletedAt );
        bookEntity.score( arg0.score );

        return bookEntity.build();
    }

    @Override
    public BookReadModels.BookListViewReadModel toReadModel(BookQueryProjections.BookListViewProjection projection) {
        if ( projection == null ) {
            return null;
        }

        BookReadModels.BookListViewReadModel.BookListViewReadModelBuilder bookListViewReadModel = BookReadModels.BookListViewReadModel.builder();

        bookListViewReadModel.genreName( projection.genreKor() );
        bookListViewReadModel.id( projection.id() );
        bookListViewReadModel.genreId( projection.genreId() );
        bookListViewReadModel.nickname( projection.nickname() );
        bookListViewReadModel.title( projection.title() );
        bookListViewReadModel.coverUrl( projection.coverUrl() );

        return bookListViewReadModel.build();
    }
}
