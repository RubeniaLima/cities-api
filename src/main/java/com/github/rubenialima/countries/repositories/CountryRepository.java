package com.github.rubenialima.countries.repositories;

import com.github.rubenialima.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
