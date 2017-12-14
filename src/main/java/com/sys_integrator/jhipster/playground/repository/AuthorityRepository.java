package com.sys_integrator.jhipster.playground.repository;

import com.sys_integrator.jhipster.playground.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
