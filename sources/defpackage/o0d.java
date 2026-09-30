package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0d {
    public final u0d a;
    public final xb0 b;

    public o0d(u0d u0dVar, xb0 xb0Var) {
        this.a = u0dVar;
        this.b = xb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0d)) {
            return false;
        }
        o0d o0dVar = (o0d) obj;
        return this.a.equals(o0dVar.a) && this.b.equals(o0dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (u05.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + u05.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
