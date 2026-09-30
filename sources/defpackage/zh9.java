package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh9 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ zh9(int i, uh9 uh9Var, x16 x16Var, x16 x16Var2, gpf gpfVar, o9 o9Var, uo uoVar) {
        this.b = i;
        this.d = uh9Var;
        this.c = x16Var;
        this.e = x16Var2;
        this.f = gpfVar;
        this.g = o9Var;
        this.v = uoVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        lyd lydVar;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.v;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i2 = 1;
        switch (i) {
            case 0:
                uh9 uh9Var = (uh9) obj5;
                x16 x16Var = (x16) obj4;
                gpf gpfVar = (gpf) obj3;
                o9 o9Var = (o9) obj2;
                uo uoVar = (uo) obj;
                ndc.m(this.b, "enable_notification");
                if (!uyb.k(uh9Var.a)) {
                    uh9Var.a(new yh9(x16Var, gpfVar, o9Var, i2), new q83(uoVar, 1));
                } else {
                    this.c.invoke();
                    x16Var.invoke();
                }
                break;
            default:
                bad badVar = (bad) obj5;
                final vad vadVar = (vad) obj3;
                final aw2 aw2Var = (aw2) obj2;
                final mmb mmbVar = (mmb) obj;
                if (((o6a) ((e89) obj4).getValue()) == null) {
                    final int i3 = this.b;
                    final x16 x16Var2 = this.c;
                    x16 x16Var3 = new x16() { // from class: hdf
                        @Override // defpackage.x16
                        public final Object invoke() {
                            vad vadVar2 = vadVar;
                            int i4 = i3;
                            u6d u6dVar = u6d.BackPress;
                            if (vadVar2.b(i4, u6dVar)) {
                                ynb.V(aw2Var, null, null, new sdf(mmbVar, u6dVar, vadVar2, i4, x16Var2, null), 3);
                            }
                            return wef.a;
                        }
                    };
                    if (!badVar.f()) {
                        u6d u6dVar = u6d.BackPress;
                        if (vadVar.b(i3, u6dVar)) {
                            ynb.V(aw2Var, null, null, new sdf(mmbVar, u6dVar, vadVar, i3, x16Var2, null), 3);
                        }
                    } else {
                        String str = badVar.n;
                        if (str != null && ((lydVar = badVar.p) == null || !lydVar.b())) {
                            badVar.p = ynb.V(badVar.j, null, null, new j9d(badVar, str, x16Var3, null), 3);
                        }
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zh9(bad badVar, e89 e89Var, vad vadVar, int i, aw2 aw2Var, mmb mmbVar, x16 x16Var) {
        this.d = badVar;
        this.e = e89Var;
        this.f = vadVar;
        this.b = i;
        this.g = aw2Var;
        this.v = mmbVar;
        this.c = x16Var;
    }
}
