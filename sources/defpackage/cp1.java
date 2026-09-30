package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cp1 implements bp1 {
    public final i8f a;
    public ve9 b;

    public cp1(i8f i8fVar) {
        i8fVar.getClass();
        this.a = i8fVar;
        i8fVar.a();
    }

    @Override // defpackage.j7f
    public final Collection e() {
        i8f i8fVar = this.a;
        tt7 tt7VarB = i8fVar.a() == dsf.OUT_VARIANCE ? i8fVar.b() : f().p();
        tt7VarB.getClass();
        return t72.H(tt7VarB);
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        xr7 xr7VarF = this.a.b().c0().f();
        xr7VarF.getClass();
        return xr7VarF;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return pu4.a;
    }

    @Override // defpackage.j7f
    public final y22 m() {
        return null;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }

    @Override // defpackage.bp1
    public final i8f u() {
        return this.a;
    }
}
