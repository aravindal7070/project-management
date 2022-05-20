Feature: verify adactin login
Scenario: verify adactin login with valid credentials
Given user is on the adactin page
When user should enter "<username>","<password>"
And after successfull login user should enter "<location>","<hotelname>","<roomtype>","<roomnumber>","<checkin>","<checkout>","<adultroom>","<childroom>"
And after fillingup the itenary details user should enter "<firstname>","<lastname>","<address>","<creditcardnumber>","<creditcardtype>","<expirymonth>","<expiryyear>","<cvvnumber>"
Then user should verify the successful message 

Examples:

		|username|password|location|hotelname|roomtype|roomnumber|checkin|checkout|adultroom|childroom|firstname|lastname|address|creditcardnumber|creditcardtype|expirymonth|expiryyear|cvvnumber|	
		|ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
    |ARUNSK007|Goodarun007|Sydney|Hotel Sunshine|2|2|18/05/2022|19/05/2022|2|2|aravind|al|ecr|1234567890098765|VISA|January|2022|890|
                                                                                                                