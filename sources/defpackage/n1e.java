package defpackage;

import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n1e implements nm3 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final as9 c;
    public final nxc d;

    public n1e(ImageDecoder.Source source, AutoCloseable autoCloseable, as9 as9Var, nxc nxcVar) {
        this.a = source;
        this.b = autoCloseable;
        this.c = as9Var;
        this.d = nxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nm3
    public final Object a(xn2 xn2Var) {
        m1e m1eVar;
        nxc nxcVar;
        if (xn2Var instanceof m1e) {
            m1eVar = (m1e) xn2Var;
            int i = m1eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1eVar.label = i - Integer.MIN_VALUE;
            } else {
                m1eVar = new m1e(this, (zn2) xn2Var);
            }
        } else {
            m1eVar = new m1e(this, (zn2) xn2Var);
        }
        Object obj = m1eVar.result;
        int i2 = m1eVar.label;
        int i3 = 1;
        if (i2 == 0) {
            jzb.q(obj);
            nxc nxcVar2 = this.d;
            m1eVar.L$0 = nxcVar2;
            m1eVar.label = 1;
            Object objA = nxcVar2.a(m1eVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            nxcVar = nxcVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nxcVar = (nxc) m1eVar.L$0;
            jzb.q(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                imb imbVar = new imb();
                jm3 jm3Var = new jm3(new gz0(ImageDecoder.decodeBitmap(this.a, new zy(this, imbVar, i3))), imbVar.element);
                cgg.t(autoCloseable, null);
                nxcVar.d();
                return jm3Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            nxcVar.d();
            throw th3;
        }
    }
}
