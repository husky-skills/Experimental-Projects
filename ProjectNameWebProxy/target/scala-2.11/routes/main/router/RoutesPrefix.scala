
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mahendra/ProjectNameWebProxy/conf/routes
// @DATE:Thu Jun 23 03:25:37 IST 2016


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
