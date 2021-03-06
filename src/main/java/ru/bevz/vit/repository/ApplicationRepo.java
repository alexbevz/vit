package ru.bevz.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bevz.vit.domain.Application;
import ru.bevz.vit.domain.User;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepo extends JpaRepository<Application, Long> {

    List<Application> getApplicationsByUserAndNameIsNotNullOrderByDtCreation(User user);

    Application findApplicationByUserAndNameIsNull(User user);

    Optional<Long> countApplicationsByUserAndNameIsNotNull(User user);

}
