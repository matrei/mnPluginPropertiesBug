package my.app

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties('my')
class AppGroovyMicronautBean {
    String value1
    String value2
}
