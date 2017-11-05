package com.epages.restdocs.raml;

import java.util.Map;

import org.springframework.restdocs.operation.Operation;

public interface OperationHandler {

    Map<String, Object> generateModel(Operation operation, RamlResourceSnippetParameters parameters);
}
