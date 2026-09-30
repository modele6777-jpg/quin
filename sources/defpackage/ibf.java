package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ibf {
    public final int a;
    public final jsd b;
    public final jsd c;

    public ibf(List list, List list2, int i) {
        this.a = i;
        if (!(i >= 0)) {
            l37.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            l37.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        jsd jsdVar = new jsd();
        jsdVar.addAll(list);
        this.b = jsdVar;
        jsd jsdVar2 = new jsd();
        jsdVar2.addAll(list2);
        this.c = jsdVar2;
    }
}
