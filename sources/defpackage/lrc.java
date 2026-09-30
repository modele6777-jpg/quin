package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lrc implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ orc b;
    public final /* synthetic */ hrc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ SolarTerm e;

    public /* synthetic */ lrc(orc orcVar, hrc hrcVar, int i, SolarTerm solarTerm, int i2) {
        this.a = i2;
        this.b = orcVar;
        this.c = hrcVar;
        this.d = i;
        this.e = solarTerm;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        Object value;
        Object value2;
        int i = this.a;
        SolarTerm solarTerm = this.e;
        int i2 = this.d;
        grc grcVar = grc.a;
        hrc hrcVar = this.c;
        orc orcVar = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                upc upcVar = (upc) obj;
                int i3 = orc.H0;
                if (!orcVar.l(hrcVar)) {
                    return wefVar;
                }
                orcVar.Z.m(upcVar);
                if (!(upcVar instanceof spc)) {
                    return wefVar;
                }
                s0e s0eVar = orcVar.y;
                do {
                    value = s0eVar.getValue();
                } while (!s0eVar.l(value, t4c.v(((spc) upcVar).a)));
                orcVar.X.n(null, grcVar);
                orcVar.v = hrcVar.a;
                orcVar.d = null;
                return orcVar.c.e(i2, solarTerm.getWireValue(), new pdc(17), xn2Var);
            default:
                upc upcVar2 = (upc) obj;
                int i4 = orc.H0;
                if (!orcVar.l(hrcVar)) {
                    return wefVar;
                }
                orcVar.Z.m(upcVar2);
                if (!(upcVar2 instanceof spc)) {
                    return wefVar;
                }
                s0e s0eVar2 = orcVar.y;
                do {
                    value2 = s0eVar2.getValue();
                } while (!s0eVar2.l(value2, t4c.v(((spc) upcVar2).a)));
                orcVar.X.n(null, grcVar);
                orcVar.v = hrcVar.a;
                return orcVar.c.e(i2, solarTerm.getWireValue(), new pdc(17), xn2Var);
        }
    }
}
