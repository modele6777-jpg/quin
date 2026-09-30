package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class td0 implements cyc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ td0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new l2((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new h68(this);
            case 3:
                return dec.i((l26) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new hyc(0, obj);
            default:
                return new g68((CharSequence) obj);
        }
    }
}
