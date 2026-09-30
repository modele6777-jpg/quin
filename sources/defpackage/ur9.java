package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ur9 {
    public final Object a;

    public ur9(Object obj) {
        if (obj != null) {
            this.a = obj;
        } else {
            r82.g("value for optional is empty.");
            throw null;
        }
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        r3.n("No value present");
        return null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public ur9() {
        this.a = null;
    }
}
