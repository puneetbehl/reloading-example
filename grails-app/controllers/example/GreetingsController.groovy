package example

class GreetingsController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        respond(["message": "Hello! How are you doing?"])
    }
}
