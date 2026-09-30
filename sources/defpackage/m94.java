package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m94 extends o8f {
    public final o8f b;
    public final o8f c;

    public m94(o8f o8fVar, o8f o8fVar2) {
        this.b = o8fVar;
        this.c = o8fVar2;
    }

    @Override // defpackage.o8f
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.o8f
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.o8f
    public final h10 c(h10 h10Var) {
        h10Var.getClass();
        return this.c.c(this.b.c(h10Var));
    }

    @Override // defpackage.o8f
    public final i8f d(tt7 tt7Var) {
        i8f i8fVarD = this.b.d(tt7Var);
        return i8fVarD == null ? this.c.d(tt7Var) : i8fVarD;
    }

    @Override // defpackage.o8f
    public final tt7 f(tt7 tt7Var, dsf dsfVar) {
        tt7Var.getClass();
        dsfVar.getClass();
        return this.c.f(this.b.f(tt7Var, dsfVar), dsfVar);
    }
}
