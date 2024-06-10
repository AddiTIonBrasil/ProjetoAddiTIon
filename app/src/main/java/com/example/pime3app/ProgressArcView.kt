package com.example.pime3app

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.View

    class ProgressArcView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
    ) : View(context, attrs, defStyleAttr) {

        private var progress: Int = 0
        private val arcPaint = Paint().apply {
            color = Color.GRAY
            style = Paint.Style.STROKE
            strokeWidth = 50f
            isAntiAlias = true
        }
        private val textPaint = Paint().apply {
            color = Color.BLACK
            textSize = 100f
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        private val oval = RectF()

        fun setProgress(progress: Int) {
            this.progress = progress
            invalidate()
        }

        override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
            super.onSizeChanged(w, h, oldw, oldh)
            oval.set(50f, 50f, 500f, 500f)
        }

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)

            // Desenha o arco de fundo
            //arcPaint.color = Color.GRAY
            canvas.drawArc(oval, 135f, 270f, false, arcPaint)

            // Desenha o arco de progresso
            arcPaint.color = Color.MAGENTA
            canvas.drawArc(oval, 135f, progress / 100f * 270f, false, arcPaint)

            // Desenha o texto dentro do arco
            val text = "$progress%"
            val textX = width / 2f
            val textY = (height / 2f) + 48 //- (textPaint.descent() + textPaint.ascent()) / 2f

            Log.i("MyTag", "Width: " +  width.toString() + "Height: " +  height.toString())
            canvas.drawText(text, textX, textY, textPaint)
        }
    }
