package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yk7 implements f04 {
    public final gk7 a;
    public final gk7 b;
    public final cob c;

    public yk7(cob cobVar, hza hzaVar, wk7 wk7Var, boolean z, e04 e04Var) {
        cobVar.getClass();
        hzaVar.getClass();
        wk7Var.getClass();
        gk7 gk7Var = new gk7(gk7.c(smb.a(cobVar.a)));
        zr7 zr7Var = cobVar.b;
        gk7 gk7VarB = null;
        String str = zr7Var.a != yr7.MULTIFILE_CLASS_PART ? null : zr7Var.f;
        if (str != null && str.length() > 0) {
            gk7VarB = gk7.b(str);
        }
        this.a = gk7Var;
        this.b = gk7VarB;
        this.c = cobVar;
        s56 s56Var = rl7.k;
        s56Var.getClass();
        Integer num = (Integer) vpf.F(hzaVar, s56Var);
        if (num != null) {
            wk7Var.getString(num.intValue());
        }
    }

    public final j22 a() {
        dx5 dx5Var;
        gk7 gk7Var = this.a;
        String str = gk7Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            dx5Var = dx5.c;
            if (dx5Var == null) {
                gk7.a(9);
                throw null;
            }
        } else {
            dx5Var = new dx5(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String str2 = gk7Var.a;
        if (str2 != null) {
            return new j22(dx5Var, t99.e(v4e.g0('/', str2, str2)));
        }
        gk7.a(10);
        throw null;
    }

    @Override // defpackage.f04
    public final String b() {
        return ub3.l(new StringBuilder("Class '"), a().a().a.a, '\'');
    }

    public final String toString() {
        return yk7.class.getSimpleName() + ": " + this.a;
    }
}
