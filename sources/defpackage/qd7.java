package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qd7 extends aob {
    public final pd7 a;
    public final Method b;
    public final int c;
    public final lw7 d = eb3.N(z18.b, new j5(24, this));

    public qd7(pd7 pd7Var, Method method, int i) {
        this.a = pd7Var;
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.aob
    public final wnb d() {
        return this.a;
    }

    @Override // defpackage.aob
    public final boolean f() {
        return w();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        throw null;
    }

    @Override // defpackage.aob
    public final String getName() {
        String name = this.b.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.aob
    public final int m() {
        return this.c;
    }

    @Override // defpackage.aob
    public final on7 t() {
        return on7.d;
    }

    @Override // defpackage.aob
    public final yn7 u() {
        return (yn7) this.d.getValue();
    }

    @Override // defpackage.aob
    public final boolean w() {
        return this.b.getDefaultValue() != null;
    }

    @Override // defpackage.aob
    public final boolean y() {
        return getName().equals("value") && this.b.getReturnType().isArray();
    }
}
