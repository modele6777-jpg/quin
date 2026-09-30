package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends j6 {
    public static l6 e;
    public static final txb f = txb.b;
    public static final txb g = txb.a;
    public ste c;
    public ywc d;

    @Override // defpackage.j6
    public final int[] h(int i) {
        int iE;
        if (l().length() > 0 && i < l().length()) {
            try {
                ywc ywcVar = this.d;
                if (ywcVar == null) {
                    pa7.g0("node");
                    throw null;
                }
                hkb hkbVarG = ywcVar.g();
                int iRound = Math.round(hkbVarG.d - hkbVarG.b);
                if (i <= 0) {
                    i = 0;
                }
                ste steVar = this.c;
                if (steVar == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                int iD = steVar.b.d(i);
                ste steVar2 = this.c;
                if (steVar2 == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                float f2 = steVar2.b.f(iD) + iRound;
                ste steVar3 = this.c;
                if (steVar3 == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                b59 b59Var = steVar3.b;
                float f3 = b59Var.f(b59Var.f - 1);
                ste steVar4 = this.c;
                if (f2 < f3) {
                    if (steVar4 == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    iE = steVar4.b.e(f2);
                } else {
                    if (steVar4 == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    iE = steVar4.b.f;
                }
                return k(i, y(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.j6
    public final int[] s(int i) {
        int iE;
        if (l().length() > 0 && i > 0) {
            try {
                ywc ywcVar = this.d;
                if (ywcVar == null) {
                    pa7.g0("node");
                    throw null;
                }
                hkb hkbVarG = ywcVar.g();
                int iRound = Math.round(hkbVarG.d - hkbVarG.b);
                int length = l().length();
                if (length <= i) {
                    i = length;
                }
                ste steVar = this.c;
                if (steVar == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                int iD = steVar.b.d(i);
                ste steVar2 = this.c;
                if (steVar2 == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                float f2 = steVar2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    ste steVar3 = this.c;
                    if (steVar3 == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    iE = steVar3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == l().length() && iE < iD) {
                    iE++;
                }
                return k(y(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int y(int i, txb txbVar) {
        ste steVar = this.c;
        if (steVar == null) {
            pa7.g0("layoutResult");
            throw null;
        }
        int iJ = steVar.j(i);
        ste steVar2 = this.c;
        if (steVar2 == null) {
            pa7.g0("layoutResult");
            throw null;
        }
        txb txbVarK = steVar2.k(iJ);
        ste steVar3 = this.c;
        if (txbVar != txbVarK) {
            if (steVar3 != null) {
                return steVar3.j(i);
            }
            pa7.g0("layoutResult");
            throw null;
        }
        if (steVar3 != null) {
            return steVar3.b.c(i, false) - 1;
        }
        pa7.g0("layoutResult");
        throw null;
    }
}
