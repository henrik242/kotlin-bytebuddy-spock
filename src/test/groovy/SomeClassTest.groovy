import spock.lang.Specification

class SomeClassTest extends Specification {

    def "should be able to mock SomeClass"() {
      given:
        def someMock = Mock(SomeClass)
        someMock.foo() >> "cheese"

      expect:
        someMock.foo() == "cheese"
    }

    def "should be able to read initialized fields from mock"() {
      given:
        def someMock = Mock(SomeClass)

      expect:
        someMock.cheese == "brie"
    }

}
