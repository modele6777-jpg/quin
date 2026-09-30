package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gx1 implements c62, Iterable, zm7 {
    public final char a;
    public final char b;

    static {
        new gx1((char) 1, (char) 0);
    }

    public gx1(char c, char c2) {
        this.a = c;
        this.b = (char) z7f.G(c, c2, 1);
    }

    @Override // defpackage.c62
    public final Comparable c() {
        return Character.valueOf(this.a);
    }

    @Override // defpackage.c62
    public final Comparable d() {
        return Character.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gx1)) {
            return false;
        }
        if (isEmpty() && ((gx1) obj).isEmpty()) {
            return true;
        }
        gx1 gx1Var = (gx1) obj;
        return this.a == gx1Var.a && this.b == gx1Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.c62
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fx1(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
