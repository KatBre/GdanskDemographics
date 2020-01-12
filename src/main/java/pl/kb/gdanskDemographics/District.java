package pl.kb.gdanskDemographics;

public class District {
    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenToFiftyNine;
    private Integer ageFromSixtyToSixtyFour;
    private Integer ageOverSixtyFive;

    public District(String districtName,
                    String gender,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenToFiftyNine,
                    Integer ageFromSixtyToSixtyFour,
                    Integer ageOverSixtyFive) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenToFiftyNine = ageFromEighteenToFiftyNine;
        this.ageFromSixtyToSixtyFour = ageFromSixtyToSixtyFour;
        this.ageOverSixtyFive = ageOverSixtyFive;
    }

}
