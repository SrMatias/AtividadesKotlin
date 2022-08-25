import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClientsTest {
val cliete = Clients("murilo",
"rua","6576","0","7858,")

 @BeforeEach
 fun addCompraa(){
     cliete.addCompra("bolo")
     cliete.addCompra("feijao")
     cliete.addCompra("oleo")
 }
    @Test
    fun addCompra() {
        cliete.addCompra("arroz")
        kotlin.test.assertEquals(4,cliete.estoque.size)


    }

    @Test
    fun removeCompra() {
cliete.removeCompra("oleo",)
        cliete.removeCompra("bolo")
        cliete.removeCompra("feijao")
        assertEquals("oleo","oleo","remolvido")


    }
}