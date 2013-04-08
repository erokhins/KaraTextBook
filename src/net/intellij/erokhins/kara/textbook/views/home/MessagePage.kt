package net.intellij.erokhins.kara.textbook.views.home

import kara.views.HtmlView
import kara.views.ActionContext
import net.intellij.erokhins.kara.textbook.routes.Home
import kara.controllers.DirectLink
import kara.views.FormMethod
import kara.views.InputType

/**
* @author erokhins
*/

class MessagePage(val login : String, val messages : List<String>) : HtmlView() {


    override fun render(context: ActionContext) {
        table {
            for (message in messages) {
                tr {
                   td {
                       +message
                   }
                }
            }
        }
        form(action = DirectLink("/textbook"), method = FormMethod.post) {
            textarea(name = "message")
            input(inputType = InputType.submit)
            input(inputType = InputType.hidden, name ="login", value = login);
        }
    }
}