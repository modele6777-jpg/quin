package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1g implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((o1g) obj).b, ((o1g) obj2).b);
            default:
                return Integer.compare(((p1g) obj).a.b, ((p1g) obj2).a.b);
        }
    }
}
