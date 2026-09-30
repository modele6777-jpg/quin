package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 {
    public final ArrayList a;
    public final ep0 b;

    public jg1(ArrayList arrayList, ep0 ep0Var) {
        this.a = arrayList;
        this.b = ep0Var;
        ok8.k("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        ok8.o("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) s72.v0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return this.a.equals(jg1Var.a) && pa7.t(this.b, jg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ep0 ep0Var = this.b;
        return iHashCode + (ep0Var != null ? ep0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(s72.D0(this.a, ",", null, null, null, 62));
        ep0 ep0Var = this.b;
        if (ep0Var != null) {
            str = ", compatId=" + ep0Var;
        } else {
            str = "";
        }
        return ub3.l(sb, str, '}');
    }
}
