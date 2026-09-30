package defpackage;

import ai.askquin.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ot3 extends View implements kxe {
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final StringBuilder M0;
    public final Formatter N0;
    public final j1 O0;
    public final CopyOnWriteArraySet P0;
    public final Point Q0;
    public final float R0;
    public int S0;
    public long T0;
    public int U0;
    public Rect V0;
    public final ValueAnimator W0;
    public float X0;
    public boolean Y0;
    public boolean Z0;
    public final Rect a;
    public long a1;
    public final Rect b;
    public long b1;
    public final Rect c;
    public long c1;
    public final Rect d;
    public long d1;
    public final Paint e;
    public int e1;
    public final Paint f;
    public long[] f1;
    public final Paint g;
    public boolean[] g1;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final Drawable y;
    public final int z;

    public ot3(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.v = paint4;
        Paint paint5 = new Paint();
        this.w = paint5;
        Paint paint6 = new Paint();
        this.x = paint6;
        paint6.setAntiAlias(true);
        this.P0 = new CopyOnWriteArraySet();
        this.Q0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.R0 = f;
        this.L0 = a(-50, f);
        int iA = a(4, f);
        int iA2 = a(26, f);
        int iA3 = a(4, f);
        int iA4 = a(12, f);
        int iA5 = a(0, f);
        int iA6 = a(16, f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ebb.b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.y = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.F0 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                iA4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.H0 = iA4;
                iA5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.I0 = iA5;
                iA6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                this.J0 = iA6;
                int i = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i4 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i5 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.z = iA;
            this.E0 = iA2;
            this.F0 = 0;
            this.G0 = iA3;
            this.H0 = iA4;
            this.I0 = iA5;
            this.J0 = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.y = null;
        }
        StringBuilder sb = new StringBuilder();
        this.M0 = sb;
        this.N0 = new Formatter(sb, Locale.getDefault());
        this.O0 = new j1(25, this);
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            this.K0 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.K0 = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        }
        this.X0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.W0 = valueAnimator;
        valueAnimator.addUpdateListener(new nt3(this, 0));
        this.b1 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.S0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.T0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.b1;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.S0);
    }

    private String getProgressText() {
        return pqf.x(this.M0, this.N0, this.c1);
    }

    private long getScrubberPosition() {
        Rect rect = this.b;
        if (rect.width() <= 0 || this.b1 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.b1) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.b1;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.Z0 ? this.a1 : this.c1;
        long jI = pqf.i(j3 + j, 0L, j2);
        if (jI == j3) {
            return false;
        }
        if (this.Z0) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.a1 = j;
        this.Z0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.P0.iterator();
        while (it.hasNext()) {
            oha ohaVar = ((dha) it.next()).a;
            ohaVar.L1 = true;
            TextView textView = ohaVar.c1;
            if (textView != null) {
                textView.setText(pqf.x(ohaVar.e1, ohaVar.f1, j));
            }
            ohaVar.a.f();
            zga zgaVar = ohaVar.F1;
            if (zgaVar != null && ohaVar.N1) {
                if (ohaVar.h(zgaVar)) {
                    try {
                        Method method = ohaVar.f;
                        method.getClass();
                        method.invoke(ohaVar.F1, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        yg5.p(e);
                        return;
                    }
                } else if (ohaVar.g(ohaVar.F1)) {
                    try {
                        Method method2 = ohaVar.w;
                        method2.getClass();
                        method2.invoke(ohaVar.F1, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        yg5.p(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    zga zgaVar2 = ohaVar.F1;
                    zgaVar2.getClass();
                    sb.append(zgaVar2.getClass());
                    xo1.V("PlayerControlView", sb.toString());
                }
            }
            if (ohaVar.j(ohaVar.F1)) {
                ohaVar.l(ohaVar.F1, j);
            }
        }
    }

    public final void d(boolean z) {
        removeCallbacks(this.O0);
        this.Z0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (dha dhaVar : this.P0) {
            long j = this.a1;
            oha ohaVar = dhaVar.a;
            ohaVar.L1 = false;
            zga zgaVar = ohaVar.F1;
            if (zgaVar != null) {
                if (!z) {
                    ohaVar.l(zgaVar, j);
                }
                if (ohaVar.h(ohaVar.F1)) {
                    try {
                        Method method = ohaVar.f;
                        method.getClass();
                        method.invoke(ohaVar.F1, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        yg5.p(e);
                        return;
                    }
                } else if (ohaVar.g(ohaVar.F1)) {
                    try {
                        Method method2 = ohaVar.w;
                        method2.getClass();
                        method2.invoke(ohaVar.F1, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        yg5.p(e2);
                        return;
                    }
                } else {
                    continue;
                }
            }
            ohaVar.a.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.Z0 ? this.a1 : this.c1;
        if (this.b1 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.d1) / this.b1)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.b1)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void f(long j) {
        if (this.a1 == j) {
            return;
        }
        this.a1 = j;
        Iterator it = this.P0.iterator();
        while (it.hasNext()) {
            oha ohaVar = ((dha) it.next()).a;
            TextView textView = ohaVar.c1;
            if (textView != null) {
                textView.setText(pqf.x(ohaVar.e1, ohaVar.f1, j));
            }
            if (ohaVar.j(ohaVar.F1)) {
                ohaVar.l(ohaVar.F1, j);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.R0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.b1;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.b1;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.e);
            }
            if (this.e1 != 0) {
                long[] jArr = this.f1;
                jArr.getClass();
                boolean[] zArr = this.g1;
                zArr.getClass();
                int i6 = this.G0;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.e1) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * pqf.i(jArr[i9], 0L, this.b1)) / this.b1)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.w : this.v);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.b1 > 0) {
            int iH = pqf.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.y;
            if (drawable == null) {
                if (this.Z0 || isFocused()) {
                    i = this.J0;
                } else {
                    i = isEnabled() ? this.H0 : this.I0;
                }
                canvas2.drawCircle(iH, iCenterY2, (int) ((i * this.X0) / 2.0f), this.x);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.X0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.X0)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.Z0 || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.b1 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            j1 j1Var = this.O0;
                            removeCallbacks(j1Var);
                            postDelayed(j1Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            j1 j1Var2 = this.O0;
                            removeCallbacks(j1Var2);
                            postDelayed(j1Var2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.Z0) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.Z0) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.Y0 ? 0 : this.K0;
        int i8 = this.F0;
        int i9 = this.z;
        int i10 = this.E0;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.V0) == null || rect.width() != i5 || this.V0.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.V0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.E0;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.y;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.b1 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.Q0;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action == 0) {
                int i3 = i;
                if (this.a.contains(i3, i2)) {
                    rect2.right = pqf.h(i3, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.Z0) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.Z0) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.Z0) {
                if (i2 < this.L0) {
                    int i4 = this.U0;
                    rect2.right = pqf.h(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.U0 = i;
                    rect2.right = pqf.h(i, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.b1 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.v.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedPosition(long j) {
        if (this.d1 == j) {
            return;
        }
        this.d1 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.b1 == j) {
            return;
        }
        this.b1 = j;
        if (this.Z0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.Z0 || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        pa7.A(i > 0);
        this.S0 = i;
        this.T0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        pa7.A(j > 0);
        this.S0 = -1;
        this.T0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.w.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    public void setPosition(long j) {
        if (this.c1 == j) {
            return;
        }
        this.c1 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.x.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }
}
