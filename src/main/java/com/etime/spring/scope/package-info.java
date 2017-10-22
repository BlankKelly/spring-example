/**
 * Created by huitailang on 2017/10/22.
 * Scope描述的是Spring容器如何新建Bean的实例的。Spring的Scope有以下几种，通过@Scope注解来实现。
 *
 * (1) Singleton：一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例。
 (2) Prototype：每次调用新建一个Bean的实例。
 (3) Request：Web项目中，给每一个http request新建一个bean实例。
 (4) Session：Web项目中，给每一个http session新建一个bean实例。
 (5) GlobalSession：这个只在portal应用中有用，给每一个global http session新建一个bean实例。
 另外，在Spring Batch中还有一个Scope是使用@StepScope，后面有时间写会说到。
 */
package com.etime.spring.scope;