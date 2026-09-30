package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 implements ScrollCaptureCallback {
    public final ywc a;
    public final a77 b;
    public final qm2 c;
    public final AndroidComposeView d;
    public final qn2 e;
    public final opb f;

    public gf2(ywc ywcVar, a77 a77Var, qn2 qn2Var, qm2 qm2Var, AndroidComposeView androidComposeView) {
        this.a = ywcVar;
        this.b = a77Var;
        this.c = qm2Var;
        this.d = androidComposeView;
        this.e = new qn2(qn2Var.a.p0(k94.b));
        this.f = new opb(a77Var.b(), new ff2(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, a77 a77Var, zn2 zn2Var) {
        ef2 ef2Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        a77 a77Var2;
        int i4;
        int iO;
        int iO2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (zn2Var instanceof ef2) {
            ef2Var = (ef2) zn2Var;
            int i7 = ef2Var.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ef2Var.label = i7 - Integer.MIN_VALUE;
            } else {
                ef2Var = new ef2(this, zn2Var);
            }
        } else {
            ef2Var = new ef2(this, zn2Var);
        }
        Object obj = ef2Var.result;
        int i8 = ef2Var.label;
        opb opbVar = this.f;
        bw2 bw2Var = bw2.a;
        if (i8 == 0) {
            jzb.q(obj);
            i = a77Var.b;
            i2 = a77Var.d;
            ef2Var.L$0 = scrollCaptureSession;
            ef2Var.L$1 = a77Var;
            ef2Var.I$0 = i;
            ef2Var.I$1 = i2;
            ef2Var.label = 1;
            if (i > i2) {
                opbVar.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = opbVar.a;
            if (i9 > i10) {
                qc0.o(ks0.k("Expected range (", i9, ") to be ≤ viewportSize=", i10));
                return null;
            }
            Object objA = opbVar.a((((i9 / 2) + i) - (i10 / 2)) - opbVar.c, ef2Var);
            Object obj2 = wef.a;
            if (objA != bw2Var) {
                objA = obj2;
            }
            if (objA == bw2Var) {
                obj2 = objA;
            }
            if (obj2 != bw2Var) {
            }
            return bw2Var;
        }
        if (i8 == 1) {
            int i11 = ef2Var.I$1;
            int i12 = ef2Var.I$0;
            a77 a77Var3 = (a77) ef2Var.L$1;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) ef2Var.L$0;
            jzb.q(obj);
            i = i12;
            a77Var = a77Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = ef2Var.I$1;
            i4 = ef2Var.I$0;
            a77Var2 = (a77) ef2Var.L$1;
            scrollCaptureSession2 = (ScrollCaptureSession) ef2Var.L$0;
            jzb.q(obj);
        }
        iO = mh3.o(i4 - ym8.L(opbVar.c), 0, opbVar.a);
        iO2 = mh3.o(i3 - ym8.L(opbVar.c), 0, opbVar.a);
        i5 = a77Var2.a;
        i6 = a77Var2.c;
        if (iO == iO2) {
            return a77.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iO);
            a77 a77Var4 = this.b;
            canvasLockHardwareCanvas.translate(-a77Var4.a, -a77Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iL = ym8.L(opbVar.c);
            return new a77(i5, iO + iL, i6, iO2 + iL);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        cz1 cz1Var = new cz1(10);
        ef2Var.L$0 = scrollCaptureSession;
        ef2Var.L$1 = a77Var;
        ef2Var.I$0 = i;
        ef2Var.I$1 = i2;
        ef2Var.label = 2;
        if (tm7.J(ef2Var.getContext()).g0(ef2Var, cz1Var) != bw2Var) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            a77Var2 = a77Var;
            i4 = i;
            iO = mh3.o(i4 - ym8.L(opbVar.c), 0, opbVar.a);
            iO2 = mh3.o(i3 - ym8.L(opbVar.c), 0, opbVar.a);
            i5 = a77Var2.a;
            i6 = a77Var2.c;
            if (iO == iO2) {
                return a77.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iO);
            a77 a77Var5 = this.b;
            canvasLockHardwareCanvas.translate(-a77Var5.a, -a77Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iL2 = ym8.L(opbVar.c);
            return new a77(i5, iO + iL2, i6, iO2 + iL2);
        }
        return bw2Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ynb.V(this.e, fg9.b, null, new cf2(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        lyd lydVarV = ynb.V(this.e, null, null, new df2(this, scrollCaptureSession, rect, consumer, null), 3);
        lydVarV.E(new ot1(1, cancellationSignal));
        cancellationSignal.setOnCancelListener(new hf2(0, lydVarV));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ynb.j0(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        ((vz9) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
