package my.plugin

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import groovy.transform.CompileStatic
import grails.plugins.metadata.*
import org.springframework.context.annotation.ComponentScan

@CompileStatic
@PluginSource
@ComponentScan(basePackages = 'my.plugin')
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
