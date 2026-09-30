package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ey3 extends aob {
    public static final /* synthetic */ wn7[] e = {new aya(ey3.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new aya(ey3.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final rx3 a;
    public final int b;
    public final on7 c;
    public final fob d;

    public ey3(rx3 rx3Var, int i, on7 on7Var, x16 x16Var) {
        this.a = rx3Var;
        this.b = i;
        this.c = on7Var;
        this.d = lmg.m0(null, x16Var);
        lmg.m0(null, new cy3(this, 0));
    }

    @Override // defpackage.aob
    public final wnb d() {
        return this.a;
    }

    @Override // defpackage.aob
    public final boolean f() {
        zy9 zy9VarZ = z();
        xrf xrfVar = zy9VarZ instanceof xrf ? (xrf) zy9VarZ : null;
        return xrfVar != null && xrfVar.E0();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        throw null;
    }

    @Override // defpackage.aob
    public final String getName() {
        zy9 zy9VarZ = z();
        xrf xrfVar = zy9VarZ instanceof xrf ? (xrf) zy9VarZ : null;
        if (xrfVar != null && !xrfVar.k().t()) {
            t99 name = xrfVar.getName();
            name.getClass();
            if (!name.b) {
                return name.b();
            }
        }
        return null;
    }

    @Override // defpackage.aob
    public final int m() {
        return this.b;
    }

    @Override // defpackage.aob
    public final on7 t() {
        return this.c;
    }

    @Override // defpackage.aob
    public final yn7 u() {
        tt7 type = z().getType();
        type.getClass();
        zy3 zy3Var = new zy3(type, new cy3(this, 1), false);
        if (dy3.a[this.c.ordinal()] == 1) {
            return zy3Var;
        }
        rx3 rx3Var = this.a;
        yn7 yn7Var = rx3Var.a.b(rx3Var.getName(), rx3Var.getTypeParameters()).b(zy3Var, io7.a).b;
        if (yn7Var != null) {
            return yn7Var;
        }
        ia5.f(rx3Var.getName());
        throw null;
    }

    @Override // defpackage.aob
    public final boolean w() {
        zy9 zy9VarZ = z();
        xrf xrfVar = zy9VarZ instanceof xrf ? (xrf) zy9VarZ : null;
        if (xrfVar != null) {
            return qz3.a(xrfVar);
        }
        return false;
    }

    @Override // defpackage.aob
    public final boolean y() {
        zy9 zy9VarZ = z();
        return (zy9VarZ instanceof xrf) && ((xrf) zy9VarZ).y != null;
    }

    public final zy9 z() {
        wn7 wn7Var = e[0];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (zy9) objInvoke;
    }
}
