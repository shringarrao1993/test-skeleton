Narrative:
In order to generate a skeleton project that requires the creation of the basic project structure
As a tester
I want to perform various searches, on different search engines

Scenario: User performs search on various browsers and verifies results

Given user opens the <SE> search engine
When user searches for <search>
Then the correct search results are displayed

Examples:
|SE|search|
|google|colours|
|bing|pandas|
|ecosia|rainforests|