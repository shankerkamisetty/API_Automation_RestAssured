package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(TestListener.class);
    private static final Logger failedTestLogger = LogManager.getLogger("FailedTestsLogger");

    @Override
    public void onStart(ITestContext context) {
        logger.info("Test Suite started");
    }

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Passed " + result.getMethod().getMethodName());
        logger.info("Description " + result.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test FAILED - {} \n Exception: {} \n {}",
                result.getName(),
                result.getThrowable().getMessage(),
                result.getThrowable());
        failedTestLogger.error("Test FAILED - {} \n Exception: {} \n {}",
                result.getName(),
                result.getThrowable().getMessage(),
                result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test Skipped!");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test Suite completed!");
    }
}
