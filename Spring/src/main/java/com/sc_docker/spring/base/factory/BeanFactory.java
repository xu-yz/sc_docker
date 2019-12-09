package com.sc_docker.spring.base.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static java.lang.Class.forName;

//静态代码块只在类加载的时候执行一次。
// 单例，先实例化所有Bean，然后再取出
/**
 * 创建Bean对象的工厂
 */
public class BeanFactory {

//    1.定义一个properties对象
    private static Properties props;
    //定义一个Map,用于存放我们创建的对象，我们称之为容器
    private static Map<String,Object> beans = null;
//    2.使用静态代码块为props对象赋值
    static {
        try {
//            实例化对象
            props = new Properties();
//           获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
//            实例化容器
            beans = new HashMap<String, Object>();
//            取出配置文件中所有的Key
            Enumeration keys = props.keys();
//            遍历枚举
            while (keys.hasMoreElements()){
//                取出每个key
                String key = keys.nextElement().toString();
//                根据key获取value
                String beanPath = props.getProperty(key);
//                反射创建对象
                Object value = Class.forName(beanPath).newInstance();
//                把key和value存入容器中
                beans.put(key,value);
            }
         } catch (IOException e) {
             throw new ExceptionInInitializerError("初始化properties失败");
         } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
}

    /**
     * 根据Bean的名称获取Bean对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

//  最初的方法是多例，每次调用都创建了不同的对象
    /**
     * 创建Bean对象的工厂
     *
    public class BeanFactory {

        //    1.定义一个properties对象
        private static Properties props;
        //定义一个Map,用于存放我们创建的对象，我们称之为容器
        private static Map<String,Object> beans = null;
        //    2.使用静态代码块为props对象赋值
        static {
            try {
//            实例化对象
                props = new Properties();
//           获取properties文件的流对象
                InputStream in = com.sc_docker.spring.base.factory.BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
                props.load(in);
//            实例化容器
                beans = new HashMap<String, Object>();
//            取出配置文件中所有的Key
                Enumeration keys = props.keys();
//            遍历枚举
                while (keys.hasMoreElements()){
//                取出每个key
                    String key = keys.nextElement().toString();
//                根据key获取value
                    String beanPath = props.getProperty(key);
//                反射创建对象
                    Object value = Class.forName(beanPath).newInstance();
//                把key和value存入容器中
                    beans.put(key,value);
                }
            } catch (IOException e) {
                throw new ExceptionInInitializerError("初始化properties失败");
            }
        }

        /**
         * 根据Bean的名称获取Bean对象
         * @param beanName
         * @return
         *
        public static Object getBean(String beanName){
            Object bean = null;
            try {
                String beanPath = props.getProperty(beanName);
                bean = Class.forName(beanPath).newInstance();//每次都会调用默认构造函数创建对象
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return bean;
        }*/

}
