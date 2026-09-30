package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mp0 extends ue8 {
    public final long a;
    public final Integer b;
    public final hb2 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final nd9 h;
    public final q55 i;

    public mp0(long j, Integer num, hb2 hb2Var, long j2, byte[] bArr, String str, long j3, nd9 nd9Var, q55 q55Var) {
        this.a = j;
        this.b = num;
        this.c = hb2Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = nd9Var;
        this.i = q55Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ue8) {
            ue8 ue8Var = (ue8) obj;
            mp0 mp0Var = (mp0) ue8Var;
            if (this.a == mp0Var.a) {
                Integer num = mp0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    hb2 hb2Var = mp0Var.c;
                    hb2 hb2Var2 = this.c;
                    if (hb2Var2 != null ? hb2Var2.equals(hb2Var) : hb2Var == null) {
                        if (this.d == mp0Var.d) {
                            if (Arrays.equals(this.e, ue8Var instanceof mp0 ? ((mp0) ue8Var).e : mp0Var.e)) {
                                String str = mp0Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == mp0Var.g) {
                                        nd9 nd9Var = mp0Var.h;
                                        nd9 nd9Var2 = this.h;
                                        if (nd9Var2 != null ? nd9Var2.equals(nd9Var) : nd9Var == null) {
                                            q55 q55Var = mp0Var.i;
                                            q55 q55Var2 = this.i;
                                            if (q55Var2 != null ? q55Var2.equals(q55Var) : q55Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        hb2 hb2Var = this.c;
        int iHashCode2 = (iHashCode ^ (hb2Var == null ? 0 : hb2Var.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        nd9 nd9Var = this.h;
        int iHashCode5 = (i2 ^ (nd9Var == null ? 0 : nd9Var.hashCode())) * 1000003;
        q55 q55Var = this.i;
        return iHashCode5 ^ (q55Var != null ? q55Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
