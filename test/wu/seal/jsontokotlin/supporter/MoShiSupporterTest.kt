package wu.seal.jsontokotlin.supporter

import org.junit.Before
import org.junit.Test
import wu.seal.jsontokotlin.isTestModel

/**
 * 
 * Created by Seal.Wu on 2017/11/1.
 */
class MoShiSupporterTest {
    @Before
    fun setUp() {
        isTestModel = true
    }

    @Test
    fun getAnnotationImportClassString() {
        assert(MoShiSupporter.annotationImportClassString.isNotEmpty())
        assert(MoShiSupporter.annotationImportClassString.split("\n").size ==1)
    }

    @Test
    fun getJsonLibSupportPropertyBlockString() {
        val rawPropertyName = "seal is **() good_man "
        val type = "Boy"
        val block = MoShiSupporter.getJsonLibSupportPropertyBlockString(rawPropertyName, type)
        assert(block.contains(rawPropertyName))
        assert(block.contains(type))
    }

}