package my.plugin

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.ConfigurationProperties

@CompileStatic
@ConfigurationProperties('my')
class PluginGroovyMicronautBean {
    String value1
    String value2
}
