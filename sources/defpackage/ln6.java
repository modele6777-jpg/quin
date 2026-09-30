package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln6 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ m26 f;

    public /* synthetic */ ln6(long j, String str, dba dbaVar, ro2 ro2Var, l26 l26Var, int i) {
        this.b = j;
        this.c = str;
        this.d = dbaVar;
        this.e = ro2Var;
        this.f = l26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        m26 m26Var = this.f;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                n16.m((j09) obj4, this.b, (rh5) obj3, this.e, (x16) m26Var, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(1);
                tq.i(this.b, (String) obj4, (dba) obj3, (ro2) this.e, (l26) m26Var, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ln6(j09 j09Var, long j, rh5 rh5Var, x16 x16Var, x16 x16Var2, int i) {
        this.c = j09Var;
        this.b = j;
        this.d = rh5Var;
        this.e = x16Var;
        this.f = x16Var2;
    }
}
