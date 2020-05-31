import java.util.concurrent.atomic.AtomicInteger

abstract class Animal(private var _name: String, private var _yearDiscovered: Int) {

    companion object {
        var lastId = AtomicInteger()
    }

    val id = lastId.incrementAndGet()

    var name
        get() = _name
        set(value) {_name=value}

    var yearDiscovered
        get() = _yearDiscovered
        set(value) {yearDiscovered = value}

    fun eat(): String {
        return "eat"
    }

    abstract fun move(): String
    abstract fun breath(): String
    abstract fun reproduce(): String

}