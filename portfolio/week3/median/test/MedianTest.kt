// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "when size=1"{
        val answer= median(listOf(1.0f))
        answer shouldBe (1.0f)
    }
    "when odd number of elements are there" {
        val answer = median(listOf(8.0f,9.0f,7.0f))
        answer shouldBe (8.0f)
    }
    "when even number of elements are there"{
        val answer = median(listOf(8.0f,9.0f,7.0f,6.0f))
        answer shouldBe (7.5f)
    }
    "when 2 elements are there"{
        val answer = median(listOf(8.0f,9.0f))
        answer shouldBe (8.5f)
    }
})
