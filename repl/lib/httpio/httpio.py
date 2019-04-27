from http.server import HTTPServer, BaseHTTPRequestHandler

class SimpleHTTPRequest(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.end_headers()
        self.wfile.write(b'Hello, world!')

httpstart = HTTPServer(('localhost', 8000), SimpleHTTPRequest)
httpstart.serve_forever()