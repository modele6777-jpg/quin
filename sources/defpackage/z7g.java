package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class z7g extends y7g {
    public x47 t;
    public x47 u;
    public x47 v;

    public z7g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.e8g
    public x47 k() {
        x47 x47Var = this.u;
        if (x47Var != null) {
            return x47Var;
        }
        x47 x47VarC = x47.c(this.c.getMandatorySystemGestureInsets());
        this.u = x47VarC;
        return x47VarC;
    }

    @Override // defpackage.e8g
    public x47 m() {
        x47 x47Var = this.t;
        if (x47Var != null) {
            return x47Var;
        }
        x47 x47VarC = x47.c(this.c.getSystemGestureInsets());
        this.t = x47VarC;
        return x47VarC;
    }

    @Override // defpackage.e8g
    public x47 o() {
        x47 x47Var = this.v;
        if (x47Var != null) {
            return x47Var;
        }
        x47 x47VarC = x47.c(this.c.getTappableElementInsets());
        this.v = x47VarC;
        return x47VarC;
    }

    @Override // defpackage.w7g, defpackage.e8g
    public h8g r(int i, int i2, int i3, int i4) {
        return h8g.c(this.c.inset(i, i2, i3, i4), null);
    }

    public z7g(h8g h8gVar, z7g z7gVar) {
        super(h8gVar, z7gVar);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.x7g, defpackage.e8g
    public void z(x47 x47Var) {
    }
}
