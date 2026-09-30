package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class una implements Comparable {
    public final int a;
    public final int b;

    public una(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        una unaVar = (una) obj;
        int iCompare = Integer.compare(this.a, unaVar.a);
        return iCompare != 0 ? iCompare : Integer.compare(this.b, unaVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof una)) {
            return false;
        }
        una unaVar = (una) obj;
        return this.a == unaVar.a && this.b == unaVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
