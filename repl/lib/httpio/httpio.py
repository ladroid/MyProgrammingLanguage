from http.server import HTTPServer, BaseHTTPRequestHandler
import os

class SimpleHTMLMaker:
    def make_dir(self, path):
        pathing = path + "html/"
        try:
            os.makedirs(os.path.dirname(pathing))
        except OSError:
            print ("Creation of the directory %s failed" % pathing)
        else:  
            print ("Successfully created the directory %s " % pathing)

    def make(self):
        s = os.path.abspath(os.path.join(os.getcwd(), '..'))
        s = os.path.abspath(os.path.join(s, '..'))
        s = os.path.abspath(os.path.join(s, '..'))
        rootdir = s + "/html/index.html"
        with open(rootdir) as f:
            return f.read()

class SimpleHTTPRequest(BaseHTTPRequestHandler):
    html_maker = SimpleHTMLMaker()

    def _set_headers(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()

    def do_HEAD(self):
        self._set_headers()

    def do_GET(self):
        self._set_headers()
        self.wfile.write(bytes(self.html_maker.make(), "utf-8"))

    def do_POST(self):
        self._set_headers()
        self.wfile.write(b"<html><body><h1>POST!</h1></body></html>")

def run():
    try:
        print("Start server...")
        httpstart = HTTPServer(('localhost', 8000), SimpleHTTPRequest)
        httpstart.serve_forever()
    except KeyboardInterrupt:
        print("\nShut down server...")
        httpstart.socket.close()