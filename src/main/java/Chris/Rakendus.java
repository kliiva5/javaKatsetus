package Chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon(String eesnimi) {
        return "Ahoi!" + eesnimi;
    }
	@RequestMapping("/algus2")
	String rakenudsekirjeldusefunktsioon(){
		return "See veebirakendus on mõeldud oma ideede testimiseks";
	}
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4231);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar