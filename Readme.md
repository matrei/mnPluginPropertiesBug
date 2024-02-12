# Grails Issue [11767](https://github.com/grails/grails-core/issues/11767)

## Description
This example application aims to show that Micronaut ConfigurationProperties beans are not able to read values from the plugin.yml file provided by a plugin.

This issue was closed by [11828](https://github.com/grails/grails-core/pull/11828) which is merged in Grails 6.1.2, but I still have the same problem. 

## Steps to Reproduce
```
./gradlew my-app:bootRun
```
Visit http://localhost:8080/app