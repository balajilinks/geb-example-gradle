
import geb.Module


class FrameModule extends Module {

    static content = {
        bannerFrame { $("frame", name: 'banner') }
        navigationFrame { $("frame", name: 'nav') }
        contentFrame { $("frame", name: 'content') }

        pageTitle {
            withFrame(bannerFrame) {
                $("b").text()
            }
        }
    }

}
