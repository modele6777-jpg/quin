package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qia {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public qia(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia)) {
            return false;
        }
        qia qiaVar = (qia) obj;
        return kn2.E(this.a, qiaVar.a) && this.b == qiaVar.b && hl9.c(this.c, qiaVar.c) && hl9.c(this.d, qiaVar.d) && this.e == qiaVar.e && Float.compare(this.f, qiaVar.f) == 0 && this.g == qiaVar.g && this.h == qiaVar.h && this.i.equals(qiaVar.i) && hl9.c(this.j, qiaVar.j) && Float.compare(this.k, qiaVar.k) == 0 && hl9.c(this.l, qiaVar.l) && hl9.c(this.m, qiaVar.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + ib8.b(ub3.a(this.k, ib8.b((this.i.hashCode() + ub3.d(ub3.b(this.g, ub3.a(this.f, ub3.d(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        String strA0 = kn2.a0(this.a);
        String strI = hl9.i(this.c);
        String strI2 = hl9.i(this.d);
        String strA = xia.a(this.g);
        String strI3 = hl9.i(this.j);
        String strI4 = hl9.i(this.l);
        String strI5 = hl9.i(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strA0);
        sb.append(", uptime=");
        sb.append(this.b);
        ub3.v(sb, ", positionOnScreen=", strI, ", position=", strI2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strI3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strI4);
        return ib8.m(sb, ", originalEventPosition=", strI5, ")");
    }
}
