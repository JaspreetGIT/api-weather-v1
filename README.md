***********************************************************************************************************************************
Project Title: Weather API 
Repository Access: https://github.com/JaspreetGIT/api-weather-v1.git  

***********************************************************************************************************************************
Postman Collection Import URL: https://www.getpostman.com/collections/19692830ce6c4a1fcc95

***********************************************************************************************************************************
-About the Code and how to run it:
1. Clone the repository from github link mentioned above 
2. Import the project via pom.xml settings in anypoint studio
3. Deploy the code on local machine.
4. Make the API call using Postman ( Post man Link is provided above)
***********************************************************************************************************************************

-Project Assumptions:
1. Input Json will be passed in same order as provided in the sample request
2. Response data for tempertaure/timezone/offset and datetime is fetched from the location provided in the request payload

***********************************************************************************************************************************
-Recomended Implementation needs to added
1. API can be published to cloudhub  
2. More MUnit/JUnit Tests can be included with few negative scenarios.
3. Security Policy can be applied to API to enforce Authorization.
4. Implementation need to be extended to support if items provided in request payload are in different order. 