SpringBoot OAuth 2.0 implementation.
-  Go to Google Cloud Console.
- Go to Menu , APIs & Services -> Credentials -> Create New Project and Select created project
- Create Credentials -> Create OAuth Client ID -> Select Application tyope as Web Application -> Add Authorized JavaScript origins value as "http://localhost:8080" -> then Add Authorized redirect URIs value as "http://localhost:8080/login/oauth2/code/google" and then click on Save
- Click on Create Secret Key. Copy the Client ID and Secret key to application.yaml file
- Run application and test with google account 
  
