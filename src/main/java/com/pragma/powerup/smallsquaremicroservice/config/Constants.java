package com.pragma.powerup.smallsquaremicroservice.config;

public class Constants {
    //response key
    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String DESCRIPTION_MESSAGE_KEY = "http 200 type messages";
    public static final String DESCRIPTION_MESSAGE_BOOLEAN_KEY = "true for http 200 message types and false for http 400 message types";
    public static final String DESCRIPTION_ERROR_KEY = "http 400 type messages";
    //response code 200
    public static final String RESTAURANT_CREATED_MESSAGE = "Restaurant created successfully";
    public static final String ORDER_CREATED_MESSAGE = "Order created successfully";
    public static final String CATEGORY_CREATED_MESSAGE = "Category created successfully";
    public static final String DISH_CREATED_MESSAGE = "Dish created successfully";
    public static final String DISH_UPDATE_MESSAGE = "Dish Update successfully";
    public static final String ASSIGN_RESTAURANT_EMPLOYEE = "assign restaurant an employee";
    //response code 400
    public static final String INVALID_PHONE = "A restaurant has an invalid phone number";
    public static final String INVALID_NAME = "A restaurant has an invalid name";
    public static final String INVALID_NIT = "A restaurant has an invalid nit";
    public static final String INVALID_USER = "An invalid person";
    public static final String INVALID_RANGE = "You must enter numbers greater than 0";
    public static final String WRONG_CREDENTIALS_MESSAGE = "Wrong credentials";
    public static final String NIT_ALREADY_EXISTS_MESSAGE = "A restaurant with that nit already exists";
    public static final String PHONE_ALREADY_EXISTS_MESSAGE = "A restaurant with that phone already exists";
    public static final String CATEGORY_NOT_FOUND = "A category not found";
    public static final String DUPLICATE_VALUE = "a value is already registered in the database";
    //swagger
    public static final String SWAGGER_TITLE_MESSAGE = "User API Pragma Power Up";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "Small square microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "2.0.4";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "https://springdoc.org/v2/";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";
    public static final String SWAGGER_RESTAURANT_ERROR = "Problems registering a restaurant";
    public static final String SWAGGER_DISH_ERROR = "Problems creating a dish";
    public static final String SWAGGER_CATEGORY_ERROR = "Problems creating a category";
    public static final String SWAGGER_ORDER_ERROR = "Problems creating a order";
    public static final String SWAGGER_ASSIGN_RESTAURANT_EMPLOYEE_ERROR = "Problems assign restaurant an employee";
    private Constants() {
        throw new IllegalStateException("Utility class");
    }


}
