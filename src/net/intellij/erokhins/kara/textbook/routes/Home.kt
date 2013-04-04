
package net.intellij.erokhins.kara.textbook.routes

import net.intellij.erokhins.kara.textbook.views.*
import net.intellij.erokhins.kara.textbook.views.home.*
import kara.controllers.*

object Home {
    val layout2 = DefaultLayout()
    Get("/") class Index() : Request({
        IndexView()
    })

    val layout = TextBookLayout()

    Get("/textbook") class TextBook() : Request({
        WelcomePage()
    })

}

