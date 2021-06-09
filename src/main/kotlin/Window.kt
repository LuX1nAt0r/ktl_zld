import java.awt.Color
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.*
import javax.swing.SwingConstants.LEADING

class Window(title: String) : JFrame(){

    init {
        createUI(title)
    }

    private fun createUI(title: String){

        val stdCols = arrayOf<Color>(
            Color.BLACK, Color.BLUE, Color.CYAN,
            Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
            Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
        )

        val labels = stdCols.map {
            JLabel("",null, LEADING).apply {
                minimumSize = Dimension(90, 40)
                background = it
                isOpaque = true
            }
        }


        createLayout(labels)




        setTitle(title)

        defaultCloseOperation= JFrame.EXIT_ON_CLOSE
        setLocationRelativeTo(null)

    }

    private fun createLayout(labels: List<JLabel>){
        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true
        gl.autoCreateGaps = true

        gl.setHorizontalGroup(gl.createParallelGroup()
            .addGroup(gl.createSequentialGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
            .addGroup(gl.createSequentialGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7]))
            .addGroup(gl.createSequentialGroup()
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
            .addComponent(labels[12])
        )

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGroup(gl.createParallelGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
            .addGroup(gl.createParallelGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7]))
            .addGroup(gl.createParallelGroup()
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
            .addComponent(labels[12])
        )
        pack()

    }



}



