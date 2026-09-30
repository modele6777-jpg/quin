package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public qa1(List list, int i, Throwable th) {
        this.a = 1;
        ok8.n(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                p90 p90Var = (p90) ((oid) obj).b;
                if (p90Var != null) {
                    p90Var.T(i2);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((ht4) arrayList.get(i3)).b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((ht4) arrayList.get(i3)).a();
                        i3++;
                    }
                }
                break;
            default:
                ((rhg) obj).b(i2);
                break;
        }
    }

    public /* synthetic */ qa1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
