package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dp1 extends o8f {
    public final /* synthetic */ int b;
    public final o8f c;

    public /* synthetic */ dp1(o8f o8fVar, int i) {
        this.b = i;
        this.c = o8fVar;
    }

    @Override // defpackage.o8f
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // defpackage.o8f
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // defpackage.o8f
    public final h10 c(h10 h10Var) {
        int i = this.b;
        o8f o8fVar = this.c;
        h10Var.getClass();
        switch (i) {
            case 0:
                break;
        }
        return o8fVar.c(h10Var);
    }

    @Override // defpackage.o8f
    public final i8f d(tt7 tt7Var) {
        int i = this.b;
        o8f o8fVar = this.c;
        switch (i) {
            case 0:
                i8f i8fVarD = o8fVar.d(tt7Var);
                if (i8fVarD == null) {
                    return null;
                }
                y22 y22VarM = tt7Var.c0().m();
                return bm8.t(i8fVarD, y22VarM instanceof c8f ? (c8f) y22VarM : null);
            default:
                return o8fVar.d(tt7Var);
        }
    }

    @Override // defpackage.o8f
    public final boolean e() {
        int i = this.b;
        o8f o8fVar = this.c;
        switch (i) {
            case 0:
                break;
        }
        return o8fVar.e();
    }

    @Override // defpackage.o8f
    public final tt7 f(tt7 tt7Var, dsf dsfVar) {
        int i = this.b;
        o8f o8fVar = this.c;
        tt7Var.getClass();
        dsfVar.getClass();
        switch (i) {
            case 0:
                break;
        }
        return o8fVar.f(tt7Var, dsfVar);
    }
}
