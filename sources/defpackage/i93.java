package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i93 extends gbe implements a26 {
    int label;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new i93(1, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        h93 h93Var = new h93(2, null);
        this.label = 1;
        Object objP0 = ynb.p0(hr3Var, h93Var, this);
        bw2 bw2Var = bw2.a;
        return objP0 == bw2Var ? bw2Var : objP0;
    }
}
