# Belajar Spring Boot

**Urutan Belajar:**


    1. Inversion of Control (IoC) HelloWorldConfiguration.java
    2. Application Context ApplicationContextTest.java.
    3. Singleton Database.java, DatabaseTest.java
    4. Bean BeanConfiguration.java, BeanTest.java
    5. Duplicate Bean DuplicateBeanConfiguration.java, DuplicateBeanTest.java
    6. Primary Bean PrimaryBeanConfiguration. java, PrimaryBeanTest.java
    7. Change Bean name ChangeBeanNameConfiguration.java, ChangeBeaNameTest.java
    8. Depedency Injection (DI) DepedencyInjectionConfiguration.java, DepedencyInjectionTest.java
    9. Memilih depedency DepedencyInjectionConfiguration.java line 45 dst, DepedencyInjectionTest.java line 36, 39, 44, 45
    10. Circular Depedencies CyclcConfiguration.java, CyclicTest.java
    11. DependsOn DependsOnConfiguration.java, DependsOnTest.java
    12. Lazy bean DependsOnConfiguration.java line 27 -33, DependsOnTest.java line 24-25
    13. Scope ScopeConfiguration.java, ScopeTest.java
    14. Membuat Scope DoubletonScope.java, ScopeConfiguration.java line 39 dst, ScopeTest.java line 31 dst
    15. Life Cycle Connection.java, LifeCycleConfiguration.java, LifeCycleTest.java
    16. Life Cycle Annototation Server.java, LifeCycleConfiguration.java line 36 dst, LifeCycleTest.java line 33 dst
    17. Import MainConfiguration,java, FooConfiguration.java, BarConfiguration.java, ImportTest.java
    18. ComponentScan repo configuration, ScanConfiguration.java, ScanTest.java
    19. Component repo service, ProductService.java, ComponentConfiguration.java, ComponentTest.java
    20. Constructor-Based Depedency Injection repo service, ProductService.java line 15-38, repo repository, ProductRepository.java, ComponentConfiguration.java line 8, ComponentTest.java line 29-35
    21. Setter-based Depedency Injection repo service, CategoryService.java , repo repository, CategoryRepository.java, ComponentConfiguration.java, ComponentTest.java line 40-46
    22. Field-based Depedency Injection repo service, CustomerService.java , repo repository, CustomerRepository.java, ComponentConfiguration.java, ComponentTest.java line 49-55
    23. Qualifier repo configuration, CustomerConfiguration.java, CustomerRepository.java line 5 dihapus, CustomerService.java line 22-35, ComponentTest.java line 58-63
    24. Optional Depedency OptionalConfiguration.java, OptionalTest.java, repo data, MultiFoo.java, ComponentConfiguration.java line 16, FooConfiguration.java line 16 dst
    25. Factory Bean PaymentGatewayClient.java, PaymentGatewayClientFactoryBean.java, FactoryConfiguration.java, FactoryTest.java
    26. Inheritance MerchantService.java, MerchantServiceImpl.java, InheritanceConfiguration.java, InheritanceTest.java
    27. BeanFactory BeanFactoryTest.java
    28. Bean Post Processor IdAware.java, IdGeneratorBeanPostProcessor.java, Car.java, BeanPostProcessorTest.java
    29. Ordered IdAware.java line 7, IdGeneratorBeanPostProcessor.java implements Ordered line 18-27 , PrefixIdGeneratorBeanPostProcessor.java ,OrderedTest.java
    30. Aware AuthService.java, AwareTest.java
    31. BeanDefinitionRegistryPostProcessor FooBeanFactoryPostProcessor.java, BeanFactoryPostProcessorTest.java
    32. Event Listener LoginSuccesEvent.java, User.java, LoginSuccessListener.java, LoginAgainSuccessListener.java, UserService.java, EventListenerTest.java
    33. Event Listener Annotation UserListener.java, EventListenerTest.java
    34. SpringBootApplication FooApplication.java, FooApplicationTest.java
    35. StartUp Failure FooApplication.java, FooApplicationTest.java, WithoutSpringBootTest.java
    36. Costumizing Spring Application FooApplication.java line 46-61
    37. Spring Application Event AppStringListener.java, FooApplication.java line 60
    38. Command Line Runner CommandApplication.java, LogCommanLineRunner.java
    39. Application ruuner RunnerApplication.java, SimpleRunner.java
    40. SpringBoot Plugin MateriSpringBootPlugin.txt