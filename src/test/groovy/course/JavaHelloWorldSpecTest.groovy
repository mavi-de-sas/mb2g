package course

import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {
    def "GetHello"() {
        when:
        def foo = "123"
        println "=====Spock"
        then:
        true
    }
}
