package io.geewit.core;


/**
 * 环境常量
 * @author geewit
 */
@SuppressWarnings({"unused"})
public interface Profiles extends org.springframework.core.env.Profiles {
    String DEVELOPMENT = "development";
    String INTEGRATION = "integration";
    String PREVIEW = "preview";
    String PRODUCTION = "production";

    org.springframework.core.env.Profiles PROFILES_DEVELOPMENT = org.springframework.core.env.Profiles.of(DEVELOPMENT);
    org.springframework.core.env.Profiles PROFILES_INTEGRATION = org.springframework.core.env.Profiles.of(INTEGRATION);
    org.springframework.core.env.Profiles PROFILES_PREVIEW = org.springframework.core.env.Profiles.of(PREVIEW);
    org.springframework.core.env.Profiles PROFILES_PRODUCTION = org.springframework.core.env.Profiles.of(PRODUCTION);

}
