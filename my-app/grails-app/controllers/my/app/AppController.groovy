package my.app

import my.plugin.PluginGroovyMicronautBean
import my.plugin.PluginGroovySpringBean
import my.plugin.PluginJavaMicronautBean
import org.springframework.beans.factory.annotation.Autowired

class AppController {

    PluginGroovySpringBean pluginGroovySpringBean
    @Autowired PluginGroovyMicronautBean pluginGroovyMicronautConfigBean
    @Autowired PluginJavaMicronautBean pluginJavaMicronautConfigBean
    @Autowired AppGroovyMicronautBean appGroovyMicronautConfigBean

    def index() {
        render """
            <pre>
                <b>Plugin Spring Bean - my.value1:</b> ${pluginGroovySpringBean.value1}
                <b>Plugin Spring Bean - my.value2:</b> ${pluginGroovySpringBean.value2}
                <br>
                <b>Plugin Groovy Micronaut Bean - my.value1:</b> ${pluginGroovyMicronautConfigBean.value1}
                <b>Plugin Groovy Micronaut Bean - my.value2:</b> ${pluginGroovyMicronautConfigBean.value2}
                <br>
                <b>Plugin Java Micronaut Bean - my.value1:</b> ${pluginJavaMicronautConfigBean.value1}
                <b>Plugin Java Micronaut Bean - my.value2:</b> ${pluginJavaMicronautConfigBean.value2}
                <br>
                <b>App Groovy Micronaut Bean - my.value1:</b> ${appGroovyMicronautConfigBean.value1}
                <b>App Groovy Micronaut Bean - my.value2:</b> ${appGroovyMicronautConfigBean.value2}
            </pre>
        """.stripIndent()
    }
}