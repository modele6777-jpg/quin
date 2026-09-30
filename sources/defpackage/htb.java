package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class htb {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final ct6 b;
    public String c;
    public bt6 d;
    public final zsb e = new zsb();
    public final qi6 f;
    public oq8 g;
    public final boolean h;
    public final gg7 i;
    public final w84 j;
    public ftb k;

    public htb(String str, ct6 ct6Var, String str2, si6 si6Var, oq8 oq8Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = ct6Var;
        this.c = str2;
        this.g = oq8Var;
        this.h = z;
        if (si6Var != null) {
            this.f = xdc.j(si6Var);
        } else {
            this.f = new qi6();
        }
        if (z2) {
            this.j = new w84(8);
            return;
        }
        if (z3) {
            gg7 gg7Var = new gg7(13);
            this.i = gg7Var;
            oq8 oq8Var2 = f69.g;
            oq8Var2.getClass();
            if (oq8Var2.b.equals("multipart")) {
                gg7Var.c = oq8Var2;
            } else {
                ho7.y(oq8Var2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        w84 w84Var = this.j;
        if (z) {
            w84Var.getClass();
            str.getClass();
            ((ArrayList) w84Var.b).add(n16.y(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) w84Var.c).add(n16.y(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        w84Var.getClass();
        str.getClass();
        ((ArrayList) w84Var.b).add(n16.y(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) w84Var.c).add(n16.y(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                rob robVar = oq8.e;
                this.g = kj0.c0(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ub3.i("Malformed content type: ", str2), e);
            }
        }
        qi6 qi6Var = this.f;
        if (!z) {
            qi6Var.a(str, str2);
            return;
        }
        qi6Var.getClass();
        str.getClass();
        str2.getClass();
        xdc.p(str);
        xdc.g(qi6Var, str, str2);
    }

    public final void c(si6 si6Var, ftb ftbVar) {
        gg7 gg7Var = this.i;
        gg7Var.getClass();
        ftbVar.getClass();
        if (si6Var.c("Content-Type") != null) {
            qc0.j("Unexpected header: Content-Type");
        } else if (si6Var.c("Content-Length") != null) {
            qc0.j("Unexpected header: Content-Length");
        } else {
            ((ArrayList) gg7Var.d).add(new e69(si6Var, ftbVar));
        }
    }

    public final void d(String str, String str2, boolean z) {
        bt6 bt6Var;
        ct6 ct6Var = this.b;
        String str3 = this.c;
        if (str3 != null) {
            try {
                bt6Var = new bt6();
                bt6Var.d(ct6Var, str3);
            } catch (IllegalArgumentException unused) {
                bt6Var = null;
            }
            this.d = bt6Var;
            if (bt6Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(ct6Var);
                s8f.l(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        bt6 bt6Var2 = this.d;
        if (z) {
            bt6Var2.getClass();
            str.getClass();
            ArrayList arrayList = bt6Var2.c;
            if (arrayList == null) {
                arrayList = new ArrayList();
                bt6Var2.c = arrayList;
            }
            arrayList.add(n16.x(0, 0, 83, str, " \"'<>#&="));
            ArrayList arrayList2 = bt6Var2.c;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? n16.x(0, 0, 83, str2, " \"'<>#&=") : null);
            return;
        }
        bt6Var2.getClass();
        str.getClass();
        ArrayList arrayList3 = bt6Var2.c;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            bt6Var2.c = arrayList3;
        }
        arrayList3.add(n16.x(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = bt6Var2.c;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? n16.x(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
