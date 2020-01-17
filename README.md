### Spring Security + JWT configurations 

1. Create `JwtUtil` class
2. Create classes for request/response -> `AuthenticationRequest` & `AuthenticationResponse`
3. Create '/authenticate' endpoint: take User ID + password -> return JWT as response
4. Intercept all incoming requests:
    - Extract JWT from the header
    - Validate and set in execution context
    
    
For demo run you have to sent POST request to:
    
    http://localhost:8081/authenticate
        
With 'Content-Type' = 'application/json' header & body:

    {
        "username": "foo",
        "password": "foo"
    }                

At response you will get JWT.

Access to:

    http://localhost:8081/hello
    
With 'Authorization' header = `Bearer ...jwt...`

Should return "Hello world".    