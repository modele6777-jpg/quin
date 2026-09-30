package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mpd implements ng2, Iterable, zm7 {
    public final lpd a;
    public final int b;
    public final int c;

    public mpd(lpd lpdVar, int i, int i2) {
        this.a = lpdVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mpd)) {
            return false;
        }
        mpd mpdVar = (mpd) obj;
        return mpdVar.b == this.b && mpdVar.c == this.c && mpdVar.a == this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lpd lpdVar = this.a;
        if (lpdVar.v != this.c) {
            npd.e();
        }
        int i = this.b;
        lpdVar.k(i);
        return new ff6(lpdVar, i + 1, lpdVar.a[(i * 5) + 3] + i);
    }
}
