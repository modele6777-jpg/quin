package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pe8 extends gbe implements l26 {
    int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pe8 pe8Var = new pe8(2, xn2Var);
        pe8Var.L$0 = obj;
        return pe8Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        ?? r5;
        Throwable th = (Throwable) this.L$0;
        int i2 = this.label;
        if (i2 == 0) {
            jzb.q(obj);
            boolean z = th instanceof IOException;
            if (z) {
                this.L$0 = null;
                this.I$0 = z ? 1 : 0;
                this.label = 1;
                Object objQ = vfh.q(2000L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    r5 = z;
                    return bw2Var;
                }
                r5 = z;
                i = z ? 1 : 0;
            }
            return Boolean.valueOf(r5 != 0);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        jzb.q(obj);
        r5 = i;
        return Boolean.valueOf(r5 != 0);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pe8) k((xn2) obj2, (Throwable) obj)).r(wef.a);
    }
}
