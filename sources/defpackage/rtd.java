package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rtd implements ng2, Iterable, zm7 {
    public final lpd a;
    public final int b;
    public final lpb c;

    public rtd(lpd lpdVar, int i, n46 n46Var, lpb lpbVar) {
        this.a = lpdVar;
        this.b = i;
        this.c = lpbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rtd)) {
            return false;
        }
        rtd rtdVar = (rtd) obj;
        return rtdVar.b == this.b && rtdVar.a == this.a && rtdVar.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qtd(this.a, this.b, null, this.c);
    }
}
