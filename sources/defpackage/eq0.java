package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 {
    public final lu3 a;
    public final List b;
    public final int c;
    public final int d;
    public final qr4 e;

    public eq0(lu3 lu3Var, List list, int i, int i2, qr4 qr4Var) {
        this.a = lu3Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = qr4Var;
    }

    public static a82 a(lu3 lu3Var) {
        a82 a82Var = new a82(3);
        if (lu3Var == null) {
            r82.g("Null surface");
            return null;
        }
        a82Var.c = lu3Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            r82.g("Null sharedSurfaces");
            return null;
        }
        a82Var.d = list;
        a82Var.b = -1;
        a82Var.e = -1;
        a82Var.f = qr4.d;
        return a82Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        return this.a.equals(eq0Var.a) && this.b.equals(eq0Var.b) && this.c == eq0Var.c && this.d == eq0Var.d && this.e.equals(eq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
