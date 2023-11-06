package com.maiara.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.maiara.bookstoremanager.dto.BookDTO;
import com.maiara.bookstoremanager.entity.Book;

@Mapper //Faz instanciação de uma classe do tipo da interface, faz a transferência dos dados
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDto(Book book);
    
}
