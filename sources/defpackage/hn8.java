package defpackage;

import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hn8 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qn8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn8(qn8 qn8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qn8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hn8 hn8Var = new hn8(this.this$0, xn2Var);
        hn8Var.L$0 = obj;
        return hn8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                qn8 qn8Var = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                ZoneId zoneId = qn8.c;
                Object objA = qn8Var.a(this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        qn8 qn8Var2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            qn8Var2.d().c("MayDayDeckReset failed", thA);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hn8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
