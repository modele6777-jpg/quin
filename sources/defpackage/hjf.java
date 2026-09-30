package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hjf extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ List $deferredList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjf(a26 a26Var, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = a26Var;
        this.$deferredList = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hjf(this.$block, this.$deferredList, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            a26 a26Var = this.$block;
            this.label = 1;
            obj = a26Var.d(this);
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
        List list = this.$deferredList;
        int i2 = 0;
        for (Object obj2 : (Iterable) obj) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            lmg.o0((nu3) obj2, (ya2) list.get(i2));
            i2 = i3;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hjf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
