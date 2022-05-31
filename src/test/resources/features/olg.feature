Feature: OLG HomePageTest
  Scenario: Open OLG HomePage and verify URL and Title
    Given OLG homeURL
    When Page title is properly verified
    When URL is properly verified
    Then The user should navigate to Sign Up

