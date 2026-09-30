package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tkc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fpc b;
    public final /* synthetic */ SolarTerm c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ erc e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ x16 g;

    public /* synthetic */ tkc(fpc fpcVar, SolarTerm solarTerm, boolean z, erc ercVar, a26 a26Var, x16 x16Var) {
        this.a = 0;
        this.b = fpcVar;
        this.c = solarTerm;
        this.d = z;
        this.e = ercVar;
        this.f = a26Var;
        this.g = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    jlc.b(this.b, this.c, this.d, this.e, this.f, this.g, l46Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                jlc.b(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, k99.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                jlc.b(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tkc(int i, int i2, x16 x16Var, a26 a26Var, fpc fpcVar, erc ercVar, SolarTerm solarTerm, boolean z) {
        this.a = i2;
        this.b = fpcVar;
        this.c = solarTerm;
        this.d = z;
        this.e = ercVar;
        this.f = a26Var;
        this.g = x16Var;
    }
}
