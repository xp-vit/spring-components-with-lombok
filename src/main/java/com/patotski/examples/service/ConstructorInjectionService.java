package com.patotski.examples.service;

import com.patotski.examples.service.injected.FirstService;
import com.patotski.examples.service.injected.SecondService;
import com.patotski.examples.service.injected.ThirdService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionService {

    private FirstService firstService;
    private SecondService secondService;
    private ThirdService thirdService;

    public ConstructorInjectionService(FirstService firstService,
                                       SecondService secondService,
                                       ThirdService thirdService) {
        this.firstService = firstService;
        this.secondService = secondService;
        this.thirdService = thirdService;
    }
}
