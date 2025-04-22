package com.peluqueria;

import org.junit.platform.suite.api.*;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@ConfigurationParameters({
        @ConfigurationParameter(
                key = GLUE_PROPERTY_NAME,
                value = "com.peluqueria.steps"
        ),
        @ConfigurationParameter(
                key = FEATURES_PROPERTY_NAME,
                value = "classpath:com/peluqueria"
        )

})
public class RunCucumberTest {}