package net.niiqa.clean_arc_example_java.integrations.api_client.helpers;

public @interface HttpMethod {
    String GET = "GET";
    String POST = "POST";
    String PUT = "PUT";
    String DELETE = "DELETE";
    String PATCH = "PATCH";
    String HEAD = "HEAD";
    String OPTIONS = "OPTIONS";

    String value();
}
