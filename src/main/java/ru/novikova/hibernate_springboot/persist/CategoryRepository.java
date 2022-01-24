package ru.novikova.hibernate_springboot.persist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<ru.novikova.hibernate_springboot.persist.Category, Long> {
}
