import geb.Page

class FrameHomePage extends Page {
    static at = { trial.pageTitle == "Banner Frame"  }

    static content = {
        trial { module FrameModule }
    }
}
