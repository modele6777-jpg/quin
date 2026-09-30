package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se3 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ se3(j09 j09Var, long j, a26 a26Var, euc eucVar, j91 j91Var, z67 z67Var, ke3 ke3Var, int i) {
        this.b = j09Var;
        this.c = j;
        this.d = a26Var;
        this.e = eucVar;
        this.f = j91Var;
        this.g = z67Var;
        this.v = ke3Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vf3.n(this.b, this.c, (a26) obj7, (euc) obj6, (j91) obj5, (z67) obj4, (ke3) obj3, (l46) obj, k99.P(7));
                break;
            default:
                fo5 fo5Var = (fo5) obj7;
                use useVar = (use) obj6;
                x84 x84Var = (x84) obj5;
                t69 t69Var = (t69) obj4;
                h0e h0eVar = (h0e) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09Var = this.b;
                    tv0.b(useVar, ynb.Z(ok8.u(j09Var, fo5Var), 8.0f), false, x84Var, null, new wo7(3, 0, 123), null, gec.x, null, t69Var, new dtd(y72.j), new ws4(useVar, j09Var, this.c, h0eVar), null, l46Var, 102236160, 54, 21164);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ se3(j09 j09Var, fo5 fo5Var, use useVar, x84 x84Var, t69 t69Var, long j, m27 m27Var) {
        this.b = j09Var;
        this.d = fo5Var;
        this.e = useVar;
        this.f = x84Var;
        this.g = t69Var;
        this.c = j;
        this.v = m27Var;
    }
}
