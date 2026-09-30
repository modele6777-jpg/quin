package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zbh extends obh {
    public static final boolean D0(String str) {
        String str2 = (String) bzg.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.G().r()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ybh B0(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbh.B0(java.lang.String):ybh");
    }

    public final String C0(String str) {
        y2h y2hVar = this.c.a;
        ich.S(y2hVar);
        String strN0 = y2hVar.N0(str);
        if (TextUtils.isEmpty(strN0)) {
            return (String) bzg.r.a(null);
        }
        Uri uri = Uri.parse((String) bzg.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strN0).length() + 1 + String.valueOf(authority).length());
        sb.append(strN0);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
