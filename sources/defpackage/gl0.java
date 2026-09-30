package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl0 implements o26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gl0(tr2 tr2Var, a26 a26Var, x16 x16Var, boolean z, x16 x16Var2) {
        this.e = tr2Var;
        this.b = a26Var;
        this.c = x16Var;
        this.d = z;
        this.f = x16Var2;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                qmf qmfVar = (qmf) obj6;
                cb9 cb9Var = (cb9) obj5;
                l46 l46Var = (l46) obj3;
                ib8.u((Integer) obj4, (ly) obj, (da9) obj2);
                boolean zI = l46Var.i(cb9Var);
                x16 x16Var = this.c;
                boolean zG = zI | l46Var.g(x16Var);
                Object objR = l46Var.R();
                if (zG || objR == sf2.a) {
                    objR = new v6(14, cb9Var, x16Var);
                    l46Var.p0(objR);
                }
                int i2 = qmf.Z;
                aic.c(qmfVar, (x16) objR, this.d, this.b, l46Var, 8);
                return wefVar;
            default:
                tr2 tr2Var = (tr2) obj6;
                x16 x16Var2 = (x16) obj5;
                w4b w4bVar = (w4b) obj2;
                l46 l46Var2 = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                w4bVar.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? l46Var2.g(w4bVar) : l46Var2.i(w4bVar) ? 32 : 16;
                }
                if (!l46Var2.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                    l46Var2.Z();
                } else if (w4bVar instanceof v4b) {
                    l46Var2.f0(-666484326);
                    x57.g(tr2Var, ((v4b) w4bVar).a, null, this.b, this.c, l46Var2, 72, 2);
                    l46Var2.r(false);
                } else {
                    if (!(w4bVar instanceof u4b)) {
                        throw tec.d(-1684069064, l46Var2, false);
                    }
                    l46Var2.f0(-666268380);
                    db6.a(((u4b) w4bVar).a, this.d, x16Var2, l46Var2, 8);
                    l46Var2.r(false);
                }
                return wefVar;
        }
    }

    public /* synthetic */ gl0(qmf qmfVar, cb9 cb9Var, x16 x16Var, boolean z, a26 a26Var) {
        this.e = qmfVar;
        this.f = cb9Var;
        this.c = x16Var;
        this.d = z;
        this.b = a26Var;
    }
}
