package com.pluralsight.pension.setup;

public class BackgroundCheckResults {

    private final String riskProfile;
    private final long upperAccountLimit;

    public BackgroundCheckResults(String riskProfile, long upperAccountLimit) {
        this.riskProfile = riskProfile;
        this.upperAccountLimit = upperAccountLimit;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public long getUpperAccountLimit() {
        return upperAccountLimit;
    }
}
