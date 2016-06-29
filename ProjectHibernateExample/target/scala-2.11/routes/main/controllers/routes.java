
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mahendra/ProjectHibernateExample/conf/routes
// @DATE:Wed Jun 29 10:12:16 IST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHibernateTest HibernateTest = new controllers.ReverseHibernateTest(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHibernateTest HibernateTest = new controllers.javascript.ReverseHibernateTest(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
