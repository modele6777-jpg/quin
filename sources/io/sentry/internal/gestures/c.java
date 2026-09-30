package io.sentry.internal.gestures;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final WeakReference a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public c(Object obj, String str, String str2, String str3, String str4) {
        this.a = new WeakReference(obj);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.util.b.i(this.b, cVar.b) && io.sentry.util.b.i(this.c, cVar.c) && io.sentry.util.b.i(this.d, cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d});
    }
}
