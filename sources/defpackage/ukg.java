package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ukg implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractSet c;

    public /* synthetic */ ukg(AbstractSet abstractSet, int i) {
        this.a = i;
        this.c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                vkg vkgVar = (vkg) abstractSet;
                return this.b < vkgVar.c() - vkgVar.a();
            default:
                return this.b < ((ihh) ((ed0) abstractSet).b).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                vkg vkgVar = (vkg) abstractSet;
                if (i2 >= vkgVar.c() - vkgVar.a()) {
                    s8f.c();
                    return null;
                }
                wkg wkgVar = vkgVar.b;
                Object obj = wkgVar.a[vkgVar.a() + i2];
                this.b = i2 + 1;
                return obj;
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                ihh ihhVar = (ihh) ((ed0) abstractSet).b;
                return ihhVar.d(ihhVar.d[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
