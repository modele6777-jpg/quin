package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xi8 extends ValueAnimator implements Choreographer.FrameCallback {
    public uh8 z;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float v = 0.0f;
    public int w = 0;
    public float x = -2.1474836E9f;
    public float y = 2.1474836E9f;
    public boolean X = false;

    public final float a() {
        uh8 uh8Var = this.z;
        if (uh8Var == null) {
            return 0.0f;
        }
        float f = this.v;
        float f2 = uh8Var.l;
        return (f - f2) / (uh8Var.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public final float b() {
        uh8 uh8Var = this.z;
        if (uh8Var == null) {
            return 0.0f;
        }
        float f = this.y;
        return f == 2.1474836E9f ? uh8Var.m : f;
    }

    public final float c() {
        uh8 uh8Var = this.z;
        if (uh8Var == null) {
            return 0.0f;
        }
        float f = this.x;
        return f == -2.1474836E9f ? uh8Var.l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        return this.d < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.X) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        uh8 uh8Var = this.z;
        if (uh8Var == null || !this.X) {
            return;
        }
        long j2 = this.f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / uh8Var.n) / Math.abs(this.d));
        float f = this.g;
        if (d()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = aw8.a;
        if (f2 >= fC && f2 <= fB) {
            z = true;
        }
        float fB2 = aw8.b(f2, c(), b());
        this.g = fB2;
        this.v = fB2;
        this.f = j;
        if (z) {
            f();
        } else if (getRepeatCount() == -1 || this.w < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float fB3 = d() ? b() : c();
                this.g = fB3;
                this.v = fB3;
            }
            this.f = j;
            f();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.w++;
        } else {
            float fC2 = this.d < 0.0f ? c() : b();
            this.g = fC2;
            this.v = fC2;
            g(true);
            f();
            e(d());
        }
        if (this.z == null) {
            return;
        }
        float f3 = this.v;
        float f4 = this.x;
        if (f3 < f4 || f3 > this.y) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.y), Float.valueOf(this.v)));
        }
    }

    public final void e(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.X = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.z == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.v;
            fB = b();
            fC2 = c();
        } else {
            fC = this.v - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        uh8 uh8Var = this.z;
        if (uh8Var == null) {
            return 0L;
        }
        return (long) uh8Var.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f) {
        if (this.g == f) {
            return;
        }
        float fB = aw8.b(f, c(), b());
        this.g = fB;
        this.v = fB;
        this.f = 0L;
        f();
    }

    public final void i(float f, float f2) {
        if (f > f2) {
            qc0.j(kv2.k("minFrame (", f, ") must be <= maxFrame (", f2, ")"));
            return;
        }
        uh8 uh8Var = this.z;
        float f3 = uh8Var == null ? -3.4028235E38f : uh8Var.l;
        float f4 = uh8Var == null ? Float.MAX_VALUE : uh8Var.m;
        float fB = aw8.b(f, f3, f4);
        float fB2 = aw8.b(f2, f3, f4);
        if (fB == this.x && fB2 == this.y) {
            return;
        }
        this.x = fB;
        this.y = fB2;
        h((int) aw8.b(this.v, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.X;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
