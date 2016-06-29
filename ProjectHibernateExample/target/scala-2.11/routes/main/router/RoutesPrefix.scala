
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mahendra/ProjectHibernateExample/conf/routes
// @DATE:Wed Jun 29 10:12:16 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
