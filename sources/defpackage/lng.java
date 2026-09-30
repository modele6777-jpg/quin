package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lng implements vqg {
    public final boolean a;

    public lng(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return null;
    }

    @Override // defpackage.vqg
    public final String d() {
        return Boolean.toString(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lng) && this.a == ((lng) obj).a;
    }

    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new erg(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.vqg
    public final Double j() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.vqg
    public final vqg m() {
        return new lng(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
