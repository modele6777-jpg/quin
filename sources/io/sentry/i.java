package io.sentry;

import defpackage.s8f;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ j d;

    public i(j jVar) {
        this.d = jVar;
        this.a = jVar.b;
        this.c = jVar.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c || this.a != this.d.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        this.c = false;
        int i = this.a;
        this.b = i;
        j jVar = this.d;
        this.a = jVar.d(i);
        return jVar.a[this.b];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.b;
        if (i2 == -1) {
            com.adjust.sdk.sig.r3.l();
            return;
        }
        j jVar = this.d;
        int i3 = jVar.b;
        if (i2 == i3) {
            jVar.remove();
            this.b = -1;
            return;
        }
        int iD = i2 + 1;
        if (i3 >= i2 || iD >= (i = jVar.c)) {
            while (iD != jVar.c) {
                int i4 = jVar.maxElements;
                Object[] objArr = jVar.a;
                if (iD >= i4) {
                    objArr[iD - 1] = objArr[0];
                    iD = 0;
                } else {
                    objArr[jVar.c(iD)] = jVar.a[iD];
                    iD = jVar.d(iD);
                }
            }
        } else {
            Object[] objArr2 = jVar.a;
            System.arraycopy(objArr2, iD, objArr2, i2, i - iD);
        }
        this.b = -1;
        int iC = jVar.c(jVar.c);
        jVar.c = iC;
        jVar.a[iC] = null;
        jVar.d = false;
        this.a = jVar.c(this.a);
    }
}
