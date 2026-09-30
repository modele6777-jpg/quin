package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vtd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vtd(int i, int i2, int i3, int i4) {
        if (i < 0) {
            qc0.j(tec.f(i, "lineIndex ", " must be >= 0"));
            throw null;
        }
        if (i2 < 0) {
            qc0.j(tec.f(i2, "columnIndex ", " must be >= 0"));
            throw null;
        }
        if (i3 < 0) {
            qc0.j(tec.f(i3, "inputIndex ", " must be >= 0"));
            throw null;
        }
        if (i4 < 0) {
            qc0.j(tec.f(i4, "length ", " must be >= 0"));
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final vtd a(int i, int i2) {
        if (i < 0) {
            r3.i(tec.f(i, "beginIndex ", " + must be >= 0"));
            return null;
        }
        int i3 = this.d;
        if (i > i3) {
            r3.i(ks0.k("beginIndex ", i, " must be <= length ", i3));
            return null;
        }
        if (i2 < 0) {
            r3.i(tec.f(i2, "endIndex ", " + must be >= 0"));
            return null;
        }
        if (i2 > i3) {
            r3.i(ks0.k("endIndex ", i2, " must be <= length ", i3));
            return null;
        }
        if (i > i2) {
            r3.i(ks0.k("beginIndex ", i, " must be <= endIndex ", i2));
            return null;
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new vtd(this.a, this.b + i, this.c + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vtd.class == obj.getClass()) {
            vtd vtdVar = (vtd) obj;
            if (this.a == vtdVar.a && this.b == vtdVar.b && this.c == vtdVar.c && this.d == vtdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "SourceSpan{line=", ", column=", ", input=");
        sbN.append(this.c);
        sbN.append(", length=");
        sbN.append(this.d);
        sbN.append("}");
        return sbN.toString();
    }
}
