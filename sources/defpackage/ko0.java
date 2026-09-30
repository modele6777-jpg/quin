package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 {
    public he1 b;
    public vx6 c;
    public vx6 d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final is4 j;
    public final is4 k;
    public he1 a = new om1();
    public final vx6 e = null;

    public ko0(Size size, int i, ArrayList arrayList, boolean z, is4 is4Var, is4 is4Var2) {
        if (size == null) {
            r82.g("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = is4Var;
        this.k = is4Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ko0) {
            ko0 ko0Var = (ko0) obj;
            return this.f.equals(ko0Var.f) && this.g == ko0Var.g && this.h.equals(ko0Var.h) && this.i == ko0Var.i && this.j == ko0Var.j && this.k == ko0Var.k;
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() ^ ((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 583896283) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
