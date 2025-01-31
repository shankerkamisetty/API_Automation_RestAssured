package com.api.filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    /**
     * Filter the incoming request and response specifications and outgoing response.
     * You need to call {@link FilterContext#next(FilterableRequestSpecification, FilterableResponseSpecification)} when you're done otherwise the request will not be delivered.
     * It's of course possible to abort the filter chain execution by returning a {@link Response} directly.
     *
     * @param requestSpec  The incoming request spec
     * @param responseSpec The incoming response spec
     * @param ctx          The filter context. You need to call {@link FilterContext#next(FilterableRequestSpecification, FilterableResponseSpecification)} when you're done otherwise the request will not be delivered.
     * @return The response
     */
    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {

        logRequest(requestSpec); //to capture the request information intercept the request before sending to endpoint
        Response response = ctx.next(requestSpec, responseSpec); // after interception allow it to send the request
        logResponse(response);

        return response; //return the response back to the test for validations/assertions
    }

    public void logRequest(FilterableRequestSpecification requestSpec) {
        logger.info("BASE URI: " + requestSpec.getBaseUri());
        logger.info("Request URL: " + requestSpec.getURI());
        logger.info("Request Header: " + requestSpec.getHeaders());
        logger.info("Request Body: " + requestSpec.getBody());
    }

    public void logResponse(Response response) {
        logger.info("STATUS CODE: " + response.getStatusCode());
        logger.info("Response Header: " + response.getHeaders());
        logger.info("Response Body: " + response.getBody().prettyPrint());


    }
}
