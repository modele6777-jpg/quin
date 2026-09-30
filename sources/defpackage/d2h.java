package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2h extends r2h {
    public final boolean a;

    public d2h(boolean z) {
        this.a = z;
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r2h r2hVar = (r2h) obj;
        int iA = r2hVar.a();
        int iD = r2h.d((byte) -32);
        if (iD != iA) {
            return iD - r2hVar.a();
        }
        return (true != this.a ? 20 : 21) - (true != ((d2h) r2hVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d2h.class == obj.getClass() && this.a == ((d2h) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(r2h.d((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
