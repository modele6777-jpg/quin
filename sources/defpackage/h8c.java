package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h8c {
    public final f99 a = new f99();
    public final za2 b = new za2();

    public abstract Object a(zn2 zn2Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) throws Throwable {
        g8c g8cVar;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof g8c) {
            g8cVar = (g8c) zn2Var;
            int i = g8cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8cVar.label = i - Integer.MIN_VALUE;
            } else {
                g8cVar = new g8c(this, zn2Var);
            }
        } else {
            g8cVar = new g8c(this, zn2Var);
        }
        Object obj = g8cVar.result;
        int i2 = g8cVar.label;
        wef wefVar = wef.a;
        za2 za2Var = this.b;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (za2Var.L0()) {
                    return wefVar;
                }
                d99Var = this.a;
                g8cVar.L$0 = d99Var;
                g8cVar.label = 1;
                if (d99Var.b(g8cVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) g8cVar.L$0;
                try {
                    jzb.q(obj);
                    za2Var.R(wefVar);
                    d99Var2.h(null);
                    return wefVar;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) g8cVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            if (za2Var.L0()) {
                d99Var.h(null);
                return wefVar;
            }
            g8cVar.L$0 = d99Var;
            g8cVar.label = 2;
            if (a(g8cVar) != obj2) {
                d99Var2 = d99Var;
                za2Var.R(wefVar);
                d99Var2.h(null);
                return wefVar;
            }
            return obj2;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }
}
