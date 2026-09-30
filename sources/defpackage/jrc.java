package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jrc implements xj5 {
    public final /* synthetic */ orc a;
    public final /* synthetic */ hrc b;
    public final /* synthetic */ imb c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public jrc(orc orcVar, hrc hrcVar, imb imbVar, boolean z, String str, String str2) {
        this.a = orcVar;
        this.b = hrcVar;
        this.c = imbVar;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        Object value;
        npc npcVar = (npc) obj;
        int i = orc.H0;
        orc orcVar = this.a;
        hrc hrcVar = this.b;
        boolean zL = orcVar.l(hrcVar);
        s0e s0eVar = orcVar.F0;
        wef wefVar = wef.a;
        if (zL) {
            if (pa7.t(npcVar, mpc.a)) {
                imb imbVar = this.c;
                if (!imbVar.element && this.d) {
                    imbVar.element = true;
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("follow_up_message"), new alc(this.f, 3), 2);
                    return wefVar;
                }
            } else {
                if (!(npcVar instanceof lpc)) {
                    ap.c();
                    return null;
                }
                upc upcVar = ((lpc) npcVar).a;
                if (upcVar instanceof spc) {
                    s0e s0eVar2 = orcVar.y;
                    do {
                        value = s0eVar2.getValue();
                    } while (!s0eVar2.l(value, t4c.v(((spc) upcVar).a)));
                    orcVar.v = hrcVar.a;
                    s0eVar.n(null, crc.a);
                    return wefVar;
                }
                if ((upcVar instanceof opc) || (upcVar instanceof tpc) || (upcVar instanceof rpc) || pa7.t(upcVar, qpc.a)) {
                    s0eVar.n(null, new brc(this.e));
                    return wefVar;
                }
                if (!pa7.t(upcVar, ppc.a)) {
                    ap.c();
                    return null;
                }
            }
        }
        return wefVar;
    }
}
