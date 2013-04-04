package net.intellij.erokhins.kara.textbook.styles

import kara.styles.*

/**
* @author Stanislav Erokhin
*/

class MainStyle1() : Stylesheet() {
    override fun render() {
        body {
            backgroundColor = c("#eee")
            padding = box(10.px)
        }
        id("mainDiv") {
            minHeight = 400.px
            backgroundColor = c("#fff")
            boxShadown = shadow(15);
            borderRadius = 10.px
            padding = box(1.px, 10.px)
            h1 {
                textAlign = TextAlign.center
            }
        }
    }
}