package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h41 extends p2 {
    public final /* synthetic */ int c = 1;
    public final Object d;

    public h41(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    s8f.c();
                    return null;
                }
                int i2 = this.a;
                this.a = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.a++;
                    return obj;
                }
                s8f.c();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    s8f.c();
                    return null;
                }
                int i2 = this.a - 1;
                this.a = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.a--;
                    return obj;
                }
                s8f.c();
                return null;
        }
    }

    public h41(int i, Object obj) {
        super(i, 1);
        this.d = obj;
    }
}
