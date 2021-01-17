package ro.darch.demo.configuration;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import lombok.Data;

@Component
@ConfigurationProperties
@Data
public class EnvironmentProperties {

}