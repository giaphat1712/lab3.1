package giaphat.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import giaphat.lab3.entity.Book;
@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {
}
