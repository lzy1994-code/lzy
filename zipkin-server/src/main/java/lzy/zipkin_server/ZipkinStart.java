package lzy.zipkin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinStart {
 
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinStart.class, args);
	}

}
