package ro.darch.demo.entity;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Resource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCustomCodegen", date = "2021-01-17T20:27:12.025+02:00")
@Entity
@Table(name = "resource_match")
@Data
public class ResourceMatch {

    private String name = null;

    private String area = null;

    private String programmingLanguage = null;

    private String type = null;

    private String description = null;


    @Id
    private String id = null;


    private String url = null;

}

