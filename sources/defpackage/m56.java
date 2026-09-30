package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m56 implements Cloneable {
    public final v56 a;
    public v56 b;

    public m56(v56 v56Var) {
        this.a = v56Var;
        if (v56Var.f()) {
            qc0.j("Default instance must be immutable.");
            throw null;
        }
        this.b = v56Var.h();
    }

    public final v56 a() {
        v56 v56VarB = b();
        v56VarB.getClass();
        if (v56.e(v56VarB, true)) {
            return v56VarB;
        }
        throw new ref();
    }

    public final v56 b() {
        boolean zF = this.b.f();
        v56 v56Var = this.b;
        if (!zF) {
            return v56Var;
        }
        v56Var.getClass();
        v0b v0bVar = v0b.c;
        v0bVar.getClass();
        v0bVar.a(v56Var.getClass()).b(v56Var);
        v56Var.g();
        return this.b;
    }

    public final void c() {
        if (this.b.f()) {
            return;
        }
        v56 v56VarH = this.a.h();
        v56 v56Var = this.b;
        v0b v0bVar = v0b.c;
        v0bVar.getClass();
        v0bVar.a(v56VarH.getClass()).a(v56VarH, v56Var);
        this.b = v56VarH;
    }

    public final Object clone() {
        m56 m56Var = (m56) this.a.b(5);
        m56Var.b = b();
        return m56Var;
    }
}
