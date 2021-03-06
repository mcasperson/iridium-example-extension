#!/bin/bash

ALIAS=iridium
PASSWORD=password
JAR=iridium-example-extension.jar

./gradlew clean build --refresh-dependencies
keytool -genkey -noprompt -dname "CN=Auto and General, OU=Online Systems, O=Auto and General, L=Brisbane, S=Queensland, C=AU" -alias ${ALIAS} -keyalg RSA -keystore keystore -keysize 2048 -storepass ${PASSWORD} -keypass ${PASSWORD} -validity 3650
jarsigner -keystore keystore -storepass password -keypass ${PASSWORD} build/libs/${JAR} ${ALIAS}
rm keystore
