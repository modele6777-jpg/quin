package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ow3 {
    public final ArrayList a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public ow3 f;
    public ow3 g;

    public ow3(ArrayList arrayList, char c, boolean z, boolean z2, ow3 ow3Var) {
        this.a = arrayList;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = ow3Var;
        this.c = arrayList.size();
    }

    public final List a(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(0, i);
        }
        qc0.j(ks0.k("length must be between 1 and ", arrayList.size(), ", was ", i));
        return null;
    }

    public final ime b() {
        return (ime) ks0.f(1, this.a);
    }

    public final List c(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i, arrayList.size());
        }
        qc0.j(ks0.k("length must be between 1 and ", arrayList.size(), ", was ", i));
        return null;
    }
}
