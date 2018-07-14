package hello;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {
    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        customizePort(tomcat);
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private void customizePort(TomcatServletWebServerFactory tomcat) {
        TomcatConnectorCustomizer a = new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                connector.setPort(9000);
            }
        };
        tomcat.addConnectorCustomizers(a);
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(443);
        return connector;
    }
}
