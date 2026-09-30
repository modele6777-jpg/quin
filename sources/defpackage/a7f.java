package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a7f extends e36 implements ul2 {
    public static final uzd W0 = new uzd(6);
    public final ge8 T0;
    public final s04 U0;
    public z12 V0;

    public a7f(ge8 ge8Var, s04 s04Var, z12 z12Var, a7f a7fVar, h10 h10Var, int i, ntd ntdVar) {
        super(i, h10Var, s04Var, a7fVar, sud.e, ntdVar);
        this.T0 = ge8Var;
        this.U0 = s04Var;
        n5 n5Var = new n5(this, z12Var, false, 26);
        ge8Var.getClass();
        new de8(ge8Var, n5Var);
        this.V0 = z12Var;
    }

    @Override // defpackage.e36, defpackage.ea1
    public final ea1 C(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        rz3Var.getClass();
        d36 d36VarJ0 = J0(q8f.b);
        d36VarJ0.b = bm3Var;
        d36VarJ0.c = e09Var;
        d36VarJ0.d = rz3Var;
        d36VarJ0.f = 2;
        d36VarJ0.X = false;
        e36 e36VarG0 = d36VarJ0.M0.G0(d36VarJ0);
        e36VarG0.getClass();
        return (a7f) e36VarG0;
    }

    @Override // defpackage.em3
    /* JADX INFO: renamed from: C0 */
    public final dm3 a() {
        c36 c36VarA = super.a();
        c36VarA.getClass();
        return (a7f) c36VarA;
    }

    @Override // defpackage.e36
    public final e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        bm3Var.getClass();
        if (i == 0) {
            throw null;
        }
        h10Var.getClass();
        if (i != 1) {
        }
        return new a7f(this.T0, this.U0, this.V0, this, h10Var, 1, ntdVar);
    }

    @Override // defpackage.e36, defpackage.v7e
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final a7f d(q8f q8fVar) {
        q8fVar.getClass();
        c36 c36VarD = super.d(q8fVar);
        c36VarD.getClass();
        a7f a7fVar = (a7f) c36VarD;
        tt7 tt7Var = a7fVar.v;
        tt7Var.getClass();
        z12 z12VarD = this.V0.a().d(q8f.d(tt7Var));
        if (z12VarD == null) {
            return null;
        }
        a7fVar.V0 = z12VarD;
        return a7fVar;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final ca1 a() {
        c36 c36VarA = super.a();
        c36VarA.getClass();
        return (a7f) c36VarA;
    }

    @Override // defpackage.e36, defpackage.ca1
    public final tt7 getReturnType() {
        tt7 tt7Var = this.v;
        tt7Var.getClass();
        return tt7Var;
    }

    @Override // defpackage.em3, defpackage.bm3
    public final z22 k() {
        return this.U0;
    }

    @Override // defpackage.em3, defpackage.bm3
    public final bm3 k() {
        return this.U0;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final ea1 a() {
        c36 c36VarA = super.a();
        c36VarA.getClass();
        return (a7f) c36VarA;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final bm3 a() {
        c36 c36VarA = super.a();
        c36VarA.getClass();
        return (a7f) c36VarA;
    }

    @Override // defpackage.e36, defpackage.em3, defpackage.cm3, defpackage.bm3
    public final c36 a() {
        c36 c36VarA = super.a();
        c36VarA.getClass();
        return (a7f) c36VarA;
    }
}
