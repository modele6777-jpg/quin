package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f75 extends gbe implements n26 {
    final /* synthetic */ nb4 $divinationDao$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k75 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f75(xn2 xn2Var, nb4 nb4Var, k75 k75Var) {
        super(3, xn2Var);
        this.$divinationDao$inlined = nb4Var;
        this.this$0 = k75Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        f75 f75Var = new f75((xn2) obj3, this.$divinationDao$inlined, this.this$0);
        f75Var.L$0 = (xj5) obj;
        f75Var.L$1 = obj2;
        return f75Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        xj5 xj5Var = (xj5) this.L$0;
        String str = (String) this.L$1;
        vb4 vb4Var = (vb4) this.$divinationDao$inlined;
        vb4Var.getClass();
        str.getClass();
        t75 t75Var = new t75(z5c.t(vb4Var.a, new String[]{"divination"}, new ob4(str, vb4Var, 4)));
        js3 js3Var = ga4.a;
        wj5 wj5VarX = ym8.x(t75Var, hr3.c);
        k75 k75Var = this.this$0;
        d43 d43Var = k75Var.b;
        gd8 gd8Var = k75Var.c;
        th5 th5Var = cye.b;
        wm5 wm5Var = new wm5(d43.a(d43Var, f63.a, gcc.E(z57.a.a(), fbc.d()).a()), dj6.I(new o75(gd8Var.d)), new p75(3, null), 0);
        e75 e75Var = new e75(3, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        if (xj5Var instanceof twe) {
            throw ((twe) xj5Var).a;
        }
        Object objV = lmg.V(this, xj5Var, tq0.z, new xm5(e75Var, null), new wj5[]{wj5VarX, wm5Var});
        bw2 bw2Var = bw2.a;
        if (objV != bw2Var) {
            objV = wefVar;
        }
        if (objV != bw2Var) {
            objV = wefVar;
        }
        return objV == bw2Var ? bw2Var : wefVar;
    }
}
