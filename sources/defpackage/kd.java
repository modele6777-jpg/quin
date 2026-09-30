package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kd extends hed {
    public tbd a;
    public final vz9 b;

    public kd(tbd tbdVar, hkb hkbVar) {
        this.a = tbdVar;
        this.b = q1c.f(hkbVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[PHI: r3
  0x0079: PHI (r3v3 hkb) = (r3v2 hkb), (r3v6 hkb) binds: [B:3:0x003b, B:19:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.hed
    public final hed a(hcd hcdVar, tbd tbdVar, long j, long j2, long j3) {
        long j4;
        Object obj;
        long jF = hl9.f(j2, j3);
        kxa kxaVar = new kxa();
        kxaVar.a = q1c.f(new ald(j));
        kxaVar.b = q1c.f(new hl9(jF));
        kxaVar.c = q1c.f(new hl9(j3));
        kxaVar.d = q1c.f(new hl9(jF));
        hkb hkbVarC = c();
        if (hkbVarC != null) {
            j4 = j2;
        } else {
            tbd tbdVar2 = this.a;
            if (tbdVar2 == null) {
                List listB = hcdVar.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (hcdVar.c().contains((icd) obj)) {
                        break;
                    }
                    i++;
                }
                icd icdVar = (icd) obj;
                tbdVar2 = icdVar != null ? icdVar.X : null;
            }
            hkbVarC = z7c.n(hcdVar, tbdVar2);
            if (hkbVarC == null) {
                j4 = j2;
                hkbVarC = z5c.g(j4, j);
            } else {
                j4 = j2;
            }
        }
        hkb hkbVar = hkbVarC;
        z7c.r(kxaVar, j, j4, j3, true);
        return new jd(kxaVar, tbdVar, hkbVar);
    }

    @Override // defpackage.hed
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hed
    public final hkb c() {
        return (hkb) this.b.getValue();
    }

    @Override // defpackage.hed
    public final kxa e() {
        return null;
    }

    @Override // defpackage.hed
    public final hkb f(hcd hcdVar) {
        Object obj;
        hkb hkbVarC = c();
        if (hkbVarC != null) {
            return hkbVarC;
        }
        if (c() == null) {
            tbd tbdVar = this.a;
            if (tbdVar == null) {
                List listB = hcdVar.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (hcdVar.c().contains((icd) obj)) {
                        break;
                    }
                    i++;
                }
                icd icdVar = (icd) obj;
                tbdVar = icdVar != null ? icdVar.X : null;
            }
            hkb hkbVarN = z7c.n(hcdVar, tbdVar);
            if (hkbVarN != null) {
                this.b.setValue(hkbVarN);
            }
        }
        return c();
    }

    @Override // defpackage.hed
    public final hed g(tbd tbdVar) {
        if (this.a == null) {
            this.a = tbdVar;
        }
        return this;
    }

    @Override // defpackage.hed
    public final hed h() {
        return mf9.a;
    }

    @Override // defpackage.hed
    public final void i(hkb hkbVar) {
        this.b.setValue(hkbVar);
    }
}
