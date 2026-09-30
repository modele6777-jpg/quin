package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ykg {
    public static final kv8 b = new kv8(23);
    public static final ykg c;
    public final wkg a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new ykg(new wkg());
    }

    public ykg(wkg wkgVar) {
        this.a = wkgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ykg) && ((ykg) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
