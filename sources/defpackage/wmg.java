package defpackage;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wmg extends AbstractList {
    public final umg a;
    public final vmg b;

    public wmg(umg umgVar, vmg vmgVar) {
        this.a = umgVar;
        this.b = vmgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iD = ((pmg) this.a).d(i);
        ((pwg) this.b).getClass();
        mlg mlgVarA = mlg.a(iD);
        return mlgVarA == null ? mlg.UNKNOWN : mlgVarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((pmg) this.a).c;
    }
}
