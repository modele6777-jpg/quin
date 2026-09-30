package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pk3 extends gbe implements l26 {
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ List<bk3> $skins;
    final /* synthetic */ al3 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk3(List list, al3 al3Var, yx9 yx9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skins = list;
        this.$state = al3Var;
        this.$pagerState = yx9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pk3(this.$skins, this.$state, this.$pagerState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            int size = this.$skins.size();
            int i2 = this.$state.b;
            if (i2 >= 0 && i2 < size) {
                int iJ = ((sz9) this.$pagerState.d.c).j();
                int i3 = this.$state.b;
                if (iJ != i3) {
                    yx9 yx9Var = this.$pagerState;
                    this.label = 1;
                    Object objS = yx9.s(yx9Var, i3, this);
                    bw2 bw2Var = bw2.a;
                    if (objS == bw2Var) {
                        return bw2Var;
                    }
                }
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
        return ((pk3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
