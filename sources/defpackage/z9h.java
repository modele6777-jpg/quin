package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z9h {
    public final String a;
    public final boolean b;

    public z9h(String str, boolean z) {
        oa7.x(str);
        this.a = str;
        oa7.x("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9h)) {
            return false;
        }
        z9h z9hVar = (z9h) obj;
        return ym8.w(this.a, z9hVar.a) && ym8.w("com.google.android.gms", "com.google.android.gms") && ym8.w(null, null) && this.b == z9hVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        oa7.A(null);
        throw null;
    }
}
