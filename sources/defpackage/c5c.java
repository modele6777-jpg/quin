package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c5c extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public pff a;
    public Boolean b;
    public Long c;
    public m45 d;
    public p e;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f : g;
            pff pffVar = this.a;
            if (pffVar != null) {
                pffVar.setState(iArr);
            }
        } else {
            m45 m45Var = new m45(19, this);
            this.d = m45Var;
            postDelayed(m45Var, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(c5c c5cVar) {
        pff pffVar = c5cVar.a;
        if (pffVar != null) {
            pffVar.setState(g);
        }
        c5cVar.d = null;
    }

    public final void b(pta ptaVar, boolean z, long j, int i, long j2, p pVar) {
        long j3 = ptaVar.a;
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            pff pffVar = new pff(z);
            setBackground(pffVar);
            this.a = pffVar;
            this.b = Boolean.valueOf(z);
        }
        pff pffVar2 = this.a;
        pffVar2.getClass();
        this.e = pVar;
        e(j, i, j2);
        if (z) {
            pffVar2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            pffVar2.setHotspot(pffVar2.getBounds().centerX(), pffVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        m45 m45Var = this.d;
        if (m45Var != null) {
            removeCallbacks(m45Var);
            m45 m45Var2 = this.d;
            m45Var2.getClass();
            m45Var2.run();
        } else {
            pff pffVar = this.a;
            if (pffVar != null) {
                pffVar.setState(g);
            }
        }
        pff pffVar2 = this.a;
        if (pffVar2 == null) {
            return;
        }
        pffVar2.setVisible(false, false);
        unscheduleDrawable(pffVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2) {
        pff pffVar = this.a;
        if (pffVar == null) {
            return;
        }
        if (pffVar.getRadius() != i) {
            pffVar.setRadius(i);
        }
        float f2 = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jB = y72.b(j2, f2);
        y72 y72Var = pffVar.b;
        if (!(y72Var == null ? false : faf.a(y72Var.a, jB))) {
            pffVar.b = new y72(jB);
            pffVar.setColor(ColorStateList.valueOf(abg.Z(jB)));
        }
        Rect rect = new Rect(0, 0, ym8.L(ald.d(j)), ym8.L(ald.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pffVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        p pVar = this.e;
        if (pVar != null) {
            pVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
