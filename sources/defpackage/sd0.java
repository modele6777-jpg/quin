package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sd0 implements Iterable, zm7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sd0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new l2(objArr);
            case 1:
                return new iq4((Iterator) ((x16) obj).invoke());
            case 2:
                return ((cyc) obj).iterator();
            default:
                return new l2((kx4) obj);
        }
    }
}
