package ro.darch.demo.service.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.darch.demo.entity.ResourceMatch;
import ro.darch.demo.model.GetRecommendationResponseBody200;
import ro.darch.demo.repository.ResourceRepository;
import ro.darch.demo.service.RecommendationService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecommendationServiceImpl implements RecommendationService {
    private final ResourceRepository resourceRepository;

    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);


    public List<GetRecommendationResponseBody200> getRecommendation(String name,
                                                                    String area,
                                                                    String programmingLanguage,
                                                                    String type) {
        List<ResourceMatch> resources = new ArrayList<>();
        if (name.isEmpty() && area.isEmpty() && programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findAll();
        } else if (!name.isEmpty() && area.isEmpty() && programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContaining(name);
        } else if (name.isEmpty() && !area.isEmpty() && programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByAreaIgnoreCaseContaining(area);
        } else if (name.isEmpty() && area.isEmpty() && !programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByProgrammingLanguageIgnoreCaseContaining(programmingLanguage);
        } else if (name.isEmpty() && area.isEmpty() && programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByTypeIgnoreCaseContaining(type);
        } else if (!name.isEmpty() && !area.isEmpty() && programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndAreaIgnoreCaseContaining(name, area);
        } else if (!name.isEmpty() && area.isEmpty() && !programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(name, programmingLanguage);
        } else if (!name.isEmpty() && area.isEmpty() && programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndTypeIgnoreCaseContaining(name, type);
        } else if (name.isEmpty() && !area.isEmpty() && !programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(area, programmingLanguage);
        } else if (name.isEmpty() && !area.isEmpty() && programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByAreaIgnoreCaseContainingAndTypeIgnoreCaseContaining(area, type);
        } else if (name.isEmpty() && area.isEmpty() && !programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(programmingLanguage, type);
        } else if (!name.isEmpty() && !area.isEmpty() && !programmingLanguage.isEmpty() && type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContaining(name, area, programmingLanguage);
        } else if (!name.isEmpty() && !area.isEmpty() && programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndAreaIgnoreCaseContainingAndTypeIgnoreCaseContaining(name, area, type);
        } else if (!name.isEmpty() && area.isEmpty() && !programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByNameIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(name, programmingLanguage, type);
        } else if (name.isEmpty() && !area.isEmpty() && !programmingLanguage.isEmpty() && !type.isEmpty()) {
            resources = resourceRepository.findByAreaIgnoreCaseContainingAndProgrammingLanguageIgnoreCaseContainingAndTypeIgnoreCaseContaining(area, programmingLanguage, type);
        }
        return resources.stream().map(res -> objectMapper.convertValue(res, GetRecommendationResponseBody200.class)).collect(Collectors.toList());
    }
}
