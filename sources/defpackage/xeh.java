package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xeh {
    public final yob a;
    public final yob b;
    public final UUID c;

    public xeh(yob yobVar, yob yobVar2, UUID uuid) {
        this.a = yobVar;
        this.b = yobVar2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xeh)) {
            return false;
        }
        xeh xehVar = (xeh) obj;
        return this.a.equals(xehVar.a) && this.b.equals(xehVar.b) && this.c.equals(xehVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
