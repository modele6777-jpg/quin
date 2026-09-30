package defpackage;

import android.content.Context;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv6 {
    public final Context a;
    public final hm9 b;

    public sv6(Context context) {
        hm9 hm9Var = new hm9(new gm9());
        this.a = context;
        this.b = hm9Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    public final String a(String str, String str2) {
        String str3;
        String strI0 = v4e.i0(v4e.g0('.', str, ""), '?');
        int length = strI0.length();
        if (3 > length || length >= 5 || !new rob("[a-zA-Z]+").g(strI0)) {
            strI0 = null;
        }
        if (strI0 == null) {
            if ((str2 != null && v4e.F(str2, "jpeg", false)) || (str2 != null && v4e.F(str2, "jpg", false))) {
                strI0 = "jpg";
            } else if (str2 != null) {
                str3 = "png";
                if (!v4e.F(str2, "png", false)) {
                    if (str2 != null) {
                        str3 = "gif";
                        if (!v4e.F(str2, "gif", false)) {
                            if (str2 != null) {
                                str3 = "webp";
                                if (v4e.F(str2, "webp", false)) {
                                }
                            }
                            strI0 = "jpg";
                        }
                    } else {
                        if (str2 != null) {
                            str3 = "webp";
                            if (v4e.F(str2, "webp", false)) {
                            }
                        }
                        strI0 = "jpg";
                    }
                }
                strI0 = str3;
            } else if (str2 != null) {
                str3 = "gif";
                if (!v4e.F(str2, "gif", false)) {
                    if (str2 != null) {
                        str3 = "webp";
                        if (v4e.F(str2, "webp", false)) {
                        }
                    }
                    strI0 = "jpg";
                }
                strI0 = str3;
            } else {
                if (str2 != null) {
                    str3 = "webp";
                    if (v4e.F(str2, "webp", false)) {
                        strI0 = str3;
                    }
                }
                strI0 = "jpg";
            }
        }
        String str4 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        str4.getClass();
        return ub3.k("quin_image_", str4, ".", strI0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[PHI: r0
  0x0045: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v4 java.lang.String), (r0v6 java.lang.String), (r0v7 java.lang.String) binds: [B:15:0x003a, B:18:0x0043, B:21:0x004d, B:24:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    public final String b(String str, String str2) {
        String strI0 = v4e.i0(v4e.g0('.', str, ""), '?');
        int length = strI0.length();
        if (3 > length || length >= 5 || !new rob("[a-zA-Z0-9]+").g(strI0)) {
            strI0 = null;
        }
        if (strI0 == null) {
            strI0 = "mp4";
            if (!v4e.F(str2, "mp4", false)) {
                String str3 = "mov";
                if (v4e.F(str2, "mov", false) || v4e.F(str2, "quicktime", false)) {
                    strI0 = str3;
                } else {
                    str3 = "webm";
                    if (v4e.F(str2, "webm", false)) {
                        strI0 = str3;
                    } else {
                        str3 = "avi";
                        if (v4e.F(str2, "avi", false)) {
                            strI0 = str3;
                        }
                    }
                }
            }
        }
        String str4 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        str4.getClass();
        return ub3.k("quin_video_", str4, ".", strI0);
    }
}
