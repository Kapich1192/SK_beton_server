#!/bin/bash

echo "---> GIT PULL"
git pull
echo "---> MAVEN PACKAGE"
mvn package
echo "---> START"
java -jar target/sk-beton-beta.jar


