package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i1f {
    public static final i1f d = new i1f(new h1f[0]);
    public final int a;
    public final yob b;
    public int c;

    static {
        pqf.D(0);
    }

    public i1f(h1f... h1fVarArr) {
        yob yobVarP = jy6.p(h1fVarArr);
        this.b = yobVarP;
        this.a = h1fVarArr.length;
        int i = 0;
        while (i < yobVarP.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < yobVarP.d; i3++) {
                if (((h1f) yobVarP.get(i)).equals(yobVarP.get(i3))) {
                    xo1.y("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final h1f a(int i) {
        return (h1f) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1f.class != obj.getClass()) {
            return false;
        }
        i1f i1fVar = (i1f) obj;
        return this.a == i1fVar.a && this.b.equals(i1fVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
