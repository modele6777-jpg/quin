package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t16 extends gbe implements l26 {
    final /* synthetic */ long $generation;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ u16 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t16(u16 u16Var, long j, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = u16Var;
        this.$generation = j;
        this.$showLoading = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t16(this.this$0, this.$generation, this.$showLoading, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                p06 p06Var = this.this$0.b;
                this.label = 1;
                obj = p06Var.a(this);
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
            l06 l06Var = (l06) obj;
            long j = this.$generation;
            u16 u16Var = this.this$0;
            if (j == u16Var.f) {
                u16Var.c.n(null, l06Var.d > 0 ? new o16(l06Var) : new p16(l06Var));
                u16 u16Var2 = this.this$0;
                if (!u16Var2.g) {
                    u16Var2.g = true;
                    int i2 = l06Var.c;
                    x1f x1fVar = x1f.a;
                    x1f.g(new r05("page_show"), m1f.a, new xp(i2, 9));
                    return wefVar;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            long j2 = this.$generation;
            u16 u16Var3 = this.this$0;
            if (j2 == u16Var3.f && this.$showLoading) {
                u16Var3.c.n(null, q16.a);
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t16) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
