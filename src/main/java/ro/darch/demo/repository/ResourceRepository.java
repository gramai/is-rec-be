package ro.darch.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.darch.demo.entity.ResourceMatch;

import java.util.List;


public interface ResourceRepository extends JpaRepository<ResourceMatch, String> {
    List<ResourceMatch> findByNameIgnoreCaseContaining(String name);

    List<ResourceMatch> findByAreaIgnoreCaseContaining(String area);

    List<ResourceMatch> findByProgrammingLanguageIgnoreCaseContaining(String programmingLanguage);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndAreaIgnoreCaseContaining(String name, String area);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(String name, String programmingLanguage);

    List<ResourceMatch> findByAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(String area, String programmingLanguage);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(String name, String area, String programmingLanguage);

    List<ResourceMatch> findByTypeIgnoreCaseContaining(String type);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndTypeIgnoreCaseContaining(String name, String type);

    List<ResourceMatch> findByAreaIgnoreCaseContainingAndTypeIgnoreCaseContaining(String area, String type);

    List<ResourceMatch> findByProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(String programmingLanguage, String type);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndAreaIgnoreCaseContainingAndTypeIgnoreCaseContaining(String name, String area, String type);

    List<ResourceMatch> findByNameIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(String name, String programmingLanguage, String type);

    List<ResourceMatch> findByAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(String area, String programmingLanguage, String type);
}
