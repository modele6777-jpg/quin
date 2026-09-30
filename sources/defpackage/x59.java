package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x59 {
    public final long a;
    public final gvc b;
    public final gvc c;
    public final gvc d;
    public final k31 e;
    public ste g;
    public final x59 f = this;
    public int h = -1;

    public x59(long j, gvc gvcVar, gvc gvcVar2, gvc gvcVar3, n31 n31Var) {
        this.a = j;
        this.b = gvcVar;
        this.c = gvcVar2;
        this.d = gvcVar3;
        this.e = n31Var;
    }

    public final long a(vuc vucVar, boolean z) {
        ste steVar;
        uuc uucVar = vucVar.b;
        uuc uucVar2 = vucVar.a;
        long j = this.a;
        if (z && uucVar2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && uucVar.c != j) || c() == null || (steVar = (ste) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return t4c.s(steVar, mh3.o(z ? uucVar2.b : uucVar.b, 0, b(steVar)), z, vucVar.c);
    }

    public final int b(ste steVar) {
        int i;
        int iE;
        synchronized (this.f) {
            try {
                if (this.g != steVar) {
                    if (steVar.d()) {
                        b59 b59Var = steVar.b;
                        if (b59Var.c) {
                            iE = steVar.b.f - 1;
                        } else {
                            iE = b59Var.e((int) (steVar.c & 4294967295L));
                            int i2 = steVar.b.f - 1;
                            if (iE > i2) {
                                iE = i2;
                            }
                            while (iE >= 0 && steVar.b.f(iE) >= ((int) (steVar.c & 4294967295L))) {
                                iE--;
                            }
                            if (iE < 0) {
                                iE = 0;
                            }
                        }
                    } else {
                        iE = steVar.b.f - 1;
                    }
                    this.h = steVar.b.c(iE, true);
                    this.g = steVar;
                }
                i = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final bv7 c() {
        bv7 bv7Var = (bv7) this.b.invoke();
        if (bv7Var == null || !bv7Var.h()) {
            return null;
        }
        return bv7Var;
    }

    public final vuc d() {
        ste steVar = (ste) this.c.invoke();
        if (steVar == null) {
            return null;
        }
        int length = steVar.a.a.b.length();
        txb txbVarA = steVar.a(0);
        long j = this.a;
        return new vuc(new uuc(txbVarA, 0, j), new uuc(steVar.a(Math.max(length - 1, 0)), length, j), false);
    }

    public final k00 e() {
        ste steVar = (ste) this.c.invoke();
        return steVar == null ? new k00("") : steVar.a.a;
    }
}
