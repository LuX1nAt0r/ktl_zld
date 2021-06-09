import java.awt.EventQueue



fun main(args: Array<String>) {
    EventQueue.invokeLater(::createAndShowGUI)
}


private fun createAndShowGUI(){
    val frame = Window("Simple")
    frame.isVisible = true
}





