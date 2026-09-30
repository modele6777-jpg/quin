package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h4e extends sv3 implements pn4 {
    public final tr F0;
    public final ls4 G0;
    public RenderNode H0;

    public h4e(obe obeVar, tr trVar, ls4 ls4Var) {
        this.F0 = trVar;
        this.G0 = ls4Var;
        l1(obeVar);
    }

    public static boolean o1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        boolean z;
        boolean zO1;
        ks9 ks9Var;
        char c;
        float f;
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        long jF = xl1Var.f();
        tr trVar = this.F0;
        trVar.l(jF);
        Canvas canvasB = mp.b(xl1Var.b.p());
        trVar.d.getValue();
        if (ald.e(xl1Var.f())) {
            vv7Var.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        ls4 ls4Var = this.G0;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = ls4Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = ls4Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = ls4Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = ls4Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = ls4Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = ls4Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = ls4Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = ls4Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            vv7Var.a();
            return;
        }
        float fP0 = vv7Var.p0(30.0f);
        boolean z2 = ls4.f(ls4Var.d) || ls4.g(ls4Var.h) || ls4.f(ls4Var.e) || ls4.g(ls4Var.i);
        boolean z3 = ls4.f(ls4Var.f) || ls4.g(ls4Var.j) || ls4.f(ls4Var.g) || ls4.g(ls4Var.k);
        if (z2 && z3) {
            p1().setPosition(0, 0, canvasB.getWidth(), canvasB.getHeight());
        } else if (z2) {
            p1().setPosition(0, 0, (ym8.L(fP0) * 2) + canvasB.getWidth(), canvasB.getHeight());
        } else {
            if (!z3) {
                vv7Var.a();
                return;
            }
            p1().setPosition(0, 0, canvasB.getWidth(), (ym8.L(fP0) * 2) + canvasB.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = p1().beginRecording();
        boolean zG = ls4.g(ls4Var.j);
        ks9 ks9Var2 = ks9.b;
        if (zG) {
            EdgeEffect edgeEffectA = ls4Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = ls4Var.a(ks9Var2);
                ls4Var.j = edgeEffectA;
            }
            o1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (ls4.f(ls4Var.f)) {
            EdgeEffect edgeEffectC = ls4Var.c();
            zO1 = o1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (ls4.g(ls4Var.f)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (trVar.f() & 4294967295L));
                EdgeEffect edgeEffectA2 = ls4Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = ls4Var.a(ks9Var2);
                    ls4Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fM = i >= 31 ? xq.m(edgeEffectC) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    xq.w(edgeEffectA2, fM, f2);
                } else {
                    edgeEffectA2.onPull(fM, f2);
                }
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zO1 = false;
        }
        boolean zG2 = ls4.g(ls4Var.h);
        ks9 ks9Var3 = ks9.a;
        if (zG2) {
            EdgeEffect edgeEffectA3 = ls4Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = ls4Var.a(ks9Var3);
                ls4Var.h = edgeEffectA3;
            }
            o1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (ls4.f(ls4Var.d)) {
            EdgeEffect edgeEffectE = ls4Var.e();
            c = ' ';
            zO1 = o1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zO1;
            if (ls4.g(ls4Var.d)) {
                ks9Var = ks9Var2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (trVar.f() >> 32));
                EdgeEffect edgeEffectA4 = ls4Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = ls4Var.a(ks9Var3);
                    ls4Var.h = edgeEffectA4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fM2 = i2 >= 31 ? xq.m(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    xq.w(edgeEffectA4, fM2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fM2, fIntBitsToFloat2);
                }
            } else {
                vv7Var = vv7Var;
                ks9Var = ks9Var2;
            }
        } else {
            vv7Var = vv7Var;
            ks9Var = ks9Var2;
            c = ' ';
        }
        if (ls4.g(ls4Var.k)) {
            EdgeEffect edgeEffectA5 = ls4Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = ls4Var.a(ks9Var);
                ls4Var.k = edgeEffectA5;
            }
            o1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (ls4.f(ls4Var.g)) {
            EdgeEffect edgeEffectD = ls4Var.d();
            zO1 = o1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zO1;
            if (ls4.g(ls4Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (trVar.f() & 4294967295L));
                EdgeEffect edgeEffectA6 = ls4Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = ls4Var.a(ks9Var);
                    ls4Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fM3 = i3 >= 31 ? xq.m(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    xq.w(edgeEffectA6, fM3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fM3, fIntBitsToFloat3);
                }
            }
        }
        if (ls4.g(ls4Var.i)) {
            EdgeEffect edgeEffectA7 = ls4Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = ls4Var.a(ks9Var3);
                ls4Var.i = edgeEffectA7;
            }
            f = 0.0f;
            o1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (ls4.f(ls4Var.e)) {
            EdgeEffect edgeEffectB = ls4Var.b();
            boolean z4 = o1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zO1;
            if (ls4.g(ls4Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (trVar.f() >> c));
                EdgeEffect edgeEffectA8 = ls4Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = ls4Var.a(ks9Var3);
                    ls4Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fM4 = i4 >= 31 ? xq.m(edgeEffectB) : f;
                float f3 = 1.0f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    xq.w(edgeEffectA8, fM4, f3);
                } else {
                    edgeEffectA8.onPull(fM4, f3);
                }
            }
            zO1 = z4;
        }
        if (zO1) {
            trVar.g();
        }
        float f4 = z ? f : fP0;
        if (z2) {
            fP0 = f;
        }
        cv7 layoutDirection = vv7Var.getLayoutDirection();
        lp lpVar = new lp();
        lpVar.a = recordingCanvasBeginRecording;
        long jF2 = xl1Var.f();
        sw3 sw3VarU = xl1Var.b.u();
        cv7 cv7VarW = xl1Var.b.w();
        vl1 vl1VarP = xl1Var.b.p();
        long jZ = xl1Var.b.z();
        ta0 ta0Var = xl1Var.b;
        ke6 ke6Var = (ke6) ta0Var.d;
        ta0Var.P(im2Var);
        ta0Var.Q(layoutDirection);
        ta0Var.O(lpVar);
        ta0Var.R(jF2);
        ta0Var.d = null;
        lpVar.g();
        try {
            ((vd9) ((vv7) im2Var).a.b.c).I(f4, fP0);
            try {
                vv7Var.a();
                float f5 = -f4;
                float f6 = -fP0;
                ((vd9) ((vv7) im2Var).a.b.c).I(f5, f6);
                lpVar.o();
                ta0 ta0Var2 = xl1Var.b;
                ta0Var2.P(sw3VarU);
                ta0Var2.Q(cv7VarW);
                ta0Var2.O(vl1VarP);
                ta0Var2.R(jZ);
                ta0Var2.d = ke6Var;
                p1().endRecording();
                int iSave = canvasB.save();
                canvasB.translate(f5, f6);
                canvasB.drawRenderNode(p1());
                canvasB.restoreToCount(iSave);
            } catch (Throwable th) {
                ((vd9) ((vv7) im2Var).a.b.c).I(-f4, -fP0);
                throw th;
            }
        } catch (Throwable th2) {
            lpVar.o();
            ta0 ta0Var3 = xl1Var.b;
            ta0Var3.P(sw3VarU);
            ta0Var3.Q(cv7VarW);
            ta0Var3.O(vl1VarP);
            ta0Var3.R(jZ);
            ta0Var3.d = ke6Var;
            throw th2;
        }
    }

    public final RenderNode p1() {
        RenderNode renderNode = this.H0;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeE = fv.e();
        this.H0 = renderNodeE;
        return renderNodeE;
    }
}
