#### SpringBootApplication integration with KeyCloack

##### Start KeyCloack Standalone Server:
<img width="1725" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/f2af7d7f-42f8-4376-85ad-c96fcaa96553">

Once the server is started:
- Create an admin account (admin | root)
- Master is default realm
- Create a new realm - myRealm
- Create a new user  (rahul | rahpassword)
- Create a new client - myClient
  
- Create two roles for realm - realm-user and realm-admin
- Create two roles for client - client-user and client-admin
- Map user(rahul) with client-user and client-admin 
- Map user(rahul) with realm-admin

________________________________________________________________________________________________
##### Get the Endpoint:
<img width="1726" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/274edc79-fccb-4fbe-85d3-e78418a779f9">

________________________________________________________________________________________________

##### Get the token:
<img width="1305" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/76ee193d-fe82-4481-bb48-a5551f170112">
________________________________________________________________________________________________

##### On decoding Token, we see the roles:
<img width="1402" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/c789b71f-0cc7-44c3-a915-effe0e569720">
________________________________________________________________________________________________

##### Try hitting the URL:
<img width="1347" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/a1800f57-b6bf-405f-a54a-14a43896003d">
________________________________________________________________________________________________
