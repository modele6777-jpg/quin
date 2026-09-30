package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ys7 extends aob {
    public final ms7 a;
    public final ar7 b;
    public final int c;
    public final on7 d;
    public final String e;
    public final lw7 f;

    public ys7(ms7 ms7Var, ar7 ar7Var, int i, on7 on7Var, g8f g8fVar) {
        ar7Var.getClass();
        g8fVar.getClass();
        this.a = ms7Var;
        this.b = ar7Var;
        this.c = i;
        this.d = on7Var;
        String str = ar7Var.b;
        boolean z = false;
        this.e = c5e.C(str, "<", false) ? null : str;
        this.f = eb3.N(z18.b, new n5(this, g8fVar, z, 19));
    }

    @Override // defpackage.aob
    public final wnb d() {
        return this.a;
    }

    @Override // defpackage.aob
    public final boolean f() {
        wn7[] wn7VarArr = si0.a;
        ar7 ar7Var = this.b;
        ar7Var.getClass();
        return si0.A.F(si0.a[54], ar7Var);
    }

    @Override // defpackage.aob
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.aob
    public final int m() {
        return this.c;
    }

    @Override // defpackage.aob
    public final on7 t() {
        return this.d;
    }

    @Override // defpackage.aob
    public final yn7 u() {
        return (yn7) this.f.getValue();
    }

    @Override // defpackage.aob
    public final boolean w() {
        ms7 ms7Var = this.a;
        if ((ms7Var instanceof kt7) || (ms7Var.s() instanceof nn7) || ynb.R(ms7Var)) {
            wn7[] wn7VarArr = si0.a;
            ar7 ar7Var = this.b;
            ar7Var.getClass();
            return si0.A.F(si0.a[54], ar7Var);
        }
        StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
        sb.append(ms7Var.s());
        ho7.s(sb, ms7Var.getName(), this.e);
        return false;
    }

    @Override // defpackage.aob
    public final boolean y() {
        return this.b.d != null;
    }
}
