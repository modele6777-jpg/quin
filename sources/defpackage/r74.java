package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r74 {
    public static final s71 a;

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    static {
        c78 c78VarW = t72.w();
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if ("F2Q".equalsIgnoreCase(str2) || "Q2Q".equalsIgnoreCase(str2)) {
                    c78VarW.add(abe.a);
                } else if (("OPPO".equalsIgnoreCase(str) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(str) && "Q706F".equalsIgnoreCase(Build.DEVICE))) {
                    c78VarW.add(abe.a);
                }
            } else if ("OPPO".equalsIgnoreCase(str)) {
                c78VarW.add(abe.a);
            } else {
                c78VarW.add(abe.a);
            }
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
            c78VarW.add(zae.a);
        }
        a = new s71(c78VarW.n());
    }
}
