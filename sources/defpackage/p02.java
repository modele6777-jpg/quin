package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 implements Comparator {
    public final /* synthetic */ float a;

    public p02(float f) {
        this.a = f;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = -((Number) obj).intValue();
        float f2 = this.a;
        return Float.valueOf(q02.d((f * f2) - 80.0f)).compareTo(Float.valueOf(q02.d(((-((Number) obj2).intValue()) * f2) - 80.0f)));
    }
}
