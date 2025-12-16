# Spring AI OpenAI & DeepSeek Integration
![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.8-brightgreen)
![Spring AI](https://img.shields.io/badge/Spring%20AI-1.1.1-orange)
![License](https://img.shields.io/badge/License-MIT-green)

A Spring Boot proof of concept (POC) demonstrating how to integrate multiple large language model (LLM) providers — **OpenAI** and **DeepSeek** — using **Spring AI**. This repository serves as a practical reference for building AI-powered applications with Spring Boot using a clean, multi-model configuration and REST-based chat APIs.

# Spring AI OpenAI & DeepSeek Integration

## Why This Project

As AI adoption grows in Java ecosystems, developers need clear examples of how to integrate modern LLM providers into Spring applications. This project shows how to:

* Use **Spring AI** with multiple LLM providers in a single application
* Configure **OpenAI** and **DeepSeek** chat models side by side
* Expose AI-powered chat functionality through REST APIs
* Switch or extend LLM providers with minimal configuration changes

This repository is ideal for developers looking for a **Spring AI OpenAI example**, **Spring Boot DeepSeek integration**, or a **multi-LLM Spring Boot reference project**.

---

## Features

* Spring Boot 3 application using Spring AI
* OpenAI and DeepSeek chat model integration
* Multi-model configuration using Spring beans
* REST API endpoints for chat interactions
* Externalized API key configuration via environment variables
* Simple and extensible project structure

---

## Tech Stack

* **Java 17+**
* **Spring Boot 3.5.8**
* **Spring AI 1.1.1**

    * OpenAI model starter
    * DeepSeek model starter
* **Apache Tomcat 10.1.49** (embedded)
* **Maven** for build and dependency management

---

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/ai/openai/
│   │       ├── OpenaiApplication.java
│   │       ├── configuration/
│   │       │   └── MultiModelConfiguration.java
│   │       └── controller/
│   │           └── ChatController.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/ai/openai/
            └── OpenaiApplicationTests.java
```

---

## Configuration

### Environment Variables

Set the following environment variables with your API keys:

```bash
# OpenAI API key
SPRING_AI_OPENAI_API_KEY=your_openai_api_key

# DeepSeek API key
SPRING_AI_DEEPSEEK_API_KEY=your_deepseek_api_key
```

### application.properties

You can also configure the API keys in `src/main/resources/application.properties`:

```properties
spring.ai.openai.api-key=${SPRING_AI_OPENAI_API_KEY}
spring.ai.deepseek.api-key=${SPRING_AI_DEEPSEEK_API_KEY}
```

---

## Running the Application

### Using Maven

```bash
mvn clean install
mvn spring-boot:run
```

### Using an IDE

Run the `OpenaiApplication` class directly from your IDE (IntelliJ IDEA, Eclipse, etc.).

The application will start on:

```
http://localhost:8080
```

---

## Available Chat Models

This application exposes two Spring-managed chat client beans:

1. **openAiChatClient** – Uses OpenAI chat models
2. **deepSeekChatClient** – Uses DeepSeek chat models

The active model can be selected or extended via configuration.

---

## API Endpoints

The `ChatController` exposes REST endpoints for interacting with the configured LLMs. These endpoints allow clients to send prompts and receive AI-generated responses.

Refer to the `ChatController` source code for endpoint paths and request/response formats.

---

## Testing

Run unit tests using:

```bash
mvn test
```

---

## Extending the Project

You can easily extend this project by:

* Adding more LLM providers supported by Spring AI
* Implementing streaming responses
* Adding prompt templates or memory
* Securing endpoints with Spring Security
* Building a UI on top of the REST APIs

---

## Resources

* Spring AI Documentation
* Spring Boot Documentation
* OpenAI API Documentation
* DeepSeek API Documentation

---

## License

This project is provided as a proof of concept for learning and experimentation purposes. It is released under the MIT License.
