package $package$.servlets

import org.scalatra.ScalatraServlet
import $package$.scalatra.TwirlSupport
import $package$.model.User

class DispatcherServlet extends ScalatraServlet with TwirlSupport {

  get("/") {
    val userToSave = User("test@test.com", "password", "Testy Testerson")
    User.save(userToSave)
    val testUser = User.fetchByEmail("test@test.com")
    html.welcome.render(testUser)
  }

}
