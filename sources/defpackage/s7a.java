package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
public final class s7a {
    public static final r7a Companion = new r7a();
    public static final lw7[] g;
    public final String a;
    public final Map b;
    public final long c;
    public final String d;
    public final String e;
    public final Set f;

    static {
        vy9 vy9Var = new vy9(18);
        z18 z18Var = z18.b;
        g = new lw7[]{null, eb3.N(z18Var, vy9Var), null, null, null, eb3.N(z18Var, new vy9(19))};
    }

    public s7a(int i, String str, Map map, long j, String str2, String str3, Set set) {
        if (15 != (i & 15)) {
            an1.R(i, 15, q7a.a.e());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = j;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = s72.o1(vhd.c);
        } else {
            this.f = set;
        }
    }

    public static s7a a(s7a s7aVar, Map map, Set set, int i) {
        String str = s7aVar.a;
        if ((i & 2) != 0) {
            map = s7aVar.b;
        }
        Map map2 = map;
        long j = s7aVar.c;
        String str2 = s7aVar.d;
        String str3 = s7aVar.e;
        s7aVar.getClass();
        str.getClass();
        map2.getClass();
        str2.getClass();
        return new s7a(str, map2, j, str2, str3, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a)) {
            return false;
        }
        s7a s7aVar = (s7a) obj;
        return pa7.t(this.a, s7aVar.a) && pa7.t(this.b, s7aVar.b) && this.c == s7aVar.c && pa7.t(this.d, s7aVar.d) && pa7.t(this.e, s7aVar.e) && pa7.t(this.f, s7aVar.f);
    }

    public final int hashCode() {
        int iC = ub3.c(ib8.b(ib8.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PendingSignUp(uid=" + this.a + ", properties=" + this.b + ", occurredAtMillis=" + this.c + ", insertId=" + this.d + ", mixpanelDeviceId=" + this.e + ", pendingDestinations=" + this.f + ")";
    }

    public s7a(String str, Map map, long j, String str2, String str3, Set set) {
        this.a = str;
        this.b = map;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = set;
    }
}
