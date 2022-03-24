#!/usr/bin/env bash

rm -rf ./out

docker run --rm \
    -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i local/openapi.yaml \
    -g kotlin \
    -o /local/out/kotlin

docker run --rm \
    -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i local/openapi.yaml \
    -g swift5 \
    -o /local/out/swift5