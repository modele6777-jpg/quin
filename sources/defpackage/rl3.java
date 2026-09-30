package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl3 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ aw2 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ rl3(int i, aw2 aw2Var, e89 e89Var, l26 l26Var, x6d x6dVar, pad padVar, pad padVar2, bad badVar, e89 e89Var2) {
        this.b = i;
        this.c = aw2Var;
        this.d = e89Var;
        this.f = l26Var;
        this.g = x6dVar;
        this.v = padVar;
        this.w = padVar2;
        this.x = badVar;
        this.e = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.f;
        aw2 aw2Var = this.c;
        switch (i) {
            case 0:
                yl3 yl3Var = (yl3) obj6;
                ph3 ph3Var = (ph3) obj5;
                gh6 gh6Var = (gh6) obj4;
                n69 n69Var = (n69) obj3;
                s69 s69Var = (s69) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                lyd lydVar = yl3Var.a;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                yl3Var.a = ynb.V(aw2Var, null, null, new zl3(ph3Var, fFloatValue, this.b, this.d, gh6Var, this.e, n69Var, s69Var, null), 3);
                break;
            default:
                l26 l26Var = (l26) obj6;
                x6d x6dVar = (x6d) obj5;
                pad padVar = (pad) obj4;
                pad padVar2 = (pad) obj3;
                bad badVar = (bad) obj2;
                gbd gbdVar = (gbd) obj;
                gbdVar.getClass();
                n6a n6aVar = new n6a(this.b, gbdVar);
                e89 e89Var = this.d;
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new tdf(l26Var, x6dVar, n6aVar, padVar, padVar2, badVar, this.e, e89Var, null), 3);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ rl3(yl3 yl3Var, aw2 aw2Var, ph3 ph3Var, int i, e89 e89Var, gh6 gh6Var, e89 e89Var2, n69 n69Var, s69 s69Var) {
        this.f = yl3Var;
        this.c = aw2Var;
        this.g = ph3Var;
        this.b = i;
        this.d = e89Var;
        this.v = gh6Var;
        this.e = e89Var2;
        this.w = n69Var;
        this.x = s69Var;
    }
}
