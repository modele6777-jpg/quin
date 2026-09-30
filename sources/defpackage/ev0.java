package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 implements ene {
    public final dd2 a;
    public final b99 b = new b99();
    public final vz9 c = q1c.f(null);

    public ev0(dd2 dd2Var) {
        this.a = dd2Var;
    }

    @Override // defpackage.ene
    public final Object a(ume umeVar, zn2 zn2Var) {
        Object objA = b99.a(this.b, new dv0(this, new cv0(umeVar), null), zn2Var);
        return objA == bw2.a ? objA : wef.a;
    }

    public final void b(final x16 x16Var, l46 l46Var, final int i) {
        final x16 x16Var2;
        l46 l46Var2;
        l46Var.h0(723898654);
        int i2 = (l46Var.g(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            cv0 cv0Var = (cv0) this.c.getValue();
            if (cv0Var == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26(this, x16Var, i, i3) { // from class: bv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ ev0 b;
                        public final /* synthetic */ x16 c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i5 = this.a;
                            wef wefVar = wef.a;
                            x16 x16Var3 = this.c;
                            ev0 ev0Var = this.b;
                            l46 l46Var3 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    ev0Var.b(x16Var3, l46Var3, k99.P(7));
                                    break;
                                default:
                                    ev0Var.b(x16Var3, l46Var3, k99.P(7));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            this.a.C(cv0Var, cv0Var.a, x16Var2, l46Var2, 384);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new l26(this, x16Var2, i, i4) { // from class: bv0
                public final /* synthetic */ int a;
                public final /* synthetic */ ev0 b;
                public final /* synthetic */ x16 c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i5 = this.a;
                    wef wefVar = wef.a;
                    x16 x16Var3 = this.c;
                    ev0 ev0Var = this.b;
                    l46 l46Var3 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            ev0Var.b(x16Var3, l46Var3, k99.P(7));
                            break;
                        default:
                            ev0Var.b(x16Var3, l46Var3, k99.P(7));
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }
}
