package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fu8 extends czb implements l26 {
    final /* synthetic */ e89 $coordinates$delegate;
    final /* synthetic */ iu8 $selections;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu8(iu8 iu8Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$selections = iu8Var;
        this.$coordinates$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fu8 fu8Var = new fu8(this.$selections, this.$coordinates$delegate, xn2Var);
        fu8Var.L$0 = obj;
        return fu8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bv7 bv7Var;
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.L$0 = null;
            this.label = 1;
            obj = ffe.a(mbeVar, false, iia.a, this);
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
        oia oiaVar = (oia) obj;
        e89 e89Var = this.$coordinates$delegate;
        pr4 pr4Var = gu8.a;
        bv7 bv7Var2 = (bv7) e89Var.getValue();
        if (bv7Var2 != null && bv7Var2.h()) {
            iu8 iu8Var = this.$selections;
            long jC = bv7Var2.c(oiaVar.c);
            ListIterator listIterator = iu8Var.a.listIterator();
            while (true) {
                ql6 ql6Var = (ql6) listIterator;
                if (!ql6Var.hasNext()) {
                    break;
                }
                hu8 hu8Var = (hu8) ql6Var.next();
                if (!((List) hu8Var.a.c.getValue()).isEmpty() && ((bv7Var = hu8Var.b) == null || !bv7Var.h() || !vd0.N(bv7Var, true).a(jC))) {
                    fwc fwcVar = hu8Var.a.b;
                    if (fwcVar != null) {
                        fwcVar.m();
                    }
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fu8) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
