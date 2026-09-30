package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mrd {
    public m4 a;

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[LOOP:0: B:22:0x004d->B:34:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[EDGE_INSN: B:53:0x0095->B:35:0x0095 BREAK  A[LOOP:0: B:22:0x004d->B:34:0x0092], SYNTHETIC] */
    public final Object a(yv1 yv1Var, x16 x16Var) {
        nkd nkdVar;
        qxc qxcVar;
        if (this.a == null) {
            epa.b("Called runAndWatch on a manager that has been disposed of");
        }
        m4 m4Var = this.a;
        if ((m4Var instanceof nkd) && (qxcVar = (nkdVar = (nkd) m4Var).g) != null && !qxcVar.equals(yv1Var)) {
            v59 v59Var = new v59();
            qxc qxcVar2 = nkdVar.g;
            if (qxcVar2 == null) {
                epa.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            x79 x79Var = nkdVar.e;
            ArrayList arrayList = v59Var.d;
            if (x79Var != null) {
                Object[] objArr = x79Var.b;
                long[] jArr = x79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new s59(qxcVar2, objArr[(i << 3) + i4]));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = nkdVar.c;
                obj.getClass();
                arrayList.add(new s59(qxcVar2, obj));
            }
            v59Var.o0();
            nkdVar.p0();
            this.a = v59Var;
        }
        m4 m4Var2 = this.a;
        m4Var2.getClass();
        ird irdVarU = qrd.h().u(m4Var2.t0(yv1Var));
        m4Var2.n0(yv1Var);
        try {
            ird irdVarJ = irdVarU.j();
            try {
                Object objInvoke = x16Var.invoke();
                ird.q(irdVarJ);
                irdVarU.c();
                m4Var2.o0();
                return objInvoke;
            } catch (Throwable th) {
                ird.q(irdVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            irdVarU.c();
            throw th2;
        }
    }
}
