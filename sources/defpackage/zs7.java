package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zs7 implements x16 {
    public final /* synthetic */ int a;
    public final kt7 b;

    public /* synthetic */ zs7(kt7 kt7Var, int i) {
        this.a = i;
        this.b = kt7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        kt7 kt7Var = this.b;
        switch (i) {
            case 0:
                kt7 kt7Var2 = this.b;
                uq7 uq7Var = kt7Var2.f;
                return lmg.W(kt7Var2, uq7Var.h, uq7Var.f, pu4.a, (g8f) kt7Var2.x.getValue(), true);
            case 1:
                kt7 kt7Var3 = this.b;
                if (!ynb.Q(kt7Var3)) {
                    return kt7Var3.a();
                }
                uq7 uq7Var2 = kt7Var3.f;
                return lmg.W(kt7Var3, uq7Var2.h, uq7Var2.f, pu4.a, (g8f) kt7Var3.x.getValue(), false);
            case 2:
                wq7 wq7Var = kt7Var.f.j;
                if (wq7Var != null) {
                    return abg.d0(wq7Var, smb.d(kt7Var.c.d()), (g8f) kt7Var.x.getValue(), cgg.G(kt7Var) ? null : new zs7(kt7Var, 5), 4);
                }
                pa7.g0("returnType");
                throw null;
            case 3:
                xm7 xm7Var = kt7Var.c;
                nm7 nm7Var = xm7Var instanceof nm7 ? (nm7) xm7Var : null;
                g8f g8fVarD = nm7Var != null ? ((jm7) nm7Var.c.getValue()).d() : null;
                g8f g8fVar = g8f.d;
                return o5c.i(kt7Var.f.e, g8fVarD, kt7Var, smb.d(xm7Var.d()));
            case 4:
                boolean zG = cgg.G(kt7Var);
                uq7 uq7Var3 = kt7Var.f;
                if (zG) {
                    return null;
                }
                xm7 xm7Var2 = kt7Var.c;
                uq7Var3.getClass();
                ik7 ik7Var = cn1.D(uq7Var3).b;
                if (ik7Var == null) {
                    return null;
                }
                if (xm7Var2 instanceof nn7) {
                    try {
                        return ((nn7) xm7Var2).b.getDeclaredField(ik7Var.E0);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder("javaField is only supported for top-level properties for now: ");
                sb.append(xm7Var2);
                ho7.s(sb, uq7Var3.b, kt7Var.d);
                return null;
            default:
                return kt7Var.h().getReturnType();
        }
    }
}
