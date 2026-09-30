package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ml6 extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ol6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml6(xn2 xn2Var, ol6 ol6Var) {
        super(3, xn2Var);
        this.this$0 = ol6Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ml6 ml6Var = new ml6((xn2) obj3, this.this$0);
        ml6Var.L$0 = (xj5) obj;
        ml6Var.L$1 = obj2;
        return ml6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = (xj5) this.L$0;
            String str = (String) this.L$1;
            tc4 tc4Var = this.this$0.b;
            tc4Var.getClass();
            str.getClass();
            vb4 vb4Var = (vb4) tc4Var.a;
            wm5 wm5VarT = z5c.t(vb4Var.a, new String[]{"divination"}, new ia(str, vb4Var, 23));
            n6b n6bVar = (n6b) this.this$0.c;
            n6bVar.getClass();
            wm5 wm5VarT2 = z5c.t(n6bVar.a, new String[]{"quick_decision"}, new h6b(0, str, n6bVar));
            ol6 ol6Var = this.this$0;
            s0e s0eVar = ol6Var.w;
            s0e s0eVar2 = ol6Var.v;
            nl6 nl6Var = new nl6(null, ol6Var);
            wj5[] wj5VarArr = {wm5VarT, wm5VarT2, s0eVar, s0eVar2};
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (xj5Var instanceof twe) {
                throw ((twe) xj5Var).a;
            }
            Object objV = lmg.V(this, xj5Var, tq0.z, new um5(null, nl6Var), wj5VarArr);
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
