package del.ac.id.demo.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PemesananRepository extends JpaRepository<Pemesanan, Long>{
	List<Pemesanan> findByid(int id);

}