package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd7 {
    public static final t99 a = t99.e("message");
    public static final t99 b = t99.e("allowedTargets");
    public static final t99 c = t99.e("value");
    public static final Map d = bm8.H(new iy9(syd.t, pj7.c), new iy9(syd.w, pj7.d), new iy9(syd.x, pj7.f));

    public static wna a(dx5 dx5Var, td7 td7Var, szc szcVar) {
        tmb tmbVarA;
        dx5Var.getClass();
        td7Var.getClass();
        szcVar.getClass();
        if (dx5Var.equals(syd.m)) {
            dx5 dx5Var2 = pj7.e;
            dx5Var2.getClass();
            tmb tmbVarA2 = td7Var.a(dx5Var2);
            if (tmbVarA2 != null) {
                return new ie7(tmbVarA2, szcVar);
            }
        }
        dx5 dx5Var3 = (dx5) d.get(dx5Var);
        if (dx5Var3 == null || (tmbVarA = td7Var.a(dx5Var3)) == null) {
            return null;
        }
        return b(tmbVarA, szcVar, false);
    }

    public static wna b(tmb tmbVar, szc szcVar, boolean z) {
        szcVar.getClass();
        j22 j22VarA = smb.a(af1.R(af1.Q(tmbVar.a)));
        dx5 dx5Var = pj7.c;
        dx5Var.getClass();
        if (j22VarA.equals(new j22(dx5Var.b(), dx5Var.a.g()))) {
            return new of7(tmbVar, szcVar);
        }
        dx5 dx5Var2 = pj7.d;
        dx5Var2.getClass();
        if (j22VarA.equals(new j22(dx5Var2.b(), dx5Var2.a.g()))) {
            return new nf7(tmbVar, szcVar);
        }
        dx5 dx5Var3 = pj7.f;
        dx5Var3.getClass();
        if (j22VarA.equals(new j22(dx5Var3.b(), dx5Var3.a.g()))) {
            return new rd7(szcVar, tmbVar, syd.x);
        }
        dx5 dx5Var4 = pj7.e;
        dx5Var4.getClass();
        if (j22VarA.equals(new j22(dx5Var4.b(), dx5Var4.a.g()))) {
            return null;
        }
        return new ox7(tmbVar, szcVar, z);
    }
}
