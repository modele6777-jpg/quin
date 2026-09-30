package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zbg extends gbe implements l26 {
    int label;
    final /* synthetic */ ccg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(ccg ccgVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ccgVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zbg(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object ubgVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ccg ccgVar = this.this$0;
                fg7 fg7Var = ccgVar.l;
                ybg ybgVar = new ybg(ccgVar, null);
                this.label = 1;
                obj = ynb.p0(fg7Var, ybgVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            ubgVar = (xbg) obj;
        } catch (sbg e) {
            ubgVar = new wbg(e.getReason());
        } catch (CancellationException unused) {
            ubgVar = new ubg();
        } catch (Throwable th) {
            ff8.h().g(dcg.a, "Unexpected error in WorkerWrapper", th);
            ubgVar = new ubg();
        }
        ccg ccgVar2 = this.this$0;
        Object objP = ccgVar2.g.p(new hla(10, new vh2(2, ubgVar, ccgVar2)));
        objP.getClass();
        return objP;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zbg) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
