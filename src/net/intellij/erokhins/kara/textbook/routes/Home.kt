
package net.intellij.erokhins.kara.textbook.routes

import net.intellij.erokhins.kara.textbook.views.*
import net.intellij.erokhins.kara.textbook.views.home.*
import kara.controllers.*
import java.util.ArrayList
import java.util.HashMap

class User(val login : String) {
    val messages : MutableList<String> = ArrayList<String>();

    fun addMessage(message : String) {
        messages.add(message);
    }
    fun getAllMessages(): List<String> {
        return messages : List<String>;
    }
}

object Home {
    val userMap : MutableMap<String, User> = HashMap<String, User>();
    val layout2 = DefaultLayout()

    Get("/") class Index() : Request({
        IndexView()
    })

    val layout = TextBookLayout()

    Get("/textbook") class TextBook(login : String?) : Request({
        if (login == null) {
            WelcomePage()
        } else {
            var user : User;
            var uncheckedUser = userMap.get(login);
            if (uncheckedUser == null) {
                user = User(login);
                userMap.put(login, user);
            } else {
                user = uncheckedUser as User;
            }
            MessagePage(login, user.getAllMessages());
        }
    })

    Post("/textbook") class MessageAddRequest(login : String, message : String) : Request({
        (userMap.get(login) as User).addMessage(message);
        redirect("/textbook?login=" + login)
    })

}

