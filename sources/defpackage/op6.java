package defpackage;

import ai.askquin.repository.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class op6 extends gbe implements n26 {
    final /* synthetic */ d43 $dailyCardRequester$inlined;
    final /* synthetic */ b $localAssetRepository$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op6(xn2 xn2Var, kq6 kq6Var, d43 d43Var, b bVar) {
        super(3, xn2Var);
        this.this$0 = kq6Var;
        this.$dailyCardRequester$inlined = d43Var;
        this.$localAssetRepository$inlined = bVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        op6 op6Var = new op6((xn2) obj3, this.this$0, this.$dailyCardRequester$inlined, this.$localAssetRepository$inlined);
        op6Var.L$0 = (xj5) obj;
        op6Var.L$1 = obj2;
        return op6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = (xj5) this.L$0;
            iy9 iy9Var = (iy9) this.L$1;
            String str = (String) iy9Var.a();
            b93 b93Var = (b93) iy9Var.b();
            kq6 kq6Var = this.this$0;
            s0e s0eVar = kq6Var.P0;
            vb4 vb4Var = (vb4) kq6Var.d;
            vb4Var.getClass();
            str.getClass();
            wm5 wm5VarT = z5c.t(vb4Var.a, new String[]{"divination"}, new ia(str, vb4Var, 23));
            kl5 kl5Var = new kl5(d43.a(this.$dailyCardRequester$inlined, feg.W(this.this$0.y), new ma8(b93Var.a())), new wo6(this.this$0, null), 1);
            wm5 wm5Var = new wm5(dj6.I(new cp6(this.this$0.c.b)), k8b.a, new xo6(3, null), 0);
            kq6 kq6Var2 = this.this$0;
            wc8 wc8Var = kq6Var2.b.d;
            yo6 yo6Var = new yo6(kq6Var2, b93Var, str, this.$localAssetRepository$inlined, null);
            wj5[] wj5VarArr = {s0eVar, wm5VarT, kl5Var, wm5Var, wc8Var};
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (xj5Var instanceof twe) {
                throw ((twe) xj5Var).a;
            }
            Object objV = lmg.V(this, xj5Var, tq0.z, new vm5(null, yo6Var), wj5VarArr);
            bw2 bw2Var = bw2.a;
            if (objV != bw2Var) {
                objV = wefVar;
            }
            if (objV != bw2Var) {
                objV = wefVar;
            }
            if (objV == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }
}
