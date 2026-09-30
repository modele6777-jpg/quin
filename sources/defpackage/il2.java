package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class il2 {
    public final Uri a;
    public final boolean b;

    public il2(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!il2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        il2 il2Var = (il2) obj;
        return this.a.equals(il2Var.a) && this.b == il2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
