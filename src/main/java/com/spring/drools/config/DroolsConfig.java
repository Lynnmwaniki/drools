package com.spring.drools.config;

import com.spring.drools.model.RiskScore;
import com.spring.drools.model.Transaction;
import org.codehaus.plexus.component.annotations.Configuration;
import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.api.builder.KieBuilder;
import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

//import org.kie.api.KieServices;
//import org.kie.api.builder.*;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.io.ResourceFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
//@Configuration
//public class DroolsConfig {
//
//    private KieServices kieServices = KieServices.Factory.get();
//
//    private KieFileSystem getKieFileSystem() throws IOException {
//        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource("transactions.xls.xlsx"));
//        return kieFileSystem;
//    }
//
//    @Bean
//    public KieContainer getKieContainer() throws IOException {
//        System.out.println("Container created...");
//        getKieRepository();
//        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
//        kb.buildAll();
//        KieModule kieModule = kb.getKieModule();
//        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//        return kieContainer;
//
//    }
//
//    private void getKieRepository() {
//        final KieRepository kieRepository = kieServices.getRepository();
//        kieRepository.addKieModule(new KieModule() {
//            public ReleaseId getReleaseId() {
//                return kieRepository.getDefaultReleaseId();
//            }
//        });
//    }
//
//    @Bean
//    public KieSession getKieSession() throws IOException {
//        System.out.println("session created...");
//        return getKieContainer().newKieSession();
//
//    }
//}
public class DroolsConfig {

    private KieServices kieServices=KieServices.Factory.get();


    @Bean
    public KieSession getKieSession(Resource dt) {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem()
                .write(dt);

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem)
                .buildAll();

        KieRepository kieRepository = kieServices.getRepository();

        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();

        KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);

        KieSession kieSession = kieContainer.newKieSession();

        return kieSession;
    }

    public String getDrlFromExcel(String path) {
        DecisionTableConfiguration configuration = KnowledgeBuilderFactory.newDecisionTableConfiguration();
        configuration.setInputType(DecisionTableInputType.XLS);

        Resource dt = ResourceFactory.newClassPathResource("com/spring/drools/rules/Transaction.xlsx", getClass());

        DecisionTableProviderImpl decisionTableProvider = new DecisionTableProviderImpl();

        String drl = decisionTableProvider.loadFromResource(dt, null);

        return drl;
    }
}
