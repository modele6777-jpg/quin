package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h63 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h63(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(list.indexOf(((cod) obj).a.getKey())).compareTo(Integer.valueOf(list.indexOf(((cod) obj2).a.getKey())));
            default:
                return Integer.valueOf(list.indexOf(((ak3) obj).a.getKey())).compareTo(Integer.valueOf(list.indexOf(((ak3) obj2).a.getKey())));
        }
    }
}
