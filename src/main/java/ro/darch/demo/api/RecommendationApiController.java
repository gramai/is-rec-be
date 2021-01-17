package ro.darch.demo.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import ro.darch.demo.model.GetRecommendationResponseBody200;
import ro.darch.demo.service.RecommendationService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCustomCodegen", date = "2021-01-17T19:13:55.210+02:00")
public class RecommendationApiController implements RecommendationApi {
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private final RecommendationService recommendationService;


    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<List<GetRecommendationResponseBody200>> getRecommendation(@ApiParam(value = "Name of the match") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Area of the Match") @Valid @RequestParam(value = "area", required = false) String area, @ApiParam(value = "Programming Language of the Match") @Valid @RequestParam(value = "programmingLanguage", required = false) String programmingLanguage, @ApiParam(value = "Type of the Match") @Valid @RequestParam(value = "type", required = false) String type) {
        return new ResponseEntity<>(recommendationService.getRecommendation(name,area, programmingLanguage, type), HttpStatus.OK);
    }

}
