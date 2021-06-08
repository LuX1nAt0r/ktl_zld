import java.awt.EventQueue
import javax.swing.*

class Window(title: String) : JFrame(){

    init {
        createUI(title)
    }

    private fun createUI(title: String){
        setTitle(title)

        defaultCloseOperation= JFrame.EXIT_ON_CLOSE
        setSize(300, 200)
        setLocationRelativeTo(null)

    }
}



private fun createAndShowGUI(){
    val frame = Window("Simple")
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::createAndShowGUI)
}