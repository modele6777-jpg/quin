package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class br2 extends gbe implements l26 {
    final /* synthetic */ DrawCardSaves $saves;
    int I$0;
    int label;
    final /* synthetic */ dr2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br2(dr2 dr2Var, DrawCardSaves drawCardSaves, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dr2Var;
        this.$saves = drawCardSaves;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new br2(this.this$0, this.$saves, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        QuotaBlockReason quotaBlockReason;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            int iF = this.this$0.a.c.F();
            if (this.this$0.a.c.m0()) {
                quotaBlockReason = null;
            } else {
                j4a j4aVar = this.this$0.b;
                this.I$0 = iF;
                this.label = 1;
                obj = j4aVar.a(iF, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            r0.I0(this.this$0.a.c, this.$saves, quotaBlockReason);
            this.this$0.a.c.z1(null);
            this.this$0.c.d(Boolean.FALSE);
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        p9b p9bVar = (p9b) obj;
        o9b o9bVar = p9bVar instanceof o9b ? (o9b) p9bVar : null;
        if (o9bVar != null) {
            quotaBlockReason = o9bVar.a;
        } else {
            quotaBlockReason = null;
        }
        r0.I0(this.this$0.a.c, this.$saves, quotaBlockReason);
        this.this$0.a.c.z1(null);
        this.this$0.c.d(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((br2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
