import geb.spock.GebReportingSpec

class GebishOrgSpec extends GebReportingSpec {

    def "can get to the current Book of Geb"() {
        when:
        to FrameHomePage

        then: 
        at FrameHomePage

    }
}
