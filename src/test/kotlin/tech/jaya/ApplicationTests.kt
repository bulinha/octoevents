package tech.jaya

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.postForObject
import org.springframework.test.context.junit4.SpringRunner

//@ExtendWith(SpringExtension::class)
//@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests{

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate


    @Test
    fun testWebhook(){
        //testRestTemplate.postForObject<>()
    }

}