package ro.darch.demo.service;

import ro.darch.demo.model.GetRecommendationResponseBody200;

import java.util.List;

public interface RecommendationService {
    List<GetRecommendationResponseBody200> getRecommendation(String name,
                                                             String area,
                                                             String programmingLanguage,
                                                             String type);
}
