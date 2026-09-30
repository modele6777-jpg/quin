package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cv9 implements n26 {
    public final /* synthetic */ x16 E0;
    public final /* synthetic */ d6f X;
    public final /* synthetic */ x16 Y;
    public final /* synthetic */ x16 Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sfb d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ x16 g;
    public final /* synthetic */ bd4 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ a26 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ cv9(boolean z, boolean z2, sfb sfbVar, boolean z3, a26 a26Var, x16 x16Var, bd4 bd4Var, boolean z4, a26 a26Var2, boolean z5, boolean z6, d6f d6fVar, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = sfbVar;
        this.e = z3;
        this.f = a26Var;
        this.g = x16Var;
        this.v = bd4Var;
        this.w = z4;
        this.x = a26Var2;
        this.y = z5;
        this.z = z6;
        this.X = d6fVar;
        this.Y = x16Var2;
        this.Z = x16Var3;
        this.E0 = x16Var4;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    jgb.C(null, false, ynb.q(24.0f, 0.0f, 2), af1.b0(1928558757, new cv9(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, 1), l46Var), l46Var, 3456, 3);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    bd4 bd4Var = this.v;
                    boolean z = this.w;
                    a26 a26Var = this.x;
                    boolean z2 = this.y;
                    boolean z3 = this.z;
                    d6f d6fVar = this.X;
                    vd0.l(432, af1.b0(-1004308054, new hv9(bd4Var, z, a26Var, z2, z3, d6fVar, this.Y, this.Z), l46Var2), l46Var2, null, false);
                    if (this.b && this.c) {
                        l46Var2.f0(-82696158);
                        j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 16.0f, 5, g09.a);
                        dd2 dd2VarB0 = af1.b0(1909238714, new ev9(d6fVar, this.E0, 1), l46Var2);
                        a26 a26Var2 = this.f;
                        boolean zG = l46Var2.g(a26Var2);
                        Object objR = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zG || objR == i8cVar) {
                            objR = new zh1(a26Var2, 25);
                            l46Var2.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zG2 = l46Var2.g(a26Var2);
                        Object objR2 = l46Var2.R();
                        if (zG2 || objR2 == i8cVar) {
                            objR2 = new zh1(a26Var2, 26);
                            l46Var2.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zG3 = l46Var2.g(a26Var2);
                        Object objR3 = l46Var2.R();
                        if (zG3 || objR3 == i8cVar) {
                            objR3 = new zh1(a26Var2, 27);
                            l46Var2.p0(objR3);
                        }
                        dj6.v(j09VarD0, dd2VarB0, this.d, this.e, x16Var, x16Var2, (x16) objR3, this.g, l46Var2, 54);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-82055171);
                        l46Var2.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }
}
