package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class usa {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ vsa f;

    public usa(vsa vsaVar, List list) {
        this.f = vsaVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            l37.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
