#### Purpose:
Demonstrate simple Client and Server communication using `SocketServer` and `Socket`classes.

Here a simple protocol is defined which uses protobuf. The client reads in a json file and then creates a protobuf object from it to send it to the server. The server reads it and sends back the calculated result. 

The response is also a protobuf but only with a result string. 

To see the proto file see: src/main/proto which is the default location for proto files. 

Gradle is already setup to compile the proto files. 

### The procotol
You will see a response.proto and a request.proto file. You should implement these in your program. 
Protocol description
Request:
- NAME: a name is sent to the server, fields
	- name -- name of the player
	Response: GREETING, fields 
			- message -- greeting text from the server
- LEADER: client wants to get leader board
	- no further data
	Response: LEADER, fields 
			- leader -- repeated fields of Entry
- NEW: client wants to enter a game
	- no further data
	Response: TASK, fields
			- image -- current image as string
			- task -- current task for the cilent to solve
- ANSWER: client sent an answer to a server task
	- answer -- answer the client sent as string
	Response: TASK, fields 
			- image -- current image as string
			- task -- current task for the cilent to solve
			- eval -- true/false depending if the answer was correct
	OR
	Response: WON, fields
			- image -- competed image as string
- QUIT: clients wants to quit connection
	- no further data
	Response: BYE, fields 
		- message -- bye message from the server

Response ERROR: anytime there is an error you should send the ERROR response and give an appropriate message. Client should act appropriately
	- message

### How to run it (optional)
The proto file can be compiled using

``gradle generateProto``

This will also be done when building the project. 

You should see the compiled proto file in Java under build/generated/source/proto/main/java/buffers

Now you can run the client and server 

#### Default 
Server is Java
Per default on 9099
runServer

You have one example client in Java using the Protobuf protocol

Clients runs per default on 
host localhost, port 9099
Run Java:
	runClient


#### With parameters:
Java
gradle runClient -Pport=9099 -Phost='localhost'
gradle runServer -Pport=9099