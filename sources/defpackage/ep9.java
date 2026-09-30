package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep9 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ep9(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(arrayList.size());
            case 1:
                if (arrayList.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((lhb) it.next()).c.getValue()).booleanValue()) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return ((yn7) arrayList.get(0)).B();
        }
    }
}
