package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zbc extends ccc implements Iterator {
    public acc a;
    public acc b;

    @Override // defpackage.ccc
    public final void a(acc accVar) {
        acc accVar2 = this.a;
        acc accVar3 = null;
        if (accVar2 == accVar && accVar == this.b) {
            this.b = null;
            this.a = null;
            accVar2 = null;
        }
        acc accVar4 = accVar2;
        if (accVar2 == accVar) {
            accVar4 = accVar2.d;
            this.a = accVar4;
        }
        acc accVar5 = this.b;
        if (accVar5 == accVar) {
            if (accVar5 != accVar4 && accVar4 != null) {
                accVar3 = accVar5.c;
            }
            this.b = accVar3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        acc accVar = this.b;
        acc accVar2 = this.a;
        this.b = (accVar == accVar2 || accVar2 == null) ? null : accVar.c;
        return accVar;
    }
}
