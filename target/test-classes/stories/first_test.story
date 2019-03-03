Scenario: User searches for colours via google search

Given user opens the <SE> search engine
When user searches for <search>
Then search results for colours is displayed

Examples:
|SE|search|
|google|colours|
|bing|pandas|
|ecosia|northern lights|