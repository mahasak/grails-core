package org.grails.plugins.web.rest.plugin

import grails.util.GrailsUtil
import org.codehaus.groovy.grails.plugins.web.api.ControllersMimeTypesApi
import org.grails.plugins.web.rest.api.ControllersRestApi
import org.grails.plugins.web.rest.render.DefaultRendererRegistry

/**
 * @author Graeme Rocher
 */
class RestResponderGrailsPlugin {

    def version = GrailsUtil.getGrailsVersion()

    def doWithSpring = {
        instanceControllersRestApi(ControllersRestApi, new DefaultRendererRegistry(), ref("instanceControllersApi"), new ControllersMimeTypesApi())
    }

}