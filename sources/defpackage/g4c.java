package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g4c extends l4c {
    public static final zte e;
    public final String d;

    static {
        long j = y72.g;
        e = new zte(new xtd(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), new xtd(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.c, null, 61438), 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4c(String str) {
        super(null);
        str.getClass();
        this.d = str;
    }

    @Override // defpackage.l4c
    public final Object a(n4c n4cVar) {
        return new k68(this.d, n4cVar.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g4c) {
            return pa7.t(this.d, ((g4c) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }

    public final String toString() {
        return ib8.j("Link(destination='", this.d, "', linkInteractionListener=null)");
    }
}
