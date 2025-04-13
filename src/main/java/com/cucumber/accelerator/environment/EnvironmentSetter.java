package com.cucumber.accelerator.environment;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class EnvironmentSetter {

    public Environment loadEnvironment(String env){
        Yaml yaml = new Yaml();
        Environment envSettings = null;
        try (InputStream inputStream = EnvironmentSetter.class.getClassLoader().getResourceAsStream("src\\test\\resources\\environment\\"+ env + "-envConfig.yaml")) {
            envSettings = yaml.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return envSettings;
    }

}
