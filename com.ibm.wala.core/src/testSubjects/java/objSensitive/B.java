/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package objSensitive;

/**
 *
 * @author genli
 * @version : B.java, v 0.1 2020年08月29日 8:34 下午 genli Exp $
 */
public class B {
  Object bar(Object v){
    C c = new C();
    return c.identity(v);
  }
}