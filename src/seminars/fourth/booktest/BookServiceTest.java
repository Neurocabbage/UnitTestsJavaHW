package seminars.fourth.booktest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.List;
import java.util.Arrays;

public class BookServiceTest {

    @Test
    void testGetBookById() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepository = Mockito.mock(BookRepository.class);

        // Настройка поведения мок-объекта
        Book expectedBook = new Book("1", "Book1", "Author1");
        Mockito.when(bookRepository.findById("1")).thenReturn(expectedBook);

        // Создание экземпляра BookService с использованием мок-объекта
        BookService bookService = new BookService(bookRepository);

        // Вызов метода findBookById()
        Book actualBook = bookService.findBookById("1");

        // Проверка результатов
        Assertions.assertEquals(expectedBook, actualBook);
    }

    @Test
    void testGetBookByIdNotFound() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepository = Mockito.mock(BookRepository.class);

        // Настройка поведения мок-объекта
        Mockito.when(bookRepository.findById("3")).thenReturn(null);

        // Создание экземпляра BookService с использованием мок-объекта
        BookService bookService = new BookService(bookRepository);

        // Вызов метода findBookById()
        Book actualBook = bookService.findBookById("3");

        // Проверка результатов - ожидается null
        Assertions.assertNull(actualBook);
    }

    @Test
    void testFindAllBooks() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);

        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        Mockito.when(bookRepository.findAll()).thenReturn(expectedBooks);
        BookService bookService = new BookService(bookRepository);
        List<Book> actualBooks = bookService.findAllBooks();
        Assertions.assertEquals(expectedBooks, actualBooks);
    }

}


