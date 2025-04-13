package com.cucumber.accelerator.environment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Environment {

    private String Browser;
    private String URL;
    private boolean Headless;
    private boolean Incognito;
    private boolean TakeScreenshots;
    private int PageLoad;
    private int ImplicitWait;


}
