package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yga {
    public final Object a;
    public final int b;
    public final op8 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        kv2.v(0, 1, 2, 3, 4);
        pqf.D(5);
        pqf.D(6);
    }

    public yga(Object obj, int i, op8 op8Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        pa7.A(i >= 0);
        pa7.A(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = op8Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yga.class == obj.getClass()) {
            yga ygaVar = (yga) obj;
            if (this.b == ygaVar.b && this.e == ygaVar.e && this.f == ygaVar.f && this.g == ygaVar.g && this.h == ygaVar.h && this.i == ygaVar.i && Objects.equals(this.c, ygaVar.c) && Objects.equals(this.a, ygaVar.a) && Objects.equals(this.d, ygaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbQ = kv2.q(str, ", contentPos=");
        sbQ.append(this.g);
        sbQ.append(", adGroup=");
        sbQ.append(i);
        sbQ.append(", ad=");
        sbQ.append(this.i);
        return sbQ.toString();
    }
}
