
package net.intellij.erokhins.kara.textbook.views.home

import kara.views.*

class IndexView() : HtmlView() {
    override fun render(context: ActionContext) {
        h2("Welcome to Kara")
p("Your app is up and running, now it's time to make something!")
p("Start by editing this file here: src/net/intellij/erokhins/kara/textbook/views/home/IndexView.kt")

    }
}

