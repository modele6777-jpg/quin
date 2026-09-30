package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oi8 extends Drawable implements Drawable.Callback, Animatable {
    public static final List b1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor c1 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new wi8());
    public boolean E0;
    public boolean F0;
    public rqb G0;
    public boolean H0;
    public final Matrix I0;
    public Bitmap J0;
    public Canvas K0;
    public Rect L0;
    public RectF M0;
    public du7 N0;
    public Rect O0;
    public Rect P0;
    public RectF Q0;
    public RectF R0;
    public Matrix S0;
    public final float[] T0;
    public Matrix U0;
    public boolean V0;
    public jh0 W0;
    public int X;
    public final Semaphore X0;
    public boolean Y;
    public final m45 Y0;
    public boolean Z;
    public float Z0;
    public uh8 a;
    public int a1;
    public final xi8 b;
    public final boolean c;
    public boolean d;
    public final ArrayList e;
    public ta0 f;
    public szc g;
    public Map v;
    public final kd9 w;
    public boolean x;
    public boolean y;
    public sg2 z;

    public oi8() {
        xi8 xi8Var = new xi8();
        this.b = xi8Var;
        this.c = true;
        this.d = false;
        this.a1 = 1;
        this.e = new ArrayList();
        this.w = new kd9(18);
        this.x = false;
        this.y = true;
        this.X = 255;
        this.F0 = false;
        this.G0 = rqb.a;
        this.H0 = false;
        this.I0 = new Matrix();
        this.T0 = new float[9];
        this.V0 = false;
        nt3 nt3Var = new nt3(this, 1);
        this.X0 = new Semaphore(1);
        this.Y0 = new m45(8, this);
        this.Z0 = -3.4028235E38f;
        xi8Var.addUpdateListener(nt3Var);
    }

    public static void d(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean h(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final boolean a(Context context) {
        if (!this.c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = xqf.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void b() {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            return;
        }
        w84 w84Var = vu7.a;
        Rect rect = uh8Var.k;
        List list = Collections.EMPTY_LIST;
        sg2 sg2Var = new sg2(this, new tu7(list, uh8Var, "__container", -1L, 1, -1L, null, list, new qx(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), uh8Var.j, uh8Var);
        this.z = sg2Var;
        if (this.Y) {
            sg2Var.m(true);
        }
        this.z.L = this.y;
    }

    public final void c() {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            return;
        }
        rqb rqbVar = this.G0;
        int i = Build.VERSION.SDK_INT;
        boolean z = uh8Var.o;
        int i2 = uh8Var.p;
        int iOrdinal = rqbVar.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4))) {
            z2 = true;
        }
        this.H0 = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        sg2 sg2Var = this.z;
        if (sg2Var == null) {
            return;
        }
        jh0 jh0Var = this.W0;
        if (jh0Var == null) {
            jh0Var = jh0.a;
        }
        boolean z = jh0Var == jh0.b;
        m45 m45Var = this.Y0;
        ThreadPoolExecutor threadPoolExecutor = c1;
        xi8 xi8Var = this.b;
        Semaphore semaphore = this.X0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (sg2Var.K == xi8Var.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (sg2Var.K != xi8Var.a()) {
                        threadPoolExecutor.execute(m45Var);
                    }
                }
                throw th;
            }
        }
        if (z && n()) {
            m(xi8Var.a());
        }
        boolean z2 = this.d;
        boolean z3 = this.H0;
        if (z2) {
            try {
                if (z3) {
                    j(canvas, sg2Var);
                } else {
                    e(canvas);
                }
            } catch (Throwable unused2) {
                gf8.a.getClass();
            }
        } else if (z3) {
            j(canvas, sg2Var);
        } else {
            e(canvas);
        }
        this.V0 = false;
        if (z) {
            semaphore.release();
            if (sg2Var.K == xi8Var.a()) {
                return;
            }
            threadPoolExecutor.execute(m45Var);
        }
    }

    public final void e(Canvas canvas) {
        sg2 sg2Var = this.z;
        uh8 uh8Var = this.a;
        if (sg2Var == null || uh8Var == null) {
            return;
        }
        Matrix matrix = this.I0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / uh8Var.k.width();
            float fHeight = bounds.height() / uh8Var.k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        sg2Var.f(canvas, matrix, this.X, null);
    }

    public final Context f() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final km8 g() {
        km8 km8Var = null;
        for (String str : b1) {
            uh8 uh8Var = this.a;
            int size = uh8Var.g.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    km8Var = null;
                    break;
                }
                km8 km8Var2 = (km8) uh8Var.g.get(i);
                String str2 = km8Var2.a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    km8Var = km8Var2;
                    break;
                }
                i++;
            }
            if (km8Var != null) {
                break;
            }
        }
        return km8Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            return -1;
        }
        return uh8Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            return -1;
        }
        return uh8Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void i() {
        if (this.z == null) {
            this.e.add(new ki8(this, 1));
            return;
        }
        c();
        boolean zA = a(f());
        xi8 xi8Var = this.b;
        if (zA || xi8Var.getRepeatCount() == 0) {
            if (isVisible()) {
                xi8Var.X = true;
                boolean zD = xi8Var.d();
                Iterator it = xi8Var.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(xi8Var, zD);
                }
                xi8Var.h((int) (xi8Var.d() ? xi8Var.b() : xi8Var.c()));
                xi8Var.f = 0L;
                xi8Var.w = 0;
                if (xi8Var.X) {
                    xi8Var.g(false);
                    Choreographer.getInstance().postFrameCallback(xi8Var);
                }
                this.a1 = 1;
            } else {
                this.a1 = 2;
            }
        }
        if (a(f())) {
            return;
        }
        km8 km8VarG = g();
        if (km8VarG != null) {
            l((int) km8VarG.b);
        } else {
            l((int) (xi8Var.d < 0.0f ? xi8Var.c() : xi8Var.b()));
        }
        xi8Var.g(true);
        xi8Var.e(xi8Var.d());
        if (isVisible()) {
            return;
        }
        this.a1 = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.V0) {
            return;
        }
        this.V0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        xi8 xi8Var = this.b;
        if (xi8Var == null) {
            return false;
        }
        return xi8Var.X;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void j(Canvas canvas, sg2 sg2Var) {
        boolean z;
        if (this.a == null || sg2Var == null) {
            return;
        }
        if (this.K0 == null) {
            this.K0 = new Canvas();
            this.R0 = new RectF();
            this.S0 = new Matrix();
            this.U0 = new Matrix();
            this.L0 = new Rect();
            this.M0 = new RectF();
            this.N0 = new du7();
            this.O0 = new Rect();
            this.P0 = new Rect();
            this.Q0 = new RectF();
        }
        canvas.getMatrix(this.S0);
        canvas.getClipBounds(this.L0);
        Rect rect = this.L0;
        this.M0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.S0.mapRect(this.M0);
        d(this.M0, this.L0);
        boolean z2 = this.y;
        RectF rectF = this.R0;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            sg2Var.c(rectF, null, false);
        }
        this.S0.mapRect(this.R0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.R0;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.R0;
            Rect rect2 = this.L0;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.R0;
        if (!h(rectF4.left) || !h(rectF4.top) || !h(rectF4.right) || !h(rectF4.bottom)) {
            gf8.b("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.R0.width());
        int iCeil2 = (int) Math.ceil(this.R0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            gf8.b("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            gf8.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.J0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.J0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.J0 = bitmapCreateBitmap;
            this.K0.setBitmap(bitmapCreateBitmap);
            this.V0 = true;
        } else if (this.J0.getWidth() > iCeil || this.J0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.J0, 0, 0, iCeil, iCeil2);
            this.J0 = bitmapCreateBitmap2;
            this.K0.setBitmap(bitmapCreateBitmap2);
            this.V0 = true;
        }
        if (this.V0) {
            Matrix matrix = this.S0;
            float[] fArr = this.T0;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.S0;
            Matrix matrix3 = this.I0;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.R0;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.J0.eraseColor(0);
            this.K0.setMatrix(xqf.a);
            this.K0.scale(f, f2);
            sg2Var.f(this.K0, matrix3, this.X, null);
            this.S0.invert(this.U0);
            this.U0.mapRect(this.Q0, this.R0);
            d(this.Q0, this.P0);
        }
        this.O0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.J0, this.O0, this.P0, this.N0);
    }

    public final void k() {
        if (this.z == null) {
            this.e.add(new ki8(this, 0));
            return;
        }
        c();
        boolean zA = a(f());
        xi8 xi8Var = this.b;
        if (zA || xi8Var.getRepeatCount() == 0) {
            if (isVisible()) {
                xi8Var.X = true;
                xi8Var.g(false);
                Choreographer.getInstance().postFrameCallback(xi8Var);
                xi8Var.f = 0L;
                if (xi8Var.d() && xi8Var.v == xi8Var.c()) {
                    xi8Var.h(xi8Var.b());
                } else if (!xi8Var.d() && xi8Var.v == xi8Var.b()) {
                    xi8Var.h(xi8Var.c());
                }
                Iterator it = xi8Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(xi8Var);
                }
                this.a1 = 1;
            } else {
                this.a1 = 3;
            }
        }
        if (a(f())) {
            return;
        }
        l((int) (xi8Var.d < 0.0f ? xi8Var.c() : xi8Var.b()));
        xi8Var.g(true);
        xi8Var.e(xi8Var.d());
        if (isVisible()) {
            return;
        }
        this.a1 = 1;
    }

    public final void l(final int i) {
        if (this.a != null) {
            this.b.h(i);
        } else {
            this.e.add(new ni8() { // from class: mi8
                @Override // defpackage.ni8
                public final void run() {
                    this.a.l(i);
                }
            });
        }
    }

    public final void m(final float f) {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            this.e.add(new ni8() { // from class: li8
                @Override // defpackage.ni8
                public final void run() {
                    this.a.m(f);
                }
            });
        } else {
            this.b.h(aw8.e(uh8Var.l, uh8Var.m, f));
        }
    }

    public final boolean n() {
        uh8 uh8Var = this.a;
        if (uh8Var == null) {
            return false;
        }
        float f = this.Z0;
        float fA = this.b.a();
        this.Z0 = fA;
        return Math.abs(fA - f) * uh8Var.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.X = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        gf8.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.a1;
            if (i == 2) {
                i();
                return visible;
            }
            if (i == 3) {
                k();
                return visible;
            }
        } else {
            xi8 xi8Var = this.b;
            if (xi8Var.X) {
                this.e.clear();
                xi8Var.g(true);
                Iterator it = xi8Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(xi8Var);
                }
                if (!isVisible()) {
                    this.a1 = 1;
                }
                this.a1 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.a1 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        i();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        xi8 xi8Var = this.b;
        xi8Var.g(true);
        xi8Var.e(xi8Var.d());
        if (isVisible()) {
            return;
        }
        this.a1 = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
