package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a51 implements u00 {
    public final xr7 a;
    public final dx5 b;
    public final Map c;
    public final lw7 d;

    public a51(xr7 xr7Var, dx5 dx5Var, Map map) {
        xr7Var.getClass();
        dx5Var.getClass();
        this.a = xr7Var;
        this.b = dx5Var;
        this.c = map;
        this.d = eb3.N(z18.b, new j5(4, this));
    }

    @Override // defpackage.u00
    public final ntd e() {
        return ntd.T;
    }

    @Override // defpackage.u00
    public final dx5 f() {
        return this.b;
    }

    @Override // defpackage.u00
    public final Map g() {
        return this.c;
    }

    @Override // defpackage.u00
    public final tt7 getType() {
        Object value = this.d.getValue();
        value.getClass();
        return (tt7) value;
    }
}
