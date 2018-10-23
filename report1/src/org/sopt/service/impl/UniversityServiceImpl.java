package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {
    @Override
    public University getByUniversityIdx(int getByUniversityIdx){
        final UniversityBuilder universityBuilder = new UniversityBuilder();
        final University University = universityBuilder
                .build();
        return University;
    }

}
