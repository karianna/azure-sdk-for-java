// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The DockerBuildRequest model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DockerBuildRequest")
@Fluent
public final class DockerBuildRequest extends RunRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DockerBuildRequest.class);

    /*
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /*
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /*
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /*
     * The Docker file path relative to the source location.
     */
    @JsonProperty(value = "dockerFilePath", required = true)
    private String dockerFilePath;

    /*
     * The name of the target build stage for the docker build.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The collection of override arguments to be used when executing the run.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /*
     * Run timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /*
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "platform", required = true)
    private PlatformProperties platform;

    /*
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "agentConfiguration")
    private AgentProperties agentConfiguration;

    /*
     * The URL(absolute or relative) of the source context. It can be an URL to
     * a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     */
    @JsonProperty(value = "sourceLocation")
    private String sourceLocation;

    /*
     * The properties that describes a set of credentials that will be used
     * when this run is invoked.
     */
    @JsonProperty(value = "credentials")
    private Credentials credentials;

    /**
     * Get the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @return the imageNames value.
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @return the isPushEnabled value.
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value.
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the dockerFilePath property: The Docker file path relative to the source location.
     *
     * @return the dockerFilePath value.
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the dockerFilePath property: The Docker file path relative to the source location.
     *
     * @param dockerFilePath the dockerFilePath value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the target property: The name of the target build stage for the docker build.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The name of the target build stage for the docker build.
     *
     * @param target the target value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the arguments property: The collection of override arguments to be used when executing the run.
     *
     * @return the arguments value.
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: The collection of override arguments to be used when executing the run.
     *
     * @param arguments the arguments value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the timeout property: Run timeout in seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Run timeout in seconds.
     *
     * @param timeout the timeout value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run has to happen.
     *
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run has to happen.
     *
     * @param platform the platform value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the sourceLocation property: The URL(absolute or relative) of the source context. It can be an URL to a tar
     * or git repository. If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     *
     * @return the sourceLocation value.
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the sourceLocation property: The URL(absolute or relative) of the source context. It can be an URL to a tar
     * or git repository. If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     *
     * @param sourceLocation the sourceLocation value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @return the credentials value.
     */
    public Credentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @param credentials the credentials value to set.
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dockerFilePath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dockerFilePath in model DockerBuildRequest"));
        }
        if (arguments() != null) {
            arguments().forEach(e -> e.validate());
        }
        if (platform() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property platform in model DockerBuildRequest"));
        } else {
            platform().validate();
        }
        if (agentConfiguration() != null) {
            agentConfiguration().validate();
        }
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
