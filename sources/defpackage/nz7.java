package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nz7 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;

    public /* synthetic */ nz7(os osVar, int i) {
        this.a = i;
        this.b = osVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        os osVar = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(osVar.h(((vz7) obj).getKey())).compareTo(Integer.valueOf(osVar.h(((vz7) obj2).getKey())));
            case 1:
                return Integer.valueOf(osVar.h(((vz7) obj).getKey())).compareTo(Integer.valueOf(osVar.h(((vz7) obj2).getKey())));
            case 2:
                return Integer.valueOf(osVar.h(((vz7) obj2).getKey())).compareTo(Integer.valueOf(osVar.h(((vz7) obj).getKey())));
            default:
                return Integer.valueOf(osVar.h(((vz7) obj2).getKey())).compareTo(Integer.valueOf(osVar.h(((vz7) obj).getKey())));
        }
    }
}
