package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k21 {
    public final sdd a;
    public final n3f b;
    public final x16 c;
    public final vz9 d;
    public final vz9 e;
    public hkb i;
    public hkb j;
    public ze5 f = l21.a;
    public final j21 g = new j21(this);
    public final vz9 h = q1c.f(null);
    public final i21 k = new i21(this);

    public k21(sdd sddVar, n3f n3fVar, g3f g3fVar, p21 p21Var, x16 x16Var) {
        this.a = sddVar;
        this.b = n3fVar;
        this.c = x16Var;
        this.d = q1c.f(g3fVar);
        this.e = q1c.f(p21Var);
    }

    public final void a(hkb hkbVar, hkb hkbVar2, fv1 fv1Var, hkb hkbVar3, a00 a00Var) {
        p21 p21Var;
        if (((xdd) this.a).e()) {
            this.i = hkbVar;
            this.j = hkbVar2;
            vz9 vz9Var = this.h;
            if (((h0e) vz9Var.getValue()) == null) {
                if (fv1Var == null) {
                    p21Var = (p21) this.e.getValue();
                }
                this.f = p21Var.a(hkbVar, hkbVar2);
            }
            p21Var = fv1Var;
            vz9Var.setValue(((g3f) this.d.getValue()).a(this.g, hkbVar3, a00Var, this.k));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final hkb c() {
        h0e h0eVar;
        hkb hkbVar;
        if (!((xdd) this.a).e() || (h0eVar = (h0e) this.h.getValue()) == null || (hkbVar = (hkb) h0eVar.getValue()) == null) {
            return null;
        }
        long j = ((hl9) this.c.invoke()).a;
        return !hl9.c(j, 0L) ? hkbVar.k(j) : hkbVar;
    }

    public final boolean d() {
        n3f n3fVar = this.b;
        while (true) {
            n3f n3fVar2 = n3fVar.b;
            if (n3fVar2 == null) {
                return !pa7.t(n3fVar.a.a(), n3fVar.d.getValue());
            }
            n3fVar = n3fVar2;
        }
    }
}
