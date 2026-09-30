package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2h extends r2h {
    public final String a;

    public m2h(String str) {
        this.a = str;
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r2h r2hVar = (r2h) obj;
        int iA = r2hVar.a();
        int iD = r2h.d((byte) 96);
        if (iD != iA) {
            return iD - r2hVar.a();
        }
        String str = ((m2h) r2hVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2h.class == obj.getClass()) {
            return this.a.equals(((m2h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(r2h.d((byte) 96)), this.a});
    }

    public final String toString() {
        return ks0.l(new StringBuilder("\""), this.a, "\"");
    }
}
