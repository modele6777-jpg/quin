package defpackage;

import ai.askquin.repository.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lp6 extends gbe implements l26 {
    final /* synthetic */ b $localAssetRepository;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp6(b bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$localAssetRepository = bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lp6 lp6Var = new lp6(this.$localAssetRepository, xn2Var);
        lp6Var.L$0 = obj;
        return lp6Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            List listC = this.$localAssetRepository.c();
            this.L$0 = null;
            this.label = 1;
            Object objA = xj5Var.a(listC, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lp6) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
