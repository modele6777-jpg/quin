package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 implements lv3, dj5, vjd, c7f, yn7 {
    public final fob a;

    public j2(x16 x16Var) {
        fob fobVarM0 = null;
        fob fobVar = x16Var instanceof fob ? (fob) x16Var : null;
        if (fobVar != null) {
            fobVarM0 = fobVar;
        } else if (x16Var != null) {
            fobVarM0 = lmg.m0(null, x16Var);
        }
        this.a = fobVarM0;
    }

    public abstract j2 C(boolean z);

    public abstract j2 F();

    public abstract yn7 d();

    public boolean equals(Object obj) {
        return (obj instanceof j2) && vd0.w0(qk6.R0, this, (xt7) obj);
    }

    public abstract em7 f();

    public int hashCode() {
        um7 um7VarB = B();
        int iHashCode = um7VarB != null ? um7VarB.hashCode() : 0;
        return Boolean.hashCode(o()) + ((A().hashCode() + (iHashCode * 31)) * 31);
    }

    public abstract boolean m();

    public abstract boolean t();

    public String toString() {
        return af8.C(this, false);
    }

    public abstract boolean u();

    public abstract boolean w();

    public abstract j2 y();

    public abstract j2 z(boolean z);
}
