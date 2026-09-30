package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bcc extends ccc implements Iterator {
    public acc a;
    public boolean b = true;
    public final /* synthetic */ dcc c;

    public bcc(dcc dccVar) {
        this.c = dccVar;
    }

    @Override // defpackage.ccc
    public final void a(acc accVar) {
        acc accVar2 = this.a;
        if (accVar == accVar2) {
            acc accVar3 = accVar2.d;
            this.a = accVar3;
            this.b = accVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        acc accVar = this.a;
        return (accVar == null || accVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            acc accVar = this.c.a;
            this.a = accVar;
            return accVar;
        }
        acc accVar2 = this.a;
        acc accVar3 = accVar2 != null ? accVar2.c : null;
        this.a = accVar3;
        return accVar3;
    }
}
