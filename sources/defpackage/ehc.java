package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ehc implements fw9 {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public rgc e = null;
    public rgc f = null;

    public ehc(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.fw9
    public final boolean w() {
        return this.b.contains(this);
    }
}
