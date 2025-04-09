
public class HTTP {
    private String httpMethode;
    private String url;
    private String[][] headers;
    private int headerCount;
    
    public HTTP(String httpMethode, String url) {
    	if(httpMethode.equalsIgnoreCase("GET") || httpMethode.equalsIgnoreCase("POST")) {
    		this.httpMethode=httpMethode.toUpperCase();
    	}else {
    		this.httpMethode = "GET";
    	}
    	this.url=url;
    	this.headers = new String[20][2];
    	this.headerCount = 0;
    }
    
    public boolean addHeader(String name, String value) {
    	if(headerCount < 20) {
    		headers[headerCount][0] = name;
            headers[headerCount][1] = value;
            headerCount++;
            return true; 
        }
        return false;
    	}
    
    @Override
    public String toString() {
        StringBuilder request = new StringBuilder();
        request.append(httpMethode).append(" ").append(url).append(" HTTP/1.0\r\n");

        for (int i = 0; i < headerCount; i++) {
            request.append(headers[i][0]).append(": ").append(headers[i][1]).append("\r\n");
        }

        return request.toString();
    }
    
    public static void main(String[] args) {
        // Örnek HTTP isteği
        HTTP request = new HTTP("GET", "http://www.google.de/index.html");
        request.addHeader("Content-Type", "text/html");
        request.addHeader("Content-Type", "text/html");
        request.addHeader("Content-Type", "text/html");
        request.addHeader("Content-Type", "text/html");
        // Çıktıyı yazdır
        System.out.println(request);
    }
    }

