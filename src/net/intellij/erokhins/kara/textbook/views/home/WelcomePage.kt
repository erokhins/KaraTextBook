package net.intellij.erokhins.kara.textbook.views.home

import kara.views.HtmlView
import kara.views.ActionContext

/**
* @author Stanislav Erokhin
*/

class WelcomePage() : HtmlView() {

    override fun render(context: ActionContext) {
        h1 {
            +"Welcome to TextBook!"
        }

    }

}