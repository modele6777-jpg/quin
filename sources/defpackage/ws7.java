package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ws7 implements x16 {
    public final /* synthetic */ int a = 0;
    public final xs7 b;
    public final xm7 c;

    public ws7(xm7 xm7Var, xs7 xs7Var) {
        this.c = xm7Var;
        this.b = xs7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        xm7 xm7Var = this.c;
        xs7 xs7Var = this.b;
        switch (i) {
            case 0:
                nm7 nm7Var = xm7Var instanceof nm7 ? (nm7) xm7Var : null;
                g8f g8fVarD = nm7Var != null ? ((jm7) nm7Var.c.getValue()).d() : null;
                g8f g8fVar = g8f.d;
                return o5c.i(xs7Var.x.c, g8fVarD, xs7Var, smb.d(xm7Var.d()));
            default:
                wq7 wq7Var = xs7Var.x.h;
                if (wq7Var != null) {
                    return abg.d0(wq7Var, smb.d(xm7Var.d()), xs7Var.J(), new wj7(6, xs7Var), 4);
                }
                pa7.g0("returnType");
                throw null;
        }
    }

    public ws7(xs7 xs7Var, xm7 xm7Var) {
        this.b = xs7Var;
        this.c = xm7Var;
    }
}
