package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pe6 implements me6 {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public nqb J;
    public final yl1 b;
    public final xl1 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public c82 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public pe6(AndroidComposeView androidComposeView, yl1 yl1Var, xl1 xl1Var) {
        this.b = yl1Var;
        this.c = xl1Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                tqb.c(renderNodeCreate, tqb.a(renderNodeCreate));
                tqb.d(renderNodeCreate, tqb.b(renderNodeCreate));
            }
            sqb.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        R(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = y72.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.me6
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            tqb.c(this.d, abg.Z(j));
        }
    }

    @Override // defpackage.me6
    public final void B(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.me6
    public final float C() {
        return this.z;
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
    public final void D(sw3 sw3Var, cv7 cv7Var, ke6 ke6Var, je6 je6Var) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        sw3 sw3VarU;
        cv7 cv7VarW;
        vl1 vl1VarP;
        long jZ;
        ke6 ke6Var2;
        xl1 xl1Var = this.c;
        ta0 ta0Var = xl1Var.b;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            lp lpVar = this.b.a;
            Canvas canvas = lpVar.a;
            lpVar.a = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.B <= 0.0f) {
                        try {
                            if (this.C <= 0.0f) {
                                long jY0 = db6.Y0(this.e);
                                sw3 sw3VarU2 = ta0Var.u();
                                cv7 cv7VarW2 = ta0Var.w();
                                vl1 vl1VarP2 = ta0Var.p();
                                canvas = canvas;
                                long jZ2 = ta0Var.z();
                                displayListCanvasStart = displayListCanvasStart;
                                ke6 ke6Var3 = (ke6) ta0Var.d;
                                ta0Var.P(sw3Var);
                                ta0Var.Q(cv7Var);
                                ta0Var.O(lpVar);
                                ta0Var.R(jY0);
                                ta0Var.d = ke6Var;
                                lpVar.g();
                                try {
                                    je6Var.d(xl1Var);
                                    lpVar.o();
                                    ta0Var.P(sw3VarU2);
                                    ta0Var.Q(cv7VarW2);
                                    ta0Var.O(vl1VarP2);
                                    ta0Var.R(jZ2);
                                    ta0Var.d = ke6Var3;
                                } catch (Throwable th) {
                                    lpVar.o();
                                    ta0Var.P(sw3VarU2);
                                    ta0Var.Q(cv7VarW2);
                                    ta0Var.O(vl1VarP2);
                                    ta0Var.R(jZ2);
                                    ta0Var.d = ke6Var3;
                                    throw th;
                                }
                            }
                            lpVar.a = canvas;
                            this.d.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    je6Var.d(xl1Var);
                    lpVar.o();
                    ta0Var.P(sw3VarU);
                    ta0Var.Q(cv7VarW);
                    ta0Var.O(vl1VarP);
                    ta0Var.R(jZ);
                    ta0Var.d = ke6Var2;
                    lpVar.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    lpVar.a = canvas;
                    this.d.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        lpVar.o();
                        ta0Var.P(sw3VarU);
                        ta0Var.Q(cv7VarW);
                        ta0Var.O(vl1VarP);
                        ta0Var.R(jZ);
                        ta0Var.d = ke6Var2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                lpVar.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jY1 = db6.Y0(this.e);
                sw3VarU = ta0Var.u();
                cv7VarW = ta0Var.w();
                vl1VarP = ta0Var.p();
                jZ = ta0Var.z();
                ke6Var2 = (ke6) ta0Var.d;
                ta0Var.P(sw3Var);
                ta0Var.Q(cv7Var);
                ta0Var.O(lpVar);
                ta0Var.R(jY1);
                ta0Var.d = ke6Var;
                lpVar.g();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.me6
    public final float E() {
        return this.r;
    }

    @Override // defpackage.me6
    public final void F(boolean z) {
        this.A = z;
        Q();
    }

    @Override // defpackage.me6
    public final float G() {
        return this.w;
    }

    @Override // defpackage.me6
    public final void H(int i) {
        this.j = i;
        S();
    }

    @Override // defpackage.me6
    public final void I(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.me6
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            tqb.d(this.d, abg.Z(j));
        }
    }

    @Override // defpackage.me6
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.me6
    public final void L(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.me6
    public final float M() {
        return this.t;
    }

    @Override // defpackage.me6
    public final float N() {
        return this.q;
    }

    @Override // defpackage.me6
    public final void O(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.me6
    public final int P() {
        return this.k;
    }

    public final void Q() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            R(i);
        } else {
            R(1);
        }
    }

    public final void T() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.me6
    public final float a() {
        return this.m;
    }

    @Override // defpackage.me6
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.me6
    public final float c() {
        return this.p;
    }

    @Override // defpackage.me6
    public final void d(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.me6
    public final nqb e() {
        return this.J;
    }

    @Override // defpackage.me6
    public final void f(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.me6
    public final void g(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.me6
    public final void h(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    @Override // defpackage.me6
    public final void i(nqb nqbVar) {
        this.J = nqbVar;
    }

    @Override // defpackage.me6
    public final void j(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(bp.X(i)));
        S();
    }

    @Override // defpackage.me6
    public final void k() {
        sqb.a(this.d);
    }

    @Override // defpackage.me6
    public final void l(vl1 vl1Var) {
        Canvas canvas = mp.a;
        DisplayListCanvas displayListCanvas = ((lp) vl1Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.me6
    public final int m() {
        return this.j;
    }

    @Override // defpackage.me6
    public final c82 n() {
        return this.l;
    }

    @Override // defpackage.me6
    public final void o(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.me6
    public final void p(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean zB = e77.b(this.e, j);
        this.e = j;
        U();
        if (zB) {
            return;
        }
        if (this.n || hl9.c(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.me6
    public final float q() {
        return this.x;
    }

    @Override // defpackage.me6
    public final boolean r() {
        return this.d.isValid();
    }

    @Override // defpackage.me6
    public final float s() {
        return this.y;
    }

    @Override // defpackage.me6
    public final void t(long j) {
        this.o = j;
        T();
    }

    @Override // defpackage.me6
    public final long u() {
        return this.u;
    }

    @Override // defpackage.me6
    public final void v(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.me6
    public final void w(c82 c82Var) {
        this.l = c82Var;
        if (c82Var == null) {
            S();
            return;
        }
        R(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(c82Var.a);
        renderNode.setLayerPaint(paint);
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        U();
        if (z) {
            T();
        }
    }

    @Override // defpackage.me6
    public final float y() {
        return this.s;
    }

    @Override // defpackage.me6
    public final long z() {
        return this.v;
    }
}
