package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tqg implements vqg {
    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.FALSE;
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return null;
    }

    @Override // defpackage.vqg
    public final String d() {
        return "null";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof tqg;
    }

    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.vqg
    public final Double j() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.vqg
    public final vqg m() {
        return vqg.w0;
    }
}
