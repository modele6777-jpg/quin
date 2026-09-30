package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qe6 implements me6 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public nqb G;
    public int H;
    public final yl1 b;
    public final xl1 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public c82 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public qe6() {
        yl1 yl1Var = new yl1();
        xl1 xl1Var = new xl1();
        this.b = yl1Var;
        this.c = xl1Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        R(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = y72.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // defpackage.me6
    public final void A(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(abg.Z(j));
    }

    @Override // defpackage.me6
    public final void B(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.me6
    public final float C() {
        return this.w;
    }

    @Override // defpackage.me6
    public final void D(sw3 sw3Var, cv7 cv7Var, ke6 ke6Var, je6 je6Var) {
        xl1 xl1Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            yl1 yl1Var = this.b;
            lp lpVar = yl1Var.a;
            Canvas canvas = lpVar.a;
            lpVar.a = recordingCanvasBeginRecording;
            ta0 ta0Var = xl1Var.b;
            ta0Var.P(sw3Var);
            ta0Var.Q(cv7Var);
            ta0Var.d = ke6Var;
            ta0Var.R(this.e);
            ta0Var.O(lpVar);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                lpVar.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                je6Var.d(xl1Var);
                lpVar.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                je6Var.d(xl1Var);
            }
            yl1Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.me6
    public final float E() {
        return this.o;
    }

    @Override // defpackage.me6
    public final void F(boolean z) {
        this.x = z;
        Q();
    }

    @Override // defpackage.me6
    public final float G() {
        return this.t;
    }

    @Override // defpackage.me6
    public final void H(int i) {
        this.H = i;
        S();
    }

    @Override // defpackage.me6
    public final void I(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.me6
    public final void J(long j) {
        this.s = j;
        this.d.setSpotShadowColor(abg.Z(j));
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
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.me6
    public final float M() {
        return this.q;
    }

    @Override // defpackage.me6
    public final float N() {
        return this.n;
    }

    @Override // defpackage.me6
    public final void O(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.me6
    public final int P() {
        return this.j;
    }

    public final void Q() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        int i = this.H;
        if (i != 1 && this.j == 3 && this.k == null && this.G == null) {
            R(this.d, i);
        } else {
            R(this.d, 1);
        }
    }

    public final void T() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.me6
    public final float a() {
        return this.i;
    }

    @Override // defpackage.me6
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.me6
    public final float c() {
        return this.m;
    }

    @Override // defpackage.me6
    public final void d(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.me6
    public final nqb e() {
        return this.G;
    }

    @Override // defpackage.me6
    public final void f(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.me6
    public final void g(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.me6
    public final void h(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    @Override // defpackage.me6
    public final void i(nqb nqbVar) {
        this.G = nqbVar;
        if (Build.VERSION.SDK_INT >= 31) {
            xq.z(this.d, nqbVar);
        }
    }

    @Override // defpackage.me6
    public final void j(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(bp.U(i));
        S();
    }

    @Override // defpackage.me6
    public final void k() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.me6
    public final void l(vl1 vl1Var) {
        Canvas canvas = mp.a;
        ((lp) vl1Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.me6
    public final int m() {
        return this.H;
    }

    @Override // defpackage.me6
    public final c82 n() {
        return this.k;
    }

    @Override // defpackage.me6
    public final void o(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.me6
    public final void p(int i, int i2, long j) {
        this.E = i;
        this.F = i2;
        boolean zA = ald.a(this.e, db6.Y0(j));
        this.e = db6.Y0(j);
        U();
        if (zA || !hl9.c(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.me6
    public final float q() {
        return this.u;
    }

    @Override // defpackage.me6
    public final boolean r() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.me6
    public final float s() {
        return this.v;
    }

    @Override // defpackage.me6
    public final void t(long j) {
        this.l = j;
        T();
    }

    @Override // defpackage.me6
    public final long u() {
        return this.r;
    }

    @Override // defpackage.me6
    public final void v(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.me6
    public final void w(c82 c82Var) {
        this.k = c82Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
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
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        U();
        if (z) {
            T();
        }
    }

    @Override // defpackage.me6
    public final float y() {
        return this.p;
    }

    @Override // defpackage.me6
    public final long z() {
        return this.s;
    }
}
