package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class se6 implements me6 {
    public static final re6 I = new re6();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public nqb H;
    public final kn4 b;
    public final yl1 c;
    public final awf d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public c82 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public se6(kn4 kn4Var) {
        yl1 yl1Var = new yl1();
        xl1 xl1Var = new xl1();
        this.b = kn4Var;
        this.c = yl1Var;
        awf awfVar = new awf(kn4Var, yl1Var, xl1Var);
        this.d = awfVar;
        this.e = kn4Var.getResources();
        this.f = new Rect();
        kn4Var.addView(awfVar);
        awfVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = y72.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.me6
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            cwf.a(this.d, abg.Z(j));
        }
    }

    @Override // defpackage.me6
    public final void B(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.me6
    public final float C() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.me6
    public final void D(sw3 sw3Var, cv7 cv7Var, ke6 ke6Var, je6 je6Var) {
        awf awfVar = this.d;
        ViewParent parent = awfVar.getParent();
        kn4 kn4Var = this.b;
        if (parent == null) {
            kn4Var.addView(awfVar);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        awfVar.g = sw3Var;
        awfVar.v = cv7Var;
        awfVar.w = je6Var;
        awfVar.x = ke6Var;
        awfVar.y = fIntBitsToFloat;
        awfVar.z = fIntBitsToFloat2;
        if (awfVar.isAttachedToWindow()) {
            awfVar.setVisibility(4);
            awfVar.setVisibility(0);
            try {
                lp lpVar = this.c.a;
                re6 re6Var = I;
                Canvas canvas = lpVar.a;
                lpVar.a = re6Var;
                kn4Var.a(lpVar, awfVar, awfVar.getDrawingTime());
                lpVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.me6
    public final float E() {
        return this.v;
    }

    @Override // defpackage.me6
    public final void F(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.me6
    public final float G() {
        return this.A;
    }

    @Override // defpackage.me6
    public final void H(int i) {
        this.p = i;
        S();
    }

    @Override // defpackage.me6
    public final void I(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.me6
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            cwf.b(this.d, abg.Z(j));
        }
    }

    @Override // defpackage.me6
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.me6
    public final void L(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.me6
    public final float M() {
        return this.x;
    }

    @Override // defpackage.me6
    public final float N() {
        return this.u;
    }

    @Override // defpackage.me6
    public final void O(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.me6
    public final int P() {
        return this.n;
    }

    public final void Q(int i) {
        Paint paint = this.g;
        awf awfVar = this.d;
        boolean z = true;
        if (i == 1) {
            awfVar.setLayerType(2, paint);
        } else if (i == 2) {
            awfVar.setLayerType(0, paint);
            z = false;
        } else {
            awfVar.setLayerType(0, paint);
        }
        awfVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void R() {
        boolean z = this.m;
        awf awfVar = this.d;
        if (z || awfVar.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        awfVar.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void S() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            Q(i);
        } else {
            Q(1);
        }
    }

    public final void T() {
        boolean z = this.r;
        awf awfVar = this.d;
        if (z || hl9.c(this.s, 9205357640488583168L)) {
            awfVar.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            awfVar.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            awfVar.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            awfVar.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.me6
    public final float a() {
        return this.q;
    }

    @Override // defpackage.me6
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.me6
    public final float c() {
        return this.t;
    }

    @Override // defpackage.me6
    public final void d(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.me6
    public final nqb e() {
        return this.H;
    }

    @Override // defpackage.me6
    public final void f(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.me6
    public final void g(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.me6
    public final void h(Outline outline, long j) {
        awf awfVar = this.d;
        awfVar.e = outline;
        awfVar.invalidateOutline();
        if ((this.m || awfVar.getClipToOutline()) && outline != null) {
            awfVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.me6
    public final void i(nqb nqbVar) {
        this.H = nqbVar;
        if (Build.VERSION.SDK_INT >= 31) {
            xq.A(this.d, nqbVar);
        }
    }

    @Override // defpackage.me6
    public final void j(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(bp.X(i)));
        S();
    }

    @Override // defpackage.me6
    public final void k() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.me6
    public final void l(vl1 vl1Var) {
        Rect rect;
        boolean z = this.k;
        awf awfVar = this.d;
        if (z) {
            if ((this.m || awfVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = awfVar.getWidth();
                rect.bottom = awfVar.getHeight();
            } else {
                rect = null;
            }
            awfVar.setClipBounds(rect);
        }
        Canvas canvas = mp.a;
        if (((lp) vl1Var).a.isHardwareAccelerated()) {
            this.b.a(vl1Var, awfVar, awfVar.getDrawingTime());
        }
    }

    @Override // defpackage.me6
    public final int m() {
        return this.p;
    }

    @Override // defpackage.me6
    public final c82 n() {
        return this.o;
    }

    @Override // defpackage.me6
    public final void o(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.me6
    public final void p(int i, int i2, long j) {
        if (!e77.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            R();
            return;
        }
        int i3 = this.h;
        awf awfVar = this.d;
        if (i3 != i) {
            awfVar.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            awfVar.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.me6
    public final float q() {
        return this.B;
    }

    @Override // defpackage.me6
    public final float s() {
        return this.C;
    }

    @Override // defpackage.me6
    public final void t(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        T();
    }

    @Override // defpackage.me6
    public final long u() {
        return this.y;
    }

    @Override // defpackage.me6
    public final void v(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.me6
    public final void w(c82 c82Var) {
        this.o = c82Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(c82Var != null ? c82Var.a : null);
        S();
    }

    @Override // defpackage.me6
    public final void x(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbN = ib8.n(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbN.append(i3);
            sbN.append(", Bottom: ");
            sbN.append(i4);
            h37.a(sbN.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        R();
        if (z) {
            T();
        }
    }

    @Override // defpackage.me6
    public final float y() {
        return this.w;
    }

    @Override // defpackage.me6
    public final long z() {
        return this.z;
    }
}
