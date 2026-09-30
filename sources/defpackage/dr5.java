package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dr5 {
    public final int a;
    public final List b;

    public dr5() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public dr5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public dr5(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
