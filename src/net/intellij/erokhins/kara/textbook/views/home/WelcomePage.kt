package net.intellij.erokhins.kara.textbook.views.home

import kara.views.HtmlView
import kara.views.ActionContext
import kara.controllers.Link
import net.intellij.erokhins.kara.textbook.styles.FormClassStyle
import kara.controllers.DirectLink
import kara.views.FormMethod
import kara.views.InputType

/**
* @author Stanislav Erokhin
*/

class WelcomePage() : HtmlView() {

    override fun render(context: ActionContext) {
        h1 {
            +"Welcome to TextBook!"
        }
        form(FormClassStyle(), "form", DirectLink("/textbook"), FormMethod.get) {
            +"Enter login:"
            input(inputType = InputType.text, name = "login")
            input(inputType = InputType.submit, value = "Ok")
        }
    }

}