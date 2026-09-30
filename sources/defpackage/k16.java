package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k16 {
    public static void a(t06 t06Var) {
        Map mapH = bm8.H(new iy9("btn", t06Var.a()), new iy9("pathway", "friend_coupon_page"));
        p05 p05Var = p05.a;
        m16 m16Var = new m16(p05Var, mapH);
        x1f x1fVar = x1f.a;
        x1f.g(p05Var, m1f.a, new ot1(15, m16Var));
    }

    public static void b(h16 h16Var) {
        u06 u06Var;
        h16Var.getClass();
        if (h16Var.equals(e16.a)) {
            u06Var = u06.CopyLink;
        } else if (h16Var instanceof g16) {
            u06Var = ((g16) h16Var).a;
        } else {
            if (!(h16Var instanceof f16)) {
                ap.c();
                return;
            }
            u06Var = null;
        }
        m16 m16Var = u06Var != null ? new m16(new r05("friend_coupon_shared"), bm8.G(new iy9("share_channel", u06Var.b()))) : null;
        if (m16Var != null) {
            x1f x1fVar = x1f.a;
            x1f.g(m16Var.a, m1f.a, new ot1(15, m16Var));
        }
    }
}
