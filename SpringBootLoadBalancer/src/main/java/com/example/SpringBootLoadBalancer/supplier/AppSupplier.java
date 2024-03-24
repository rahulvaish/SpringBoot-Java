package com.example.SpringBootLoadBalancer.supplier;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;
import org.springframework.cloud.client.ServiceInstance;
import java.util.List;
import java.util.Arrays;

public class AppSupplier implements ServiceInstanceListSupplier {
    private final String serviceId;

    public AppSupplier(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Arrays
                .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8071, false),
                        new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8072, false)));
    }
}