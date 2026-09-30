package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p92 implements pv2, Serializable {
    private final nv2 element;
    private final pv2 left;

    public p92(nv2 nv2Var, pv2 pv2Var) {
        pv2Var.getClass();
        nv2Var.getClass();
        this.left = pv2Var;
        this.element = nv2Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iA = a();
        pv2[] pv2VarArr = new pv2[iA];
        kmb kmbVar = new kmb();
        V0(new h8(17, pv2VarArr, kmbVar), wef.a);
        if (kmbVar.element == iA) {
            return new o92(pv2VarArr);
        }
        qc0.p("Check failed.");
        return null;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        ov2Var.getClass();
        while (true) {
            nv2 nv2VarF0 = this.element.F0(ov2Var);
            if (nv2VarF0 != null) {
                return nv2VarF0;
            }
            pv2 pv2Var = this.left;
            if (!(pv2Var instanceof p92)) {
                return pv2Var.F0(ov2Var);
            }
            this = (p92) pv2Var;
        }
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        ov2Var.getClass();
        nv2 nv2VarF0 = this.element.F0(ov2Var);
        pv2 pv2Var = this.left;
        if (nv2VarF0 != null) {
            return pv2Var;
        }
        pv2 pv2VarU = pv2Var.U(ov2Var);
        if (pv2VarU == this.left) {
            return this;
        }
        nv2 nv2Var = this.element;
        return pv2VarU == nu4.a ? nv2Var : new p92(nv2Var, pv2VarU);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(this.left.V0(l26Var, obj), this.element);
    }

    public final int a() {
        int i = 2;
        while (true) {
            pv2 pv2Var = this.left;
            this = pv2Var instanceof p92 ? (p92) pv2Var : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zT;
        if (this == obj) {
            return true;
        }
        if (obj instanceof p92) {
            p92 p92Var = (p92) obj;
            if (p92Var.a() == a()) {
                while (true) {
                    nv2 nv2Var = this.element;
                    if (!pa7.t(p92Var.F0(nv2Var.getKey()), nv2Var)) {
                        zT = false;
                        break;
                    }
                    pv2 pv2Var = this.left;
                    if (!(pv2Var instanceof p92)) {
                        pv2Var.getClass();
                        nv2 nv2Var2 = (nv2) pv2Var;
                        zT = pa7.t(p92Var.F0(nv2Var2.getKey()), nv2Var2);
                        break;
                    }
                    this = (p92) pv2Var;
                }
                if (zT) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        pv2Var.getClass();
        return pv2Var == nu4.a ? this : (pv2) pv2Var.V0(new he2(28), this);
    }

    public final String toString() {
        return ub3.l(new StringBuilder("["), (String) V0(new ym0(3), ""), ']');
    }
}
