package com.example.pime3app
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomDrawingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint()
    private var circleColor = Color.BLACK
    private var circleRadius = 100f
    private var centerX = 0f
    private var centerY = 0f

    init {
        paint.color = circleColor
        paint.isAntiAlias = true
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        centerX = w / 2f
        centerY = h / 2f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(centerX, centerY, circleRadius, paint)
    }

    // Métodos para modificar a cor e o raio do círculo

    fun setCircleAttributes(color: Int = Color.RED, radius: Float = 100f){
        circleColor = color
        paint.color = circleColor

        circleRadius = radius
        invalidate() // Solicita uma nova renderização
    }
}