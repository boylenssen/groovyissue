package lenssen.boy

import spock.lang.Specification

def class GroovyIssueSpec extends Specification {

    def "some_test"() {
        when:
        def controller = 1

        then:
            controller == 1
    }
}