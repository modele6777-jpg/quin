package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class etg {
    public static final ry6 a = ry6.q("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final yob b;
    public static final yob c;
    public static final yob d;
    public static final yob e;
    public static final yob f;

    static {
        ey6 ey6Var = jy6.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        nk8.n(7, objArr);
        b = jy6.k(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        nk8.n(3, objArr2);
        c = jy6.k(3, objArr2);
        d = jy6.t("_r", "_dbg");
        dy6 dy6Var = new dy6(4);
        dy6Var.c(if9.q);
        dy6Var.c(if9.r);
        e = dy6Var.g();
        f = jy6.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            yob yobVar = d;
            int i = yobVar.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) yobVar.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            yob yobVar = f;
            int i = yobVar.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) yobVar.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            yob yobVar = d;
            int i = yobVar.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) yobVar.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
