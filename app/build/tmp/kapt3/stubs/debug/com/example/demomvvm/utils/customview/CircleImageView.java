package com.example.demomvvm.utils.customview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/demomvvm/utils/customview/CircleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageWidth", "matrixImage", "Landroid/graphics/Matrix;", "paint", "Landroid/graphics/Paint;", "paintBorder", "radius", "", "drawToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setUpShader", "Companion", "app_debug"})
public final class CircleImageView extends androidx.appcompat.widget.AppCompatImageView {
    private android.graphics.Paint paint;
    private android.graphics.Paint paintBorder;
    private android.graphics.Matrix matrixImage;
    private float radius = 0.0F;
    private int imageWidth = 0;
    private static final float STROKE_WIDTH = 5.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.demomvvm.utils.customview.CircleImageView.Companion Companion = null;
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    private final void setUpShader() {
    }
    
    private final android.graphics.Bitmap drawToBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/demomvvm/utils/customview/CircleImageView$Companion;", "", "()V", "STROKE_WIDTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}