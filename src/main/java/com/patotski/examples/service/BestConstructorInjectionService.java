package com.patotski.examples.service;

import com.patotski.examples.service.injected.FirstService;
import com.patotski.examples.service.injected.SecondService;
import com.patotski.examples.service.injected.ThirdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BestConstructorInjectionService {
    private final FirstService firstService;
    private final SecondService secondService;
    private final ThirdService thirdService;
}
