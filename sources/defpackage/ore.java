package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ore implements qne {
    public final x16 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public sg6 e = sg6.c;
    public boolean f = true;
    public wuc g = gec.c;
    public final /* synthetic */ jse h;

    public ore(jse jseVar, x16 x16Var) {
        this.h = jseVar;
        this.a = x16Var;
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
        jse jseVar = this.h;
        boolean z = jseVar.i;
        z2f z2fVar = jseVar.a;
        ute uteVar = jseVar.b;
        if (z) {
            jseVar.A(this.e, j);
            jseVar.w(false);
            jseVar.q.setValue(mre.b);
            this.c = j;
            this.d = 0L;
            jseVar.v = -1;
            this.f = true;
            this.g = wucVar;
            if (uteVar.c() == null) {
                return;
            }
            if (uteVar.f(j)) {
                if (z2fVar.d().c.length() == 0) {
                    return;
                }
                int iD = uteVar.d(j, true);
                long jB = jseVar.B(new vne(jseVar.a.d(), eue.b, null, null, null, null, null, 124), iD, iD, false, this.g, false, false, new fh6(0));
                z2fVar.j(jB);
                jseVar.x(sue.c);
                this.b = (int) (jB >> 32);
                return;
            }
            int iD2 = uteVar.d(j, true);
            eh6 eh6Var = jseVar.j;
            if (eh6Var != null) {
                ((afa) eh6Var).a(0);
            }
            z2fVar.getClass();
            z2fVar.j(u3c.b(iD2, iD2));
            jseVar.w(true);
            this.f = false;
            jseVar.x(sue.b);
        }
    }

    @Override // defpackage.qne
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[PHI: r16
  0x00ff: PHI (r16v4 long) = (r16v3 long), (r16v5 long) binds: [B:60:0x0113, B:56:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.qne
    public final void e(long j) {
        int iIntValue;
        int iD;
        wuc wucVar;
        k00 k00Var;
        long j2;
        jse jseVar = this.h;
        boolean z = jseVar.i;
        z2f z2fVar = jseVar.a;
        ute uteVar = jseVar.b;
        if (!z || uteVar.c() == null || z2fVar.d().c.length() == 0) {
            return;
        }
        long jG = hl9.g(this.d, j);
        this.d = jG;
        long jG2 = hl9.g(this.c, jG);
        if (this.b >= 0 || uteVar.f(jG2)) {
            ste steVarC = uteVar.c();
            int length = (steVarC == null || (k00Var = steVarC.a.a) == null) ? 0 : k00Var.b.length();
            int i = this.b;
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > length) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : uteVar.d(this.c, false);
            iD = uteVar.d(jG2, false);
            if (this.b < 0 && iIntValue == iD) {
                return;
            }
            wucVar = this.g;
            jseVar.x(sue.c);
        } else {
            iIntValue = uteVar.d(this.c, true);
            iD = uteVar.d(jG2, true);
            wucVar = iIntValue == iD ? gec.c : this.g;
        }
        wuc wucVar2 = wucVar;
        int i2 = iIntValue;
        int i3 = iD;
        long j3 = z2fVar.d().d;
        long jB = jseVar.B(jseVar.a.d(), i2, i3, false, wucVar2, false, false, new fh6(9));
        if (this.b == -1 && !eue.d(jB)) {
            this.b = (int) (jB >> 32);
        }
        if (eue.h(jB)) {
            jB = u3c.b((int) (jB & 4294967295L), (int) (jB >> 32));
        }
        if (eue.c(jB, j3)) {
            j2 = j3;
        } else {
            int i4 = (int) (jB >> 32);
            int i5 = (int) (j3 >> 32);
            sg6 sg6Var = sg6.b;
            if (i4 == i5 || ((int) (jB & 4294967295L)) != ((int) (j3 & 4294967295L))) {
                sg6 sg6Var2 = sg6.c;
                if (i4 == i5) {
                    j2 = j3;
                    if (((int) (jB & 4294967295L)) != ((int) (j2 & 4294967295L))) {
                        sg6Var = sg6Var2;
                    }
                } else {
                    j2 = j3;
                }
                if ((i4 + ((int) (jB & 4294967295L))) / 2.0f > (i5 + ((int) (j2 & 4294967295L))) / 2.0f) {
                    sg6Var = sg6Var2;
                }
            } else {
                j2 = j3;
            }
            this.e = sg6Var;
            this.f = false;
        }
        if (eue.d(j2) || !eue.d(jB)) {
            z2fVar.j(jB);
        }
        jseVar.A(this.e, jG2);
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            jse jseVar = this.h;
            jseVar.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            jseVar.v = -1;
            this.g = gec.c;
            jseVar.q.setValue(mre.a);
            this.a.invoke();
            if (this.f) {
                jseVar.r();
            }
        }
    }

    @Override // defpackage.qne
    public final void onCancel() {
        f();
    }

    @Override // defpackage.qne
    public final void c() {
    }

    @Override // defpackage.qne
    public final void d() {
    }
}
