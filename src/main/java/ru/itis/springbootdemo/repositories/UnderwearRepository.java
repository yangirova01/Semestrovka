package ru.itis.springbootdemo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itis.springbootdemo.models.Underwear;

public interface UnderwearRepository extends JpaRepository<Underwear, Long> {
    @Query("select underwear from Underwear underwear where" +
            "(:q = 'empty' or UPPER(underwear.name) like UPPER(concat('%', :q, '%')))" +
            "or UPPER(underwear.type) like UPPER(concat('%', :q, '%'))")
    Page<Underwear> search(String q, Pageable pageable);
}