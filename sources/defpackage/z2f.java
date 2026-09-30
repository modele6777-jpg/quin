package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z2f {
    public final use a;
    public u47 b;
    public final i8c c;
    public final mx3 d;
    public final vz9 e;

    public z2f(use useVar, u47 u47Var, i8c i8cVar) {
        this.a = useVar;
        this.b = u47Var;
        this.c = i8cVar;
        this.d = i8cVar != null ? zrd.b(new ykc(26, this, i8cVar)) : null;
        q2g q2gVar = q2g.a;
        this.e = q1c.f(new rwc(q2gVar, q2gVar));
    }

    public static void h(z2f z2fVar, CharSequence charSequence, boolean z, boolean z2, int i) {
        boolean z3 = (i & 2) == 0;
        fpe fpeVar = (i & 4) != 0 ? fpe.a : fpe.b;
        boolean z4 = (i & 8) != 0 ? true : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        use useVar = z2fVar.a;
        u47 u47Var = z2fVar.b;
        useVar.b.a().v();
        une uneVar = useVar.b;
        if (z3) {
            uneVar.g(null);
        }
        long j = uneVar.g;
        une.d(uneVar, eue.g(j), eue.f(j), charSequence, 0, z5, 24);
        int length = charSequence.length() + eue.g(j);
        xdc.u(uneVar, length, length);
        z2fVar.l(uneVar);
        useVar.b(u47Var, z4, fpeVar);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    public static void i(z2f z2fVar, String str, long j, boolean z, boolean z2, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        use useVar = z2fVar.a;
        u47 u47Var = z2fVar.b;
        useVar.b.a().v();
        une uneVar = useVar.b;
        long jE = z2fVar.e(j);
        une.d(uneVar, eue.g(jE), eue.f(jE), str, 0, z3, 24);
        int length = str.length() + eue.g(jE);
        xdc.u(uneVar, length, length);
        z2fVar.l(uneVar);
        useVar.b(u47Var, z, fpe.a);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    public final void a() {
        u47 u47Var = this.b;
        use useVar = this.a;
        useVar.b.a().v();
        une uneVar = useVar.b;
        int iF = eue.f(uneVar.g);
        xdc.u(uneVar, iF, iF);
        useVar.b(u47Var, true, fpe.a);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(xv xvVar, zn2 zn2Var) {
        y2f y2fVar;
        if (zn2Var instanceof y2f) {
            y2fVar = (y2f) zn2Var;
            int i = y2fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2fVar.label = i - Integer.MIN_VALUE;
            } else {
                y2fVar = new y2f(this, zn2Var);
            }
        } else {
            y2fVar = new y2f(this, zn2Var);
        }
        Object obj = y2fVar.result;
        int i2 = y2fVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            y2fVar.L$0 = xvVar;
            y2fVar.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(y2fVar));
            pl1Var.v();
            this.a.h.b(xvVar);
            pl1Var.x(new d5(29, this, xvVar));
            if (pl1Var.t() == bw2.a) {
                return;
            }
        } else if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            jzb.q(obj);
        }
        oo3.f();
    }

    public final void c(boolean z) {
        u47 u47Var = this.b;
        use useVar = this.a;
        useVar.b.a().v();
        une uneVar = useVar.b;
        une.d(uneVar, eue.g(uneVar.g), eue.f(uneVar.g), "", 0, z, 24);
        int iG = eue.g(uneVar.g);
        xdc.u(uneVar, iG, iG);
        l(uneVar);
        useVar.b(u47Var, true, fpe.b);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    public final vne d() {
        x2f x2fVar;
        mx3 mx3Var = this.d;
        return (mx3Var == null || (x2fVar = (x2f) mx3Var.getValue()) == null) ? this.a.d() : x2fVar.a;
    }

    public final long e(long j) {
        x2f x2fVar;
        mx3 mx3Var = this.d;
        f77 f77Var = (mx3Var == null || (x2fVar = (x2f) mx3Var.getValue()) == null) ? null : x2fVar.b;
        if (f77Var == null) {
            return j;
        }
        int i = eue.c;
        long jA = f77Var.a((int) (j >> 32), false);
        long jA2 = eue.d(j) ? jA : f77Var.a((int) (4294967295L & j), false);
        int iMin = Math.min(eue.g(jA), eue.g(jA2));
        int iMax = Math.max(eue.f(jA), eue.f(jA2));
        return eue.h(j) ? u3c.b(iMax, iMin) : u3c.b(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2f)) {
            return false;
        }
        z2f z2fVar = (z2f) obj;
        return pa7.t(this.a, z2fVar.a) && pa7.t(this.c, z2fVar.c);
    }

    public final long f(long j) {
        x2f x2fVar;
        mx3 mx3Var = this.d;
        f77 f77Var = (mx3Var == null || (x2fVar = (x2f) mx3Var.getValue()) == null) ? null : x2fVar.b;
        return f77Var != null ? aic.o(j, f77Var, (rwc) this.e.getValue()) : j;
    }

    public final void g(CharSequence charSequence) {
        u47 u47Var = this.b;
        use useVar = this.a;
        useVar.b.a().v();
        une uneVar = useVar.b;
        uneVar.c(0, uneVar.c.length(), "");
        uneVar.append(charSequence.toString());
        l(uneVar);
        useVar.b(u47Var, true, fpe.a);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i8c i8cVar = this.c;
        return (iHashCode + (i8cVar != null ? i8cVar.hashCode() : 0)) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        u47 u47Var = this.b;
        use useVar = this.a;
        useVar.b.a().v();
        une uneVar = useVar.b;
        int i = eue.c;
        xdc.u(uneVar, (int) (j >> 32), (int) (j & 4294967295L));
        useVar.b(u47Var, true, fpe.a);
        useVar.g(true);
        useVar.f(useVar.b.e);
    }

    public final void l(une uneVar) {
        if (((p89) uneVar.a().b).c <= 0 || !eue.d(uneVar.g)) {
            return;
        }
        q2g q2gVar = q2g.a;
        this.e.setValue(new rwc(q2gVar, q2gVar));
    }

    public final String toString() {
        use useVar = this.a;
        return "TransformedTextFieldState(textFieldState=" + useVar + ", outputTransformation=null, outputTransformedText=null, codepointTransformation=" + this.c + ", codepointTransformedText=" + this.d + ", outputText=\"" + ((Object) useVar.d()) + "\", visualText=\"" + ((Object) d()) + "\")";
    }
}
