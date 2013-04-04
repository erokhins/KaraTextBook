package net.intellij.erokhins.kara.textbook.views

import kara.views.HtmlLayout
import kara.views.ActionContext
import kara.views.HtmlView
import net.intellij.erokhins.kara.textbook.styles.MainStyle1


/**
* @author Stanislav Erokhin
*/

public class TextBookLayout() : HtmlLayout() {

    override fun render(context: ActionContext, mainView: HtmlView) {
        head {
            title("TextBook")
            stylesheet(MainStyle1())
        }
        body {
            div(id = "mainDiv") {
                renderView(context, mainView);
            }
        }
    }
}