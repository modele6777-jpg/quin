package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jxf {
    public final pxf a;
    public yk1 b;

    public jxf(pxf pxfVar) {
        this.a = pxfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(omb ombVar, zn2 zn2Var) {
        gxf gxfVar;
        Surface surface;
        AutoCloseable autoCloseable;
        if (zn2Var instanceof gxf) {
            gxfVar = (gxf) zn2Var;
            int i = gxfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxfVar.label = i - Integer.MIN_VALUE;
            } else {
                gxfVar = new gxf(this, zn2Var);
            }
        } else {
            gxfVar = new gxf(this, zn2Var);
        }
        Object obj = gxfVar.result;
        int i2 = gxfVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            yk1 yk1Var = this.b;
            if (yk1Var != null && (surface = (Surface) ombVar.a()) != null) {
                qxf qxfVar = new qxf(surface, this.a, new h2e(21, ombVar));
                try {
                    ixf ixfVar = new ixf(yk1Var, qxfVar, null);
                    gxfVar.L$0 = qxfVar;
                    gxfVar.label = 1;
                    Object objO = jgb.O(ixfVar, gxfVar);
                    bw2 bw2Var = bw2.a;
                    if (objO == bw2Var) {
                        return bw2Var;
                    }
                    autoCloseable = qxfVar;
                    cgg.t(autoCloseable, null);
                } catch (Throwable th) {
                    th = th;
                    autoCloseable = qxfVar;
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            autoCloseable = (AutoCloseable) gxfVar.L$0;
            try {
                jzb.q(obj);
                cgg.t(autoCloseable, null);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    cgg.t(autoCloseable, th);
                    throw th3;
                }
            }
        }
        return wef.a;
    }
}
