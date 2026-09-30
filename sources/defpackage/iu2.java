package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iu2 {
    public static egh a(a82 a82Var, xg3 xg3Var, String str, String str2) {
        ime imeVar = (ime) a82Var.c;
        if (imeVar == null || !imeVar.g.equals("!")) {
            return new egh(new i68(str, str2), xg3Var.n());
        }
        av6 av6Var = new av6();
        av6Var.g = str;
        av6Var.h = str2;
        egh eghVar = new egh(av6Var, xg3Var.n());
        eghVar.b = true;
        return eghVar;
    }
}
