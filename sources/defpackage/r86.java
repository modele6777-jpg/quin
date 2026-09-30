package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r86 extends gbe implements l26 {
    final /* synthetic */ long $generation;
    final /* synthetic */ wa6 $tab;
    int label;
    final /* synthetic */ s86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r86(s86 s86Var, wa6 wa6Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = s86Var;
        this.$tab = wa6Var;
        this.$generation = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r86(this.this$0, this.$tab, this.$generation, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        Object value2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                u96 u96Var = this.this$0.b;
                wa6 wa6Var = this.$tab;
                this.label = 1;
                obj = u96Var.a.g(wa6Var, this);
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
            List list = (List) obj;
            s86 s86Var = this.this$0;
            if (s86Var.v == this.$generation && ((p86) s86Var.e.getValue()).a == this.$tab) {
                Map mapT = y7h.t(new ssg(19, list));
                this.this$0.d.e("Gift card list load succeeded: tab=" + this.$tab + ", generation=" + this.$generation + ", count=" + list.size() + ", statuses=" + mapT);
                s0e s0eVar = this.this$0.e;
                do {
                    value2 = s0eVar.getValue();
                } while (!s0eVar.l(value2, p86.a((p86) value2, null, list, false, null, 9)));
            } else {
                s86 s86Var2 = this.this$0;
                s86Var2.d.e("Gift card list response discarded: tab=" + this.$tab + ", generation=" + this.$generation + ", currentTab=" + ((p86) s86Var2.e.getValue()).a + ", currentGeneration=" + this.this$0.v);
            }
        } catch (CancellationException e) {
            this.this$0.d.e("Gift card list load cancelled: tab=" + this.$tab + ", generation=" + this.$generation);
            throw e;
        } catch (Exception e2) {
            this.this$0.d.c("Gift card list load failed: tab=" + this.$tab + ", generation=" + this.$generation, e2);
            s86 s86Var3 = this.this$0;
            if (s86Var3.v == this.$generation && ((p86) s86Var3.e.getValue()).a == this.$tab) {
                s0e s0eVar2 = this.this$0.e;
                do {
                    value = s0eVar2.getValue();
                } while (!s0eVar2.l(value, p86.a((p86) value, null, null, false, e2, 3)));
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r86) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
