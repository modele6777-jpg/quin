package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vr5 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ m26 f;

    public /* synthetic */ vr5(int i, float f, bx9 bx9Var, dd2 dd2Var, dd2 dd2Var2, int i2) {
        this.c = i;
        this.b = f;
        this.d = bx9Var;
        this.e = dd2Var;
        this.f = dd2Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        m26 m26Var = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(27649);
                zr5.b(this.c, this.b, (bx9) obj4, (dd2) obj3, (dd2) m26Var, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(this.c | 1);
                qn4.p((uh8) obj4, (j09) obj3, this.b, (x16) m26Var, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ vr5(uh8 uh8Var, j09 j09Var, float f, x16 x16Var, int i) {
        this.d = uh8Var;
        this.e = j09Var;
        this.b = f;
        this.f = x16Var;
        this.c = i;
    }
}
