package com.alhanoof.sdlc.governance.service;

import com.alhanoof.sdlc.governance.dto.ExecutiveDashboardDTO;
import org.springframework.stereotype.Service;

@Service
public class GovernanceService {

    public ExecutiveDashboardDTO getExecutiveDashboard() {

        Long requirements = 250L;
        Long stories = 420L;
        Long tests = 1800L;
        Long uat = 350L;
        Long releases = 42L;
        Long risks = 17L;

        double governanceScore = 96.5;

        return new ExecutiveDashboardDTO(
                requirements,
                stories,
                tests,
                uat,
                releases,
                risks,
                governanceScore
        );
    }
}
