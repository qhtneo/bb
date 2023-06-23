package com.joara.book.usecase.mapper;

import com.joara.book.domain.model.book.Book;
import com.joara.book.usecase.dto.BookCommandDto;
import com.joara.book.usecase.dto.BookQueryDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-23T15:52:33+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class BookDtoMapperImpl implements BookDtoMapper {

    @Override
    public Book from(BookCommandDto.BookCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.genreId( dto.genreId() );
        book.title( dto.title() );
        book.description( dto.description() );
        book.status( dto.status() );

        return book.build();
    }

    @Override
    public BookQueryDto.BookReadByOneResponseDto toBookReadByOneRequestDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookQueryDto.BookReadByOneResponseDto.BookReadByOneResponseDtoBuilder bookReadByOneResponseDto = BookQueryDto.BookReadByOneResponseDto.builder();

        bookReadByOneResponseDto.book( book );

        return bookReadByOneResponseDto.build();
    }
}
