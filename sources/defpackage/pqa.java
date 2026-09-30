package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pqa implements k86 {
    public final Object a = new Object();
    public final f99 b = new f99();
    public long c;
    public boolean d;

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            if (this.d) {
                z = true;
            } else {
                hs3 hs3Var = xqa.z0;
                if (((Boolean) z5c.I(nu4.a, new jqa(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zn2 zn2Var) throws Throwable {
        mqa mqaVar;
        d99 d99Var;
        d99 d99Var2;
        boolean z;
        if (zn2Var instanceof mqa) {
            mqaVar = (mqa) zn2Var;
            int i = mqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqaVar.label = i - Integer.MIN_VALUE;
            } else {
                mqaVar = new mqa(this, zn2Var);
            }
        } else {
            mqaVar = new mqa(this, zn2Var);
        }
        Object obj = mqaVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = mqaVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.b;
                mqaVar.L$0 = d99Var;
                mqaVar.J$0 = j;
                mqaVar.label = 1;
                if (d99Var.b(mqaVar) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) mqaVar.L$0;
                try {
                    jzb.q(obj);
                    d99Var = d99Var2;
                    d99Var.h(null);
                    return wef.a;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            j = mqaVar.J$0;
            d99 d99Var3 = (d99) mqaVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            synchronized (this.a) {
                z = this.d && this.c == j;
            }
            if (z) {
                hs3 hs3Var = xqa.z0;
                Boolean bool = Boolean.TRUE;
                isa isaVar = hs3Var.a;
                mqaVar.L$0 = d99Var;
                mqaVar.L$1 = null;
                mqaVar.L$2 = null;
                mqaVar.L$3 = null;
                mqaVar.J$0 = j;
                mqaVar.Z$0 = z;
                mqaVar.label = 2;
                if (bsa.o(isaVar, bool, mqaVar) != bw2Var) {
                    d99Var2 = d99Var;
                    d99Var = d99Var2;
                }
                return bw2Var;
            }
            d99Var.h(null);
            return wef.a;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}
