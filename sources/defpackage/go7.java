package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class go7 implements yn7 {
    public final yn7 a;

    public go7(yn7 yn7Var) {
        yn7Var.getClass();
        this.a = yn7Var;
    }

    @Override // defpackage.yn7
    public final List A() {
        return this.a.A();
    }

    @Override // defpackage.yn7
    public final um7 B() {
        return this.a.B();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        go7 go7Var = obj instanceof go7 ? (go7) obj : null;
        yn7 yn7Var = go7Var != null ? go7Var.a : null;
        yn7 yn7Var2 = this.a;
        if (!pa7.t(yn7Var2, yn7Var)) {
            return false;
        }
        um7 um7VarB = yn7Var2.B();
        if (um7VarB instanceof em7) {
            yn7 yn7Var3 = obj instanceof yn7 ? (yn7) obj : null;
            um7 um7VarB2 = yn7Var3 != null ? yn7Var3.B() : null;
            if (um7VarB2 != null && (um7VarB2 instanceof em7)) {
                return af1.R((em7) um7VarB).equals(af1.R((em7) um7VarB2));
            }
        }
        return false;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return this.a.o();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
