package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uo3 implements xga {
    public final /* synthetic */ long a;
    public final /* synthetic */ bp3 b;
    public final /* synthetic */ y45 c;

    public uo3(long j, bp3 bp3Var, y45 y45Var) {
        this.a = j;
        this.b = bp3Var;
        this.c = y45Var;
    }

    @Override // defpackage.xga
    public final void G(boolean z) {
        bp3 bp3Var = this.b;
        if (this.a != bp3Var.x) {
            return;
        }
        s0e s0eVar = bp3Var.X;
        while (true) {
            Object value = s0eVar.getValue();
            boolean z2 = z;
            if (s0eVar.l(value, xha.a((xha) value, z2, false, 0L, 0L, 0L, null, 62))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.xga
    public final void l(int i) {
        Object value;
        Object value2;
        bp3 bp3Var = this.b;
        s0e s0eVar = bp3Var.X;
        if (this.a != bp3Var.x) {
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            do {
                value2 = s0eVar.getValue();
            } while (!s0eVar.l(value2, xha.a((xha) value2, false, false, 0L, 0L, 0L, null, 58)));
            x16 vg3Var = bp3Var.z;
            if (vg3Var == null) {
                vg3Var = new vg3(13);
            }
            vg3Var.invoke();
            return;
        }
        Long l = bp3Var.w;
        y45 y45Var = this.c;
        if (l != null) {
            long jLongValue = l.longValue();
            bp3Var.w = null;
            if (jLongValue > 0) {
                y45Var.I(jLongValue);
            }
        }
        long jP = y45Var.p();
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, xha.a((xha) value, false, true, 0L, y45Var.d(), jP == -9223372036854775807L ? 0L : jP, null, 37)));
    }

    @Override // defpackage.xga
    public final void q(lga lgaVar) {
        Object value;
        lgaVar.getClass();
        bp3 bp3Var = this.b;
        if (this.a == bp3Var.x && !bp3Var.g) {
            bp3Var.d().b("ExoPlayer error: " + lgaVar.getMessage());
            s0e s0eVar = bp3Var.X;
            String str = bp3Var.f;
            if (str != null && !bp3Var.v) {
                ue5 ue5Var = new ue5(new ve5(fyc.u(new to3(0), lgaVar), true, z03.d));
                while (ue5Var.hasNext()) {
                    if (((ps6) ue5Var.next()).responseCode == 416) {
                        bp3Var.v = true;
                        y45 y45Var = bp3Var.b;
                        long j = 0;
                        if (y45Var != null) {
                            long jK = y45Var.k();
                            if (jK >= 0) {
                                j = jK;
                            }
                        }
                        y45 y45Var2 = bp3Var.b;
                        boolean z = (y45Var2 != null && y45Var2.q()) || ((xha) s0eVar.getValue()).a;
                        do {
                            value = s0eVar.getValue();
                        } while (!s0eVar.l(value, xha.a((xha) value, false, false, 0L, 0L, 0L, null, 28)));
                        bp3Var.e = ynb.V(bp3Var.y, null, null, new wo3(bp3Var, lgaVar, str, j, z, null), 3);
                        return;
                    }
                }
            }
            bp3Var.h(lgaVar);
        }
    }
}
