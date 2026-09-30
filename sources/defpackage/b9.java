package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(o9 o9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b9 b9Var = new b9(this.this$0, xn2Var);
        b9Var.L$0 = obj;
        return b9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    jzb.q(obj);
                    return wefVar;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            if (str.length() != 0) {
                o9 o9Var = this.this$0;
                this.L$0 = str;
                this.label = 1;
                int i2 = o9.z;
                Object objB = o9Var.b(str, true, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.d().h("Profile re-fetch failed for accountId=" + str, e2);
            return wefVar;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b9) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
