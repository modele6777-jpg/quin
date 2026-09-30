package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class aob implements bm7 {
    public aob() {
        eb3.N(z18.b, new wj7(15, this));
    }

    public abstract wnb d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof aob)) {
            return false;
        }
        aob aobVar = (aob) obj;
        return pa7.t(d(), aobVar.d()) && m() == aobVar.m();
    }

    public abstract boolean f();

    public abstract String getName();

    public final int hashCode() {
        return Integer.hashCode(m()) + (d().hashCode() * 31);
    }

    public abstract int m();

    public abstract on7 t();

    public final String toString() throws IOException {
        String strA;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = t().ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + getName());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                ap.c();
                return null;
            }
            sb.append("parameter #" + m() + ' ' + getName());
        }
        sb.append(" of ");
        wnb wnbVarD = d();
        if (wnbVarD instanceof wn7) {
            wn7 wn7Var = (wn7) wnbVarD;
            StringBuilder sb2 = new StringBuilder();
            af8.h(sb2, wn7Var);
            sb2.append(wn7Var instanceof in7 ? "var " : "val ");
            af8.j(sb2, wn7Var);
            af8.i(wn7Var.getName(), sb2);
            sb2.append(": ");
            sb2.append(af8.C(wn7Var.getReturnType(), false));
            strA = sb2.toString();
        } else {
            if (!(wnbVarD instanceof ym7)) {
                pd4.i(wnbVarD, "Illegal callable: ");
                return null;
            }
            strA = af8.A((ym7) wnbVarD);
        }
        sb.append(strA);
        return sb.toString();
    }

    public abstract yn7 u();

    public abstract boolean w();

    public abstract boolean y();
}
